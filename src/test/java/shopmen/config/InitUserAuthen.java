//package shopmen.config;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.ApplicationArguments;
//import org.springframework.boot.ApplicationRunner;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Component;
//
//import shopmen.usertmodel.UserRepository;
//import shopmen.usertmodel.UserShopMen;
//
//
//
//@Component
//public class InitUserAuthen implements ApplicationRunner{
//	public static final Logger logger = LoggerFactory.getLogger(InitUserAuthen.class);
//	@Autowired
//    UserRepository userJPA;
//    @Autowired
//    PasswordEncoder passwordEncoder;
//    @Override
//    public void run(ApplicationArguments args) throws Exception {
//
//		System.out.println("TAO USER");
//    	UserShopMen admin = new UserShopMen();
//		admin.setAddress(null);
//		admin.setFullName("Admin");
//		admin.setEmail(null);
//		admin.setPhoneNumber(null);
//    	admin.setUserName("shopmen");
//    	admin.setPassword(passwordEncoder.encode("02042003aA"));
//		System.out.println("username = "+admin.getUserName() +" pass =" + admin.getPassword());
//    	logger.info("insert user:"+ userJPA.save(admin));
//		System.out.println("END"); 
//    	
//    }
//}
