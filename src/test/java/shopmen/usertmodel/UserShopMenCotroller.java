package shopmen.usertmodel;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class UserShopMenCotroller {
	@Autowired
	UserRepository jpa; 
	
	
	@PostMapping("/users/insertUser")
	public String insertProduct(@RequestBody  UserShopMen user)
	{
		
		try
		{
			jpa.save(user);
			return "Da thanh cong";
			
		}catch(Exception ex)
		{
			return "Loi khong thanh cong:"+ex.getMessage();
		}
	}
	
	@PutMapping("/users/updateUser")
	public String UpdateStudent(@RequestBody   UserShopMen user)
	{
		try {
			jpa.save(user);
			return "Sửa thành công!";
			
		}
		catch(Exception ex)
		{
			return "Bị lỗi:"+ex.getMessage();
			
		}
		
	}
	
}
