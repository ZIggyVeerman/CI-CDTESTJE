package com.darwin.cicdtestje.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.CallableStatement;
import java.sql.Types;

@Service
public class plsqlTest {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public plsqlTest(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Transactional
    public String callExampleFunction(String input) {
        return jdbcTemplate.execute(
                connection -> {
                    CallableStatement cs = connection.prepareCall("{ ? = call SIMPLE_PACKAGE.example_function(?) }");
                    cs.registerOutParameter(1, Types.VARCHAR);
                    cs.setString(2, input);
                    return cs;
                },
                (CallableStatement cs) -> {
                    cs.execute();
                    return cs.getString(1);
                }
        );
    }
}
