package gestorvehiculos;

import upm.jbb.IO;


public class CocheCreator extends VehiculoCreator{
	
				
	 	@Override
	    public Vehiculo createVehiculo(Integer id, String descripcion, Integer dias) {
	 		
	 		Categoria categoria = Categoria.A;
	 		categoria = (Categoria) IO.in.read(categoria, "Introduzca categoria del coche");
	 		
	        return new Coche(id, descripcion,dias, categoria);
	        
	    }
	 	
	 	@Override
	    public String toString() {
	        return "Coche";
	    }

}
