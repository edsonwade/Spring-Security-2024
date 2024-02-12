package code.with.vanilson.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class BankManagementConfig {

    @Bean
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests()
                .requestMatchers("/api/balance", "/api/accounts", "api/cards", "api/loans").authenticated()
                .requestMatchers("/api/contacts", "/api/notices").permitAll()
                .and()
                .formLogin()
                .and()
                .httpBasic();
        return http.build();

    }
}
