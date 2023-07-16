/**
 * 
 */
package caduceus.hermes.seguros.model.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 16:13:13 - 16/07/2023
 *
 */
@Entity
@Table(name = "Usuariotb")
public class UsuarioTb {

	@Id
	@Column(name = "id_usuario", nullable = false)
	private int idUsuario;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "apellido")
	private String apellido;
	@Column(name = "dni")
	private String dni;
	
	@ManyToOne
	@JoinColumn(name = "id_seguro")
	private SeguroTb seguro;
	
	@OneToMany(mappedBy = "usuario")
	private List<ContactoTb> contactos;

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
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

	public SeguroTb getSeguro() {
		return seguro;
	}

	public void setSeguro(SeguroTb seguro) {
		this.seguro = seguro;
	}

	public List<ContactoTb> getContactos() {
		return contactos;
	}

	public void setContactos(List<ContactoTb> contactos) {
		this.contactos = contactos;
	}	
}