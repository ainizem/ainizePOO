package model;

public class Cliente {

	public String nombre;
	public double saldo;

	public Cliente(String nombre, double saldo) {
		super();
		this.nombre = nombre;
		this.saldo = saldo;
	}

	// Metodos

	public void comprar(Producto p, Vendedor v) {
		// cliente tiene dinero?
		if (this.saldo > p.precio) {
			System.out.println(this.nombre + "compra " + p.nombre + "a " + p.precio);
			this.saldo -= p.precio;
		}
	}
}
