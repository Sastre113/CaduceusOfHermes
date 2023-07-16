/**
 * 
 */
package caduceus.hermes.seguros.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 16:13:07 - 16/07/2023
 *
 */
@Entity
@Table(name = "Vehiculotb")
public class VehiculoTb {

	@Id
	@Column(name = "id_vehiculo", nullable = false)
	private int idVehiculo;
	@Column(name = "marca")
	private String marca;
	@Column(name = "color")
	private String color;

	@ManyToOne
	@JoinColumn(name = "id_seguro")
	private SeguroTb seguro;

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

	public SeguroTb getSeguro() {
		return seguro;
	}

	public void setSeguro(SeguroTb seguro) {
		this.seguro = seguro;
	}
}