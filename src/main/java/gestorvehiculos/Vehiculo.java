package gestorvehiculos;

public abstract class Vehiculo {
	
    private Integer id;
    private String descripcion;
    private Integer dias;
    private Double precio;
    
    
    public Vehiculo(Integer id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
        this.precio = 0d;
    }

   
    public Integer getId() {
        return this.id;
    }

    public String getDescripcion() {
        return this.descripcion;
    }
    
    public Integer getDias() {
        return this.dias;
    }

    public Double getPrecio(){
    	return this.precio;
    }

    protected abstract Double calculaPrecio(Integer dias); 
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setDias(Integer dias) {
        this.dias = dias;
    }
     
    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " >> ID: " + this.getId() + " DESCRIPCION: "
                + this.getDescripcion() + " >> PRECIO: "+ this.getPrecio();
    }


}
