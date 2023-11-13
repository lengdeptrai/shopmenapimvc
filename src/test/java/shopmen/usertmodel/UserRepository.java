package shopmen.usertmodel;

import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<UserShopMen, Long>{
	UserShopMen findByUserName(String name);
}
