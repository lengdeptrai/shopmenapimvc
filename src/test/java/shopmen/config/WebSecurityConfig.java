//package shopmen.config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.http.SessionCreationPolicy;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.web.SecurityFilterChain;
//import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
//
//import shopmen.jwt.JwtAuthenticationFilter;
//import shopmen.usertmodel.UserService;
//
//@Configuration
//@EnableWebSecurity
//public class WebSecurityConfig {
//	@Autowired
//	UserService userService;
//	AuthenticationConfiguration configuration;
//
//	@Bean
//	public JwtAuthenticationFilter jwtAuthenticationFilter() {
//		return new JwtAuthenticationFilter();
//	}
//
//	@Autowired
//	void configure(AuthenticationManagerBuilder builder) throws Exception {
//
//		builder.userDetailsService(userService).passwordEncoder(new BCryptPasswordEncoder());
//	}
//
//	@Bean
//	public PasswordEncoder passwordEncoder() {
//		// Password encoder, để Spring Security sử dụng mã hóa mật khẩu người dùng
//		return new BCryptPasswordEncoder();
//	}
//
//	@Bean
//	public AuthenticationManager authenticationManager(AuthenticationConfiguration configuration) throws Exception {
//		return configuration.getAuthenticationManager();
//	}
//
//	@SuppressWarnings("deprecation")
//	@Bean
//	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//
////
////		 http.cors().and().csrf().disable()
////         .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
////         .and()
////         .httpBasic()
////         .and()
////         .authorizeRequests()
////         .requestMatchers("/authenticate").permitAll() // Allow public access to authentication endpoint
////         .requestMatchers(HttpMethod.POST).hasRole("USER")
////         .requestMatchers("/login").anonymous()
////         .anyRequest().authenticated();
//		http
//    	.cors().and().csrf().disable()
//        .sessionManagement()
//        .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
//        .and()
//        .httpBasic()
//        .and()
//        .authorizeHttpRequests(authorize -> authorize
//        		.requestMatchers("/authenticate").permitAll() 
//        		.requestMatchers(HttpMethod.POST).hasRole("USER") 
//        		.requestMatchers("/login").anonymous()
//				.anyRequest().authenticated()                      
//			);
//
//     http.addFilterBefore(jwtAuthenticationFilter(), UsernamePasswordAuthenticationFilter.class);
//     return http.build();
//
//	}
//}
