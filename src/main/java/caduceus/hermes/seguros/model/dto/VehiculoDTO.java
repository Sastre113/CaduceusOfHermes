/**
 * 
 */
package caduceus.hermes.seguros.model.dto;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 17:06:53 - 16/07/2023
 *
 */
public class VehiculoDTO {

	private int idVehiculo;
	private String marca;
	private String color;

	public int getIdVehiculo() {
		return idVehiculo;
	}

	public void setIdVehiculo(int idVehiculo) {
		this.idVehiculo = idVehiculo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
