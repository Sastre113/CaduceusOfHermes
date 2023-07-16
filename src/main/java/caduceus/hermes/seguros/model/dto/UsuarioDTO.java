/**
 * 
 */
package caduceus.hermes.seguros.model.dto;

import java.util.List;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 17:07:01 - 16/07/2023
 *
 */
public class UsuarioDTO {

	private int idUsuari;
	private String nombre;
	private String apellido;
	private String dni;
	private List<ContactoDTO> listaContacto;

	public int getIdUsuari() {
		return idUsuari;
	}

	public void setIdUsuari(int idUsuari) {
		this.idUsuari = idUsuari;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public List<ContactoDTO> getListaContacto() {
		return listaContacto;
	}

	public void setListaContacto(List<ContactoDTO> listaContacto) {
		this.listaContacto = listaContacto;
	}
}