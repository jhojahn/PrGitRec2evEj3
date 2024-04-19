/**
 *  @autor jhojahn ramirez
 *  @vesion 2.1
 *  
 */

import lombok.Data;

/**
 * 
 */
public @Data class main {
	public static void main(String[] args) {
		cliente c2=new cliente("pepe");
		vehiculo v1= new vehiculo("2334ABC",33330,25000.6);
		System.out.println(v1);
		cliente c1=new cliente();
		c1.setNombre("Juan");
		c1.setEdad(25);
		c1.setEdad(c1.getEdad()+1);
		c1.anadir(v1);
		System.out.println(c1);
	}

}
