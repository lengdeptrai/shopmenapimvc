//package shopmen.usertmodel;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//
//@Service
//public class UserService implements UserDetailsService{
//
//	@Autowired
//    private UserRepository userJPA;
//	
//	@Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//		System.out.println("loadUserByUsername Services su dung UserService");
//        // Kiểm tra xem user có tồn tại trong database không?
//		UserShopMen user = userJPA.findByUserName(username);
//		System.out.println(user.getUserName()+"---"+user.getPassword());
//        if (user == null) 
//        throw new UsernameNotFoundException("User not found with username: " + username);
//        return new CustomUserDetails(user);
//    }
//	
//	 // JWTAuthenticationFilter sẽ sử dụng hàm này
//    @Transactional
//	public UserDetails loadUserByIdentifier(Long id) {
//    	UserShopMen user = userJPA.findById(id).orElseThrow(
//                () -> new UsernameNotFoundException("User not found with id : " + id)
//        );
//
//        return new CustomUserDetails(user);
//    }
//}
