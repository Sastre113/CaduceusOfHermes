/**
 * 
 */
package caduceus.hermes.seguros.model.dto;

import java.util.Date;
import java.util.List;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 17:05:33 - 16/07/2023
 *
 */
public class SeguroDTO {

	private int idSeguro;
	private String empresa;
	private Date fechaAlta;
	private Date fechaBaja;
	private List<VehiculoDTO> listaVehiculos;
	private List<UsuarioDTO> listaUsuarios;

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

	public List<VehiculoDTO> getListaVehiculos() {
		return listaVehiculos;
	}

	public void setListaVehiculos(List<VehiculoDTO> listaVehiculos) {
		this.listaVehiculos = listaVehiculos;
	}

	public List<UsuarioDTO> getListaUsuarios() {
		return listaUsuarios;
	}

	public void setListaUsuarios(List<UsuarioDTO> listaUsuarios) {
		this.listaUsuarios = listaUsuarios;
	}

}
