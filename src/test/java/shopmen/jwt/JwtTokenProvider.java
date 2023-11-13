//package shopmen.jwt;
//
//
//
//
//import java.time.LocalDate;
//import java.util.Date;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.stereotype.Component;
//
//import io.jsonwebtoken.Claims;
//import io.jsonwebtoken.ExpiredJwtException;
//import io.jsonwebtoken.Jwts;
//import io.jsonwebtoken.MalformedJwtException;
//import io.jsonwebtoken.SignatureAlgorithm;
//import io.jsonwebtoken.UnsupportedJwtException;
//import shopmen.usertmodel.CustomUserDetails;
//
//
//@Component
//public class JwtTokenProvider {
//	private final String key = "shopmen";
//    private final long JWT_EXPIRATION = 604800000L;
//    
//    private static final Logger logger = LoggerFactory.getLogger(JwtTokenProvider.class);
//
//    @SuppressWarnings("deprecation")
//	public String generateToken(CustomUserDetails userDetails) {
//        
//    	// Lấy thông tin user
//    	Date now = new Date(Long.parseLong(LocalDate.now().toString()));
//        Date expiryDate = new Date(now.getTime() + JWT_EXPIRATION);
//        
//        System.out.println("userDetails.getUser().getId():"+userDetails.getUser().getId());
//        String jwt="";
//        try {
//        
//         jwt = Jwts.builder()
//                .setSubject(Long.toString(userDetails.getUser().getId()))
//                .setIssuedAt(now)
//                .setExpiration(expiryDate)
//                .signWith(SignatureAlgorithm.HS256, key)
//                .compact();
//        }catch(Exception ex)
//        {
//        	System.out.println("Lỗi xảy ra:"+ex.getMessage());
//        }
//        
//        // Tạo chuỗi json web token từ id của user.
//        return jwt;
//    }
//    
//    
//    
//    
//
//    public Long getUserIdFromJWT(String token) {
//    	
//    	System.out.println("--------------getUserIdFromJWT-------------");
//    	
//        @SuppressWarnings("deprecation")
//		Claims claims = Jwts.parser()
//                            .setSigningKey(key)
//                            .parseClaimsJws(token)
//                            .getBody();
//        String subject= claims.getSubject();
//        System.out.println("subject:"+subject);
//        return Long.parseLong(claims.getSubject());
//    }
//
//    @SuppressWarnings("deprecation")
//	public boolean validateToken(String authToken) {
//    	System.out.println("--------------validateToken-------------");
//    	System.out.println("authToken:"+authToken);
//    	
//    	try {
//            Jwts.parser().setSigningKey(key).parseClaimsJws(authToken);
//            return true;
//        } catch (MalformedJwtException ex) {
//           
//        	logger.error("Invalid JWT token");
//        } catch (ExpiredJwtException ex) {
//        	logger.error("Expired JWT token");
//        } catch (UnsupportedJwtException ex) {
//        	logger.error("Unsupported JWT token");
//        } catch (IllegalArgumentException ex) {
//        	logger.error("JWT claims string is empty.");
//        }
//
//    	
//    	System.out.println("--------------ket quả-------------false");
//        return false;
//    }
//}
