package oopIntro;

public class ProductManager { //ürünü ilgilendiren methodlar burada
	public void addToCart(Product product) {
		System.out.println("Sepete eklendi :" + product.name);
	}
}
