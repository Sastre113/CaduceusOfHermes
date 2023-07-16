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
 * @version 16:46:47 - 16/07/2023
 *
 */
@Entity
@Table(name = "Contactotb")
public class ContactoTb {

	@Id
	@Column(name = "id_contacto", nullable = false)
	private Integer idContacto;
	@Column(name = "num_Telefono")
	private Integer numTelefono;

	@ManyToOne
	@JoinColumn(name = "id_usuario")
	private UsuarioTb usuario;

	public Integer getIdContacto() {
		return idContacto;
	}

	public void setIdContacto(Integer idContacto) {
		this.idContacto = idContacto;
	}

	public Integer getNumTelefono() {
		return numTelefono;
	}

	public void setNumTelefono(Integer numTelefono) {
		this.numTelefono = numTelefono;
	}

	public UsuarioTb getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuarioTb usuario) {
		this.usuario = usuario;
	}
}