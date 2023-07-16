/**
 * 
 */
package caduceus.hermes.seguros.model.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 16:01:26 - 16/07/2023
 *
 */
@Entity
@Table(name = "Segurotb")
public class SeguroTb {

	@Id
	@Column(name = "id_seguro", nullable = false)
	private int idSeguro;
	@Column(name = "empresa")
	private String empresa;
	@Column(name = "fecha_alta")
	private Date fechaAlta;
	@Column(name = "fecha_baja")
	private Date fechaBaja;

	@OneToMany(mappedBy = "seguro")
	private List<VehiculoTb> vehiculos;
	@OneToMany(mappedBy = "seguro")
	private List<UsuarioTb> usuarios;

	public int getIdSeguro() {
		return idSeguro;
	}

	public void setIdSeguro(int idSeguro) {
		this.idSeguro = idSeguro;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public Date getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public Date getFechaBaja() {
		return fechaBaja;
	}

	public void setFechaBaja(Date fechaBaja) {
		this.fechaBaja = fechaBaja;
	}

	public List<VehiculoTb> getVehiculos() {
		return vehiculos;
	}

	public void setVehiculos(List<VehiculoTb> vehiculos) {
		this.vehiculos = vehiculos;
	}

	public List<UsuarioTb> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<UsuarioTb> usuarios) {
		this.usuarios = usuarios;
	}

}
