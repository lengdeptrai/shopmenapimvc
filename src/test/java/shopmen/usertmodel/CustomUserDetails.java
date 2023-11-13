//package shopmen.usertmodel;
//
//import java.util.Collection;
//import java.util.Collections;
//
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//
//public class CustomUserDetails implements UserDetails{
//	private final long serialVersionUID = 1L;
//	CustomUserDetailsData data ;
//	
//	public CustomUserDetails(CustomUserDetailsData data) {
//		super();
//		this.data = data;
//	}
//
//	public CustomUserDetails(UserShopMen user) {
//		this.data.user = user;
//	}
//
//	@Override
//	public Collection<? extends GrantedAuthority> getAuthorities() {
//		// TODO Auto-generated method stub
//		return Collections.singleton(new SimpleGrantedAuthority("USER"));
//	}
//	
//    @Override
//    public boolean isAccountNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isAccountNonLocked() {
//        return true;
//    }
//
//    @Override
//    public boolean isCredentialsNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isEnabled() {
//        return true;
//    }
//    
//    public UserShopMen getUser() {
//    	return data.user;
//    }
//    
//    @Override
//    public String getUsername() {
//        return data.user != null ? data.user.getUserName() : null;
//    }
//
//	@Override
//	public String getPassword() {
//        return data.user != null ? data.user.getPassword() : null;
//	}
//	
//}
