package gestorvehiculos;

public class BiciCreator extends VehiculoCreator{

	public BiciCreator(){};
	@Override
    public Vehiculo createVehiculo(Integer id, String descripcion, Integer dias) {
        return new Bici(id, descripcion, dias);    
    }
	
	@Override
    public String toString() {
        return "Bici";
    }
}
