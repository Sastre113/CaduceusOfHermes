/**
 * 
 */
package caduceus.hermes.seguros.model.dto;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 20:32:50 - 16/07/2023
 *
 */
public class TipoContactoDTO {

	private int tipoContacto;
	private String descripcion;

	public int getTipoContacto() {
		return tipoContacto;
	}

	public void setTipoContacto(int tipoContacto) {
		this.tipoContacto = tipoContacto;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
