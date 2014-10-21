package gestorvehiculos;

public class MotoCreator extends VehiculoCreator{
	
	@Override
    public Vehiculo createVehiculo(Integer id, String descripcion) {
        return new Moto(id, descripcion);    
    }
	
}
