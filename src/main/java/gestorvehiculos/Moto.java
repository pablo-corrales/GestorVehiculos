package gestorvehiculos;


public class Moto extends Vehiculo{
	
	public Moto(Integer id, String descripcion, Integer dias) {
        super(id, descripcion, dias);
              
    }
	
	@Override
	public Double calculaPrecio(Integer dias){
		
		if (dias <= 7) {
			super.setPrecio(8d*dias);
		}
		else{
			super.setPrecio(7d*dias);
		}
			
		return super.getPrecio();
		
	}
	
	
	@Override
	public void setCategoria(Categoria categoria) {}
		
 		
	
	@Override
    public String toString() {
		return this.getClass().getSimpleName();
    }

}
