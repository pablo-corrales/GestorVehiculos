package gestorvehiculos;


import upm.jbb.IO;


public class MainVehiculos {
		
    public static void main(String[] args) {
    	
    	Integer id = 0;
    	String descripcion = "";
    	Integer dias = 0 ;
    	Categoria categoria= Categoria.A;
    	String[] sino = {"S","N"};
       	   	
    	VehiculoManager vehiculoManager;
    	    	
      
        Vehiculo[] vehiculos = {new Coche(id,descripcion,dias,categoria), new Moto(id,descripcion,dias), new Bici(id,descripcion,dias)};
    	
        do{
        	vehiculoManager = new VehiculoManager();
        	vehiculoManager.setVehiculo((Vehiculo) IO.in.select(vehiculos, "Elige un tipo de vehiculo"));
        
        	vehiculoManager.getVehiculo().setCategoria(categoria);
        	
        	
        	
        	id = IO.in.readInt("Introduzca el identificador del vehiculo");
        	descripcion = IO.in.readString("Introduzca la descripcion del vehiculo");
        	dias = IO.in.readInt("Introduzca el numero de dias de alquiler");
        	vehiculoManager.getVehiculo().setId(id);
        	vehiculoManager.getVehiculo().setDescripcion(descripcion);
        	vehiculoManager.getVehiculo().setDias(dias);
        
    	     	                                          
        	vehiculoManager.getVehiculo().calculaPrecio(dias);
        	IO.out.println("VEHICULO: " +vehiculoManager.getVehiculo().toString());
        	IO.out.println(" >> ID: " + vehiculoManager.getVehiculo().getId() );
        	IO.out.println(" >> DESCRIPCION: "+ vehiculoManager.getVehiculo().getDescripcion());
        	IO.out.println(" >> NUMERO DE DIAS: "+vehiculoManager.getVehiculo().getDias());
        	IO.out.println(" >> VALOR POR ALQUILER: "+vehiculoManager.getVehiculo().getPrecio());
        
        } while (IO.in.select(sino,"Otro vehiculo? ") == "S");
        
	}
    
}