package model;

public class ClienteOro extends Cliente {
	int descuento = 15;

	public ClienteOro(String nombre, double saldo, int descuento) {
		super(nombre, saldo);
	}

	@Override
	public void comprar(Producto p, Vendedor v) {
		Producto pRebajado = new Producto (p.nombre, p.precio * 0.85);
		super.comprar(pRebajado, v);
	}

}
