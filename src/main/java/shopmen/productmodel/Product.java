package shopmen.productmodel;

import java.util.ArrayList;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {
	
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long id; // Mã sản phẩm
	public Product(String name, String brand, String category, int price, ArrayList<String> color,
			ArrayList<Integer> size, String material, String description, ArrayList<String> urlImages, float rating,
			long reviews, ArrayList<Long> inventoryNumber, ArrayList<Long> relatedProducts) {
		super();
		this.name = name;
		this.brand = brand;
		this.category = category;
		this.price = price;
		this.color = color;
		this.size = size;
		this.material = material;
		this.description = description;
		this.urlImages = urlImages;
		this.rating = rating;
		this.reviews = reviews;
		this.inventoryNumber = inventoryNumber;
		this.relatedProducts = relatedProducts;
	}
	public ArrayList<String> getColor() {
		return color;
	}
	public void setColor(ArrayList<String> color) {
		this.color = color;
	}
	public ArrayList<Long> getInventoryNumber() {
		return inventoryNumber;
	}
	public void setInventoryNumber(ArrayList<Long> inventoryNumber) {
		this.inventoryNumber = inventoryNumber;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public ArrayList<Integer> getSize() {
		return size;
	}
	public void setSize(ArrayList<Integer> size) {
		this.size = size;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public ArrayList<String> getUrlImages() {
		return urlImages;
	}
	public void setUrlImages(ArrayList<String> urlImages) {
		this.urlImages = urlImages;
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	public long getReviews() {
		return reviews;
	}
	public void setReviews(long reviews) {
		this.reviews = reviews;
	}
	public ArrayList<Long> getRelatedProducts() {
		return relatedProducts;
	}
	public void setRelatedProducts(ArrayList<Long> relatedProducts) {
		this.relatedProducts = relatedProducts;
	}
	private String name; // Tên sản phẩm
	private String brand; // Thương hiệu
	private String category; // Loại sản phẩm
	private int price ; // Giá sản phẩm
	private ArrayList<String> color = new ArrayList<String>(); //Màu sắc
	private ArrayList<Integer> size = new ArrayList<Integer>() ; // Kích thước (có thể có nhiều kích thước)
	private String material; //Chất liệu
	private String description; //Mô tả
	private ArrayList<String> urlImages = new ArrayList<String>();
	private float rating; // Đánh giá sản phẩm
	private long reviews ; // Số lượng đánh giá
	private ArrayList<Long> inventoryNumber = new ArrayList<Long>() ; //Số luọng tồn kho
	private ArrayList<Long> relatedProducts = new ArrayList<Long>(); //Sản phẩm tương tự
	
}
