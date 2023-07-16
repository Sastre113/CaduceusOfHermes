/**
 * 
 */
package caduceus.hermes.seguros.model.dto;

import java.util.List;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 17:08:58 - 16/07/2023
 *
 */
public class ContactoDTO {

	private int idContacto;
	private int numTelefono;
	private List<TipoContactoDTO> listaTipoContacto;

	public int getIdContacto() {
		return idContacto;
	}

	public void setIdContacto(int idContacto) {
		this.idContacto = idContacto;
	}

	public int getNumTelefono() {
		return numTelefono;
	}

	public void setNumTelefono(int numTelefono) {
		this.numTelefono = numTelefono;
	}

	public List<TipoContactoDTO> getListaTipoContacto() {
		return listaTipoContacto;
	}

	public void setListaTipoContacto(List<TipoContactoDTO> listaTipoContacto) {
		this.listaTipoContacto = listaTipoContacto;
	}
}