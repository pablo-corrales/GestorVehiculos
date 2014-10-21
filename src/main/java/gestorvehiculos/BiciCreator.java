package gestorvehiculos;

public class BiciCreator extends VehiculoCreator{

	@Override
    public Vehiculo createVehiculo(Integer id, String descripcion) {
        return new Bici(id, descripcion);    
    }
	
}
