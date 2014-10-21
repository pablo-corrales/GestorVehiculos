package gestorvehiculos;

public class VehiculoManager {
	private Vehiculo vehiculo;
	private VehiculoCreator creator;
	
	
	public VehiculoManager(){
    }
	
    public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	public VehiculoCreator getCreator() {
		return creator;
	}

	public void creatorVehiculo(Integer id, String descripcion) {
		this.vehiculo =  this.creator.createVehiculo(id, descripcion);
	}

}
