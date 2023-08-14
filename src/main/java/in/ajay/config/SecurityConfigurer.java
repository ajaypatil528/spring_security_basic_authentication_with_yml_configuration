package in.ajay.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;



@Configuration
@EnableWebSecurity
public class SecurityConfigurer {
	
	//private User user;
	//AuthenticationManager;

	@Bean
	public SecurityFilterChain securityFilter(HttpSecurity httpSecurity) throws Exception {
		
		System.out.println("Security Filter called....");
        //logic to customize security
        
        httpSecurity.authorizeHttpRequests((req) ->
                req.antMatchers("/contact", "/hi", "/logincheck", "/swagger-ui.html")
                        .permitAll()
                        .anyRequest()
                        .authenticated()
        ).formLogin(withDefaults());
		
		
		
		return httpSecurity.build();
		
	}
}
