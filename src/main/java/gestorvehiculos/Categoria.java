package gestorvehiculos;


public enum Categoria {A(10d), B(15d), C(20d);  
	Double precio;
	Categoria(Double p){
		precio = p;
	}
	public double getPrecio() {
		return precio;
	}
}

