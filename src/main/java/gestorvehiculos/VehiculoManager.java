package gestorvehiculos;


public class VehiculoManager {
		
	private Vehiculo vehiculo ;
	private VehiculoCreator creator;
	
	
	public VehiculoManager(){
    }
	
    public Vehiculo getVehiculo() {
		return this.vehiculo;
	}

	public void setVehiculo(Vehiculo v) {
		this.vehiculo = v;
	}

	public VehiculoCreator getCreator() {
		return creator;
	}
	
	public void setVehiculoCreator(VehiculoCreator vehiculoCreator) {
		this.creator = vehiculoCreator;
	}

	
}
