						package shopmen.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import shopmen.productmodel.Product;
import shopmen.productmodel.ProductJPA;


@RestController
public class ProductController {
	
	@Autowired
	ProductJPA jpa;
	
	@GetMapping("/products/listProduct")
	public List<Product> listProduct()
	{
		return jpa.findAll();
		
	}
	
	@PostMapping("/products/insertProduct")
	public String insertProduct(@RequestBody  Product p)
	{
		
		try
		{
			jpa.save(p);
			return "Da thanh cong";
			
		}catch(Exception ex)
		{
			return "Loi khong thanh cong:"+ex.getMessage();
		}
	}
	
	@PutMapping("/products/updateProduct")
	public String UpdateStudent(@RequestBody   Product p)
	{
		try {
			jpa.save(p);
			return "Sửa thành công!";
			
		}
		catch(Exception ex)
		{
			return "Bị lỗi:"+ex.getMessage();
			
		}
		
	}
	
	@DeleteMapping("/products/deleteProduct/{id}")
	public String deleteStudent(@PathVariable Long id)
	{
		try {
			jpa.deleteById(id);
			return "Xóa thành công!";
			
		}
		catch(Exception ex)
		{
			return "Bị lỗi:"+ex.getMessage();
			
		}
	}
}
