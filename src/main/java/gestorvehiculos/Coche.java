package gestorvehiculos;

public class Coche extends Vehiculo {
	private Categoria categoria;
	
	
	public Coche(Integer id, String descripcion, Categoria categoria) {
        super(id, descripcion);
        this.setCategoria(categoria);
        
    }
	
	public Categoria getCategoria() {
		return categoria;
	}


	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	@Override
	public Double calculaPrecio(Integer dias){
		
		if (dias >= 1 && dias <= 3){
			return this.getCategoria().getPrecio();
		}
		
		if (dias >= 4 && dias <= 7){
			return this.getCategoria().getPrecio()*0.80;
		}
	
		super.setPrecio(this.getCategoria().getPrecio()*0.50);
		
		return super.getPrecio();
		
	}
	

}
