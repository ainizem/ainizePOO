package view;

import model.Cliente;
import model.ClienteOro;
import model.Producto;
import model.Vendedor;
public class App {

	public static void main(String[] args) {
		Producto p1 = new Producto ("Pan", 1); 
		
		Vendedor v1 = new Vendedor("Ander", 0);
		
		Cliente c1 = new Cliente("Ainize", 10); 
		ClienteOro cO1 = new ClienteOro("Oihane", 5.4, 15);
		
		c1.comprar (p1, v1);
		cO1.comprar(p1, v1);
		
	}

}
