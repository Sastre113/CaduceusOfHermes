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
 * @version 20:29:29 - 16/07/2023
 *
 */
@Entity
@Table(name = "Tipocontactotb")
public class TipoContactoTb {

	@Id
	@Column(name = "id_tipo_contacto", nullable = false)
	private int idTipoContacto;
	@Column(name = "descripcion")
	private String descripcion;

	@ManyToOne
	@JoinColumn(name = "id_contacto")
	private ContactoTb contacto;

	public int getIdTipoContacto() {
		return idTipoContacto;
	}

	public void setIdTipoContacto(int idTipoContacto) {
		this.idTipoContacto = idTipoContacto;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public ContactoTb getContacto() {
		return contacto;
	}

	public void setContacto(ContactoTb contacto) {
		this.contacto = contacto;
	}
}