/**
 * 
 */
package caduceus.hermes.seguros.model.entity;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedAttributeNode;
import javax.persistence.NamedEntityGraph;
import javax.persistence.NamedSubgraph;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 16:01:26 - 16/07/2023
 *
 */
@Entity
@Table(name = "Segurotb")
@NamedEntityGraph(
		name = "seguro-graph",
		includeAllAttributes = false,
		attributeNodes = {
				@NamedAttributeNode(value = "vehiculos", subgraph = "vehiculos-graph"),
				@NamedAttributeNode(value = "usuarios", subgraph = "usuarios-graph"),
        },
        subgraphs = {
                @NamedSubgraph(name = "usuarios-graph", attributeNodes = {
                        @NamedAttributeNode("contactos")
                })
        }
)
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
	private Set<VehiculoTb> vehiculos;
	@OneToMany(mappedBy = "seguro")
	private Set<UsuarioTb> usuarios;

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

	public Set<VehiculoTb> getVehiculos() {
		return vehiculos;
	}

	public void setVehiculos(Set<VehiculoTb> vehiculos) {
		this.vehiculos = vehiculos;
	}

	public Set<UsuarioTb> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(Set<UsuarioTb> usuarios) {
		this.usuarios = usuarios;
	}

}
