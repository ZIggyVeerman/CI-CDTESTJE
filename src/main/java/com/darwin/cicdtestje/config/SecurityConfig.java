package config;

//import com.darwin.backendjava.filter.JwtAuthenticationFilter;
//import com.darwin.backendjava.filter.JwtAuthorizationFilter;
//import com.darwin.backendjava.service.AuthenticationService;
//import com.darwin.backendjava.util.JwtUtil;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import java.util.Arrays;

@Configuration
@EnableWebSecurity
//@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .csrf().disable()
                .cors()
                .and()
                .authorizeRequests()
                .anyRequest().permitAll();
        return http.build();
    }

    @Bean
    public CorsConfigurationSource corsConfigurationSource() {
        CorsConfiguration configuration = new CorsConfiguration();
        configuration.setAllowedOrigins(Arrays.asList("*")); // Allow any origin
        configuration.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "DELETE", "OPTIONS"));
        configuration.setAllowedHeaders(Arrays.asList("Content-Type", "Authorization", "Cache-Control", "DNT", "User-Agent", "Keep-Alive", "X-Requested-With", "If-Modified-Since", "Cache-Control", "Range"));
        configuration.setExposedHeaders(Arrays.asList("Content-Length", "Content-Range"));

        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/api/**", configuration);

        return source;
    }
}
//
//
//    private final AuthenticationService authenticationService;
//    private final JwtUtil jwtUtil;
//    private final AuthenticationManager authenticationManager;
//
//    @Autowired
//    public SecurityConfig(@Lazy AuthenticationService authenticationService, JwtUtil jwtUtil, AuthenticationConfiguration authenticationConfiguration) throws Exception {
//        this.authenticationService = authenticationService;
//        this.jwtUtil = jwtUtil;
//        this.authenticationManager = authenticationConfiguration.getAuthenticationManager();
//    }
//
//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
//
//    @Bean
//    public JwtAuthenticationFilter jwtAuthenticationFilter() {
//        return new JwtAuthenticationFilter(authenticationManager, jwtUtil);
//    }
//
//    @Bean
//    public JwtAuthorizationFilter jwtAuthorizationFilter() {
//        return new JwtAuthorizationFilter(authenticationManager, jwtUtil);
//    }
//
//    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//        http
//                .authorizeHttpRequests(req -> req
//                        .requestMatchers("/api/v1/login").authenticated()
//                        .anyRequest().authenticated())
//                .csrf()
//                .disable()
//                .sessionManagement()
//                .sessionCreationPolicy(SessionCreationPolicy.STATELESS);
//
//        http.addFilterBefore(jwtAuthenticationFilter(), UsernamePasswordAuthenticationFilter.class);
//        http.addFilterAfter(jwtAuthorizationFilter(), JwtAuthenticationFilter.class);
//
//        return http.build();
//    }
//}


