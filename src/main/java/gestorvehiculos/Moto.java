package gestorvehiculos;

public class Moto extends Vehiculo{
	
	public Moto(Integer id, String descripcion) {
        super(id, descripcion);
              
    }
	
	@Override
	public Double calculaPrecio(Integer dias){
		
		if (dias < 7) {
			super.setPrecio(8d);
		}
		else{
			super.setPrecio(7d);
		}
			
		return super.getPrecio();
		
	}

}
