/**
 *  @autor jhojahn ramirez
 *  @vesion 2.1
 *  
 */

import lombok.Data;

/**
 * 
 */
public @Data class vehiculo {
/**
	 *  @gfdgdgsdg
	 */
	

private String matricula;
private int km;
private double precio;

public vehiculo(String string, int i, double d) {
	this.matricula=string;
	this.km=i;
	this.precio=d;
}
}
