package gestorvehiculos;

public class Bici extends Vehiculo {
	
	public Bici(Integer id, String descripcion) {
        super(id, descripcion);
              
    }
	
	@Override
	public Double calculaPrecio(Integer dias){
		
		if (dias > 2) {
			super.setPrecio(6d +  ((dias - 2) * 2d));
		}
		else{
			super.setPrecio(dias * 3d);
		}
			
		return super.getPrecio();
		
	}


}
