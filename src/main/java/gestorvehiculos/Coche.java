package gestorvehiculos;

import upm.jbb.IO;

public class Coche extends Vehiculo {
	private Categoria categoria;
	
		
	public Coche(Integer id, String descripcion, Integer dias, Categoria categoria) {
        super(id, descripcion, dias);
       	
             
    }
	
	public Categoria getCategoria() {
		return categoria;
	}

	@Override
	public void setCategoria(Categoria categoria) {
		
 		categoria = (Categoria) IO.in.read(categoria, "Introduzca categoria del coche");
		this.categoria = categoria;
	}
	
	@Override
	public Double calculaPrecio(Integer dias){
		
				
		if (dias >= 1 && dias <= 3){
			super.setPrecio(this.getCategoria().getPrecio());
			return super.getPrecio();
		}
		
		if (dias >= 4 && dias <= 7){
			super.setPrecio(this.getCategoria().getPrecio()*0.80);
			return super.getPrecio();
		}
	
		super.setPrecio(this.getCategoria().getPrecio()*0.50);
		
		return super.getPrecio();
		
	}
	
	@Override
    public String toString() {
					
		return this.getClass().getSimpleName();	
		
    }
	

}
