package oopIntro;

public class Product {
	
	public Product() {
		System.out.println("deneme");
	}
	
	public Product(int id, String name, double unitPrice, String detail) {  //constructor
		
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail; //this, bu class'�n detail'i (public class product)
	}
	//�zellik tutan class
	int id;
	String name;
	double unitPrice;
	String detail;
	
}
