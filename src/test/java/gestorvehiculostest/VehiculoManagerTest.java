package gestorvehiculostest;

import gestorvehiculos.Bici;
import gestorvehiculos.Categoria;
import gestorvehiculos.Coche;
import gestorvehiculos.Moto;
import gestorvehiculos.VehiculoManager;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class VehiculoManagerTest {
	
	 VehiculoManager vehiculoManager;
	
	 Categoria categoria = null;
	 
	 @Before
	 public void before() {
		 	vehiculoManager = new VehiculoManager();  
	              
	 }
	 
	 @Test
	 public void calculaPrecioCocheTipoA() {
		 	vehiculoManager.setVehiculo(new Coche(1111,"ALFA ROMEO",1,Categoria.A)); 
	        assertEquals(new Double(10),  vehiculoManager.getVehiculo().calculaPrecio(vehiculoManager.getVehiculo().getDias()));
	        
	        vehiculoManager.setVehiculo(new Coche(1111,"ALFA ROMEO",4,Categoria.A)); 
	        assertEquals(new Double(32),  vehiculoManager.getVehiculo().calculaPrecio(vehiculoManager.getVehiculo().getDias()));
	        
	        vehiculoManager.setVehiculo(new Coche(1111,"ALFA ROMEO",10,Categoria.A)); 
	        assertEquals(new Double(50),  vehiculoManager.getVehiculo().calculaPrecio(vehiculoManager.getVehiculo().getDias()));
	        
	 }
	 @Test
	 public void calculaPrecioCocheTipoB() {
		 
		 vehiculoManager.setVehiculo(new Coche(222,"VOLKSWAGEN",1,Categoria.B)); 
	     assertEquals(new Double(15),  vehiculoManager.getVehiculo().calculaPrecio(vehiculoManager.getVehiculo().getDias()));	
	     
	     vehiculoManager.setVehiculo(new Coche(222,"VOLKSWAGEN",4,Categoria.B)); 
	     assertEquals(new Double(48),  vehiculoManager.getVehiculo().calculaPrecio(vehiculoManager.getVehiculo().getDias()));
	     
	     vehiculoManager.setVehiculo(new Coche(222,"VOLKSWAGEN",10,Categoria.B)); 
	     assertEquals(new Double(50),  vehiculoManager.getVehiculo().calculaPrecio(vehiculoManager.getVehiculo().getDias()));
	        
	 }
	 
	 @Test
	 public void calculaPrecioCocheTipoC() {
		 
		 vehiculoManager.setVehiculo(new Coche(333,"VOLKSWAGEN",1,Categoria.C)); 
	     assertEquals(new Double(20),  vehiculoManager.getVehiculo().calculaPrecio(vehiculoManager.getVehiculo().getDias()));	
	     
	     vehiculoManager.setVehiculo(new Coche(333,"VOLKSWAGEN",4,Categoria.C)); 
	     assertEquals(new Double(64),  vehiculoManager.getVehiculo().calculaPrecio(vehiculoManager.getVehiculo().getDias()));
	     
	     vehiculoManager.setVehiculo(new Coche(333,"VOLKSWAGEN",10,Categoria.C)); 
	     assertEquals(new Double(100),  vehiculoManager.getVehiculo().calculaPrecio(vehiculoManager.getVehiculo().getDias()));
	        
	 }
	 
	 @Test
	 public void calculaPrecioMoto() {
		 
		 vehiculoManager.setVehiculo(new Moto(444,"HONDA",6)); 
	     assertEquals(new Double(48),  vehiculoManager.getVehiculo().calculaPrecio(vehiculoManager.getVehiculo().getDias()));	
	     
	     vehiculoManager.setVehiculo(new Moto(444,"HONDA",10)); 
	     assertEquals(new Double(70),  vehiculoManager.getVehiculo().calculaPrecio(vehiculoManager.getVehiculo().getDias()));
	     
	    	        
	 }
	 
	 @Test
	 public void calculaPrecioBici() {
		 
		 vehiculoManager.setVehiculo(new Bici(555,"CANONDALE",2)); 
	     assertEquals(new Double(6),  vehiculoManager.getVehiculo().calculaPrecio(vehiculoManager.getVehiculo().getDias()));	
	     
	     vehiculoManager.setVehiculo(new Bici(555,"CANONDALE",10)); 
	     assertEquals(new Double(20),  vehiculoManager.getVehiculo().calculaPrecio(vehiculoManager.getVehiculo().getDias()));
	     
	    	        
	 }

}
