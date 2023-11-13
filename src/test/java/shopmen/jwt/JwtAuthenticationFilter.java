//package shopmen.jwt;
//
//import java.io.IOException;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
//import org.springframework.util.StringUtils;
//import org.springframework.web.filter.OncePerRequestFilter;
//
//import jakarta.servlet.FilterChain;
//import jakarta.servlet.ServletException;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import shopmen.usertmodel.UserService;
//
//public class JwtAuthenticationFilter extends OncePerRequestFilter {
//	@Autowired
//    private AuthenticationManager authenticationManager;
//	@Autowired
//	private JwtTokenProvider tokenProvider;
//	private static final Logger logger = LoggerFactory.getLogger(JwtAuthenticationFilter.class);
//
//	@Autowired
//	private UserService customUserDetailsService;
//
//	@Override
//	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
//			throws ServletException, IOException {
//				try {
//					String jwt = getJwtFromRequest(request);
//			
//					if (StringUtils.hasText(jwt) && tokenProvider.validateToken(jwt)) {
//						Long userId = tokenProvider.getUserIdFromJWT(jwt);
//						UserDetails userDetails = customUserDetailsService.loadUserByIdentifier(userId);
//						if (userDetails != null) {
//							UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(
//									userDetails, null, userDetails.getAuthorities());
//							authentication.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
//							SecurityContextHolder.getContext().setAuthentication(authentication);
//						}
//						else {
//							System.out.println(userDetails);
//						}
//					}
//				} catch (Exception ex) {
//					logger.error("failed on set user authentication", ex);
//				}
//		
//		filterChain.doFilter(request, response);
//	}
//
//	private String getJwtFromRequest(HttpServletRequest request) {
//
//		String bearerToken = request.getHeader("Authorization");
////         Kiểm tra xem header Authorization có chứa thông tin jwt không
//		if (StringUtils.hasText(bearerToken) && bearerToken.startsWith("Bearer ")) {
//			return bearerToken.substring(7);
//		}
//		return null;
//	}
//
//}
