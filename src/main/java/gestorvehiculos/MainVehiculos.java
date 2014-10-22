package gestorvehiculos;

import upm.jbb.IO;


public class MainVehiculos {
		
    public static void main(String[] args) {
    	
    	Integer id = 0;
    	String descripcion = "";
    	Integer dias = 0 ;
    	Categoria categoria= Categoria.A;
    	String[] sino = {"S","N"};
       	   	
    	Vehiculo vehiculo;
    	    	
      
        Vehiculo[] vehiculos = {new Coche(id,descripcion,dias,categoria), new Moto(id,descripcion,dias), new Bici(id,descripcion,dias)};
    	
        do{
        	vehiculo = (Vehiculo) IO.in.select(vehiculos, "Elige un tipo de vehiculo");
        	vehiculo.setCategoria(categoria);
       
        	id = IO.in.readInt("Introduzca el identificador del vehiculo");
        	descripcion = IO.in.readString("Introduzca la descripcion del vehiculo");
        	dias = IO.in.readInt("Introduzca el numero de dias de alquiler");
        	vehiculo.setId(id);
        	vehiculo.setDescripcion(descripcion);
        	vehiculo.setDias(dias);
        
        	VehiculoManager vehiculoManager = new VehiculoManager();
        	vehiculoManager.setVehiculo(vehiculo);
                                          
        	vehiculoManager.getVehiculo().calculaPrecio(dias);
        	IO.out.println("VEHICULO: " +vehiculoManager.getVehiculo().toString());
        	IO.out.println(" >> ID: " + vehiculoManager.getVehiculo().getId() );
        	IO.out.println(" >> DESCRIPCION: "+ vehiculoManager.getVehiculo().getDescripcion());
        	IO.out.println(" >> NUMERO DE DIAS: "+vehiculoManager.getVehiculo().getDias());
        	IO.out.println(" >> VALOR POR ALQUILER: "+vehiculoManager.getVehiculo().getPrecio());
        
        } while (IO.in.select(sino,"Otro vehiculo? ") == "S");
        
	}
    
}