

public class Main {

	public static void main(String[] args) {
		
		final String nombre_Empresa =  "Distribuidora TupperWare";
		
		double precioUnitario = 35;// Q45.00
		int cantidadTotal_Producto = 200;
		double totalDePago = precioUnitario*cantidadTotal_Producto;
		final double precioDeVenta = 50; 
		final double IVA = 0.12; //12%
		double IVA_DelProductoUnitario = precioDeVenta*IVA;
		
		System.out.println("------------------------------------");
		System.out.println(" Información que el usuario necesita\n es la siguiente:");
		System.out.println("------------------------------------");
		System.out.println("");
		System.out.println(" * Costo por Unidad: Q"+precioUnitario);
		System.out.println(" * Cantidad de producto: "+cantidadTotal_Producto);
		System.out.println(" * Total: Q"+ totalDePago);
		
		System.out.println(" * Venderse a: Q"+precioDeVenta);
		System.out.println(" * Impuesto establecido: Q"+IVA);
		System.out.println(" * Impuesto por Unidad: Q"+IVA_DelProductoUnitario);
		
		int cantidadDeProducto = 3000;
		double totalcobradoSinElDescuento = cantidadDeProducto*precioDeVenta;
		
		double totalConElDescuento = 0;
		
		if(cantidadDeProducto>=50) {
			 totalConElDescuento = totalcobradoSinElDescuento-(totalcobradoSinElDescuento*0.05);
		}
		
		if(cantidadDeProducto>=100) {
			 totalConElDescuento = totalcobradoSinElDescuento-(totalcobradoSinElDescuento*0.15);
		}
		
		if(cantidadDeProducto>=1000) {
			 totalConElDescuento = totalcobradoSinElDescuento-(totalcobradoSinElDescuento*0.25);
		}
		
		
		double impuestoADeclararVenta = totalConElDescuento*IVA;
		
		double descuentoObtenido = 0;
		
		if(cantidadDeProducto>=50) {
			 descuentoObtenido = 0.05;
		}
		
		if(cantidadDeProducto>=100) {
			 descuentoObtenido = 0.15;
		}	 
			 
	    if(cantidadDeProducto>=1000) {
				 descuentoObtenido = 0.25;
	    }		 
		
		
		
		double ganancias = (totalcobradoSinElDescuento - (cantidadDeProducto*precioUnitario))-impuestoADeclararVenta;
		
		System.out.println("");
		System.out.println("------------------------------------");
		System.out.println(" Información que el usuario desa ver\n es la siguiente:");
		System.out.println("------------------------------------");
		System.out.println("");
		System.out.println(" * Cantidad Vendida: "+cantidadDeProducto);
		System.out.println(" * Total sin descuento: "+totalcobradoSinElDescuento);
		System.out.println(" * Total con el descuento: "+ totalConElDescuento);
		System.out.println(" * IVA a declarar: Q"+impuestoADeclararVenta);
		System.out.println(" * Tipo de Descuento "+descuentoObtenido);
		System.out.println(" * Ganancias: Q"+ganancias);
		
	}
	
}