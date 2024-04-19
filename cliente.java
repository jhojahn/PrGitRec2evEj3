/**
 *  @autor jhojahn ramirez
 *  @vesion 2.1
 *  
 */

/**
 * 
 */

import lombok.Data;

public @Data class cliente {
private String nombre;
private int edad;
private vehiculo[] vehiculos=new vehiculo[2];

void anadir(vehiculo v) {
	vehiculos[0]=v;
}

}
