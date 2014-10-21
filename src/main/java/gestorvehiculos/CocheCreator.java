package gestorvehiculos;


public class CocheCreator extends VehiculoCreator{
	
	 	@Override
	    public Vehiculo createVehiculo(Integer id, String descripcion) {
	        return new Coche(id, descripcion,Categoria.A);
	        
	    }

}
