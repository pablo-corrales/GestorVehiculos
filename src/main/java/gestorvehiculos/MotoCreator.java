package gestorvehiculos;

public class MotoCreator extends VehiculoCreator{
	
	public MotoCreator(Integer id, String descripcion, Integer dia){};
	
	@Override
    public Vehiculo createVehiculo(Integer id, String descripcion, Integer dias) {
        return new Moto(id, descripcion, dias);    
    }
	
	@Override
    public String toString() {
        return "Moto";
    }
}
