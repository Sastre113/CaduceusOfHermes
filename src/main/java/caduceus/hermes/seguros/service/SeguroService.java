/**
 * 
 */
package caduceus.hermes.seguros.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import caduceus.hermes.seguros.model.dto.ContactoDTO;
import caduceus.hermes.seguros.model.dto.SeguroDTO;
import caduceus.hermes.seguros.model.dto.TipoContactoDTO;
import caduceus.hermes.seguros.model.dto.UsuarioDTO;
import caduceus.hermes.seguros.model.dto.VehiculoDTO;
import caduceus.hermes.seguros.model.entity.ContactoTb;
import caduceus.hermes.seguros.model.entity.SeguroTb;
import caduceus.hermes.seguros.model.entity.TipoContactoTb;
import caduceus.hermes.seguros.model.entity.UsuarioTb;
import caduceus.hermes.seguros.model.entity.VehiculoTb;
import caduceus.hermes.seguros.repository.ISeguroRepository;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 17:09:41 - 16/07/2023
 *
 */
@Service
public class SeguroService {

	@Autowired
	private ISeguroRepository seguroRepository;

	public SeguroDTO obtenerSeguroPorId(int idSeguro) {
		SeguroTb seguro = this.seguroRepository.findByIdSeguro(idSeguro);
		return this.mapSeguroTb(seguro);
	}

	private SeguroDTO mapSeguroTb(SeguroTb seguro) {
		SeguroDTO seguroDTO = new SeguroDTO();
		
		seguroDTO.setIdSeguro(seguro.getIdSeguro());
		seguroDTO.setEmpresa(seguro.getEmpresa());
		seguroDTO.setFechaAlta(seguro.getFechaAlta());
		seguroDTO.setFechaBaja(seguro.getFechaBaja());
		seguroDTO.setListaUsuarios(this.mapListaUsuarioDTO(seguro.getUsuarios()));
		seguroDTO.setListaVehiculos(this.mapListaVehiculoDTO(seguro.getVehiculos()));
		
		return seguroDTO;
	}

	private List<VehiculoDTO> mapListaVehiculoDTO(Set<VehiculoTb> vehiculos) {
		List<VehiculoDTO> listaVehiculoDTO = new ArrayList<>();
		
		if(vehiculos != null && !vehiculos.isEmpty())
			vehiculos.forEach(vehiculoEntity -> listaVehiculoDTO.add(this.mapVehiculoDTO(vehiculoEntity)));
		
		return listaVehiculoDTO;
	}

	private VehiculoDTO mapVehiculoDTO(VehiculoTb vehiculoEntity) {
		VehiculoDTO vehiculoDTO = new VehiculoDTO();
		
		vehiculoDTO.setColor(vehiculoEntity.getColor());
		vehiculoDTO.setIdVehiculo(vehiculoEntity.getIdVehiculo());
		vehiculoDTO.setMarca(vehiculoEntity.getMarca());
		
		return vehiculoDTO;
	}

	private List<UsuarioDTO> mapListaUsuarioDTO(Set<UsuarioTb> usuarios) {
		List<UsuarioDTO> listaUsuarioDTO = new ArrayList<>();
		
		if(usuarios != null && !usuarios.isEmpty())
			usuarios.forEach(usuarioEntity -> listaUsuarioDTO.add(this.mapUsuarioDTO(usuarioEntity)));
		
		return listaUsuarioDTO;
	}

	private UsuarioDTO mapUsuarioDTO(UsuarioTb usuarioEntity) {
		UsuarioDTO usuarioDTO = new UsuarioDTO();
		
		usuarioDTO.setApellido(usuarioEntity.getApellido());
		usuarioDTO.setDni(usuarioEntity.getDni());
		usuarioDTO.setIdUsuari(usuarioEntity.getIdUsuario());
		usuarioDTO.setNombre(usuarioEntity.getNombre());
		usuarioDTO.setListaContacto(this.mapListaContacto(usuarioEntity.getContactos()));
		
		return usuarioDTO;
	}

	private List<ContactoDTO> mapListaContacto(Set<ContactoTb> contactos) {
		List<ContactoDTO> listaContactoDTO = new ArrayList<>();
		
		if(contactos != null && !contactos.isEmpty())
			contactos.forEach(contactoEntity -> listaContactoDTO.add(this.mapContactoDTO(contactoEntity)));
		
		return listaContactoDTO;
	}

	private ContactoDTO mapContactoDTO(ContactoTb contactoEntity) {
		ContactoDTO contactoDTO = new ContactoDTO();
		contactoDTO.setIdContacto(contactoEntity.getIdContacto());
		contactoDTO.setNumTelefono(contactoEntity.getNumTelefono());
		
		contactoDTO.setListaTipoContacto(this.mapTipoContacto(contactoEntity.getTipoContactos()));
		
		return contactoDTO;
	}

	private List<TipoContactoDTO> mapTipoContacto(Set<TipoContactoTb> tipoContactos) {
		List<TipoContactoDTO> listaTipoContactoDTO = new ArrayList<>();
		
		if(tipoContactos != null && !tipoContactos.isEmpty())
			tipoContactos.forEach(tipoContacto -> listaTipoContactoDTO.add(this.mapTipoContactoDTO(tipoContacto)));
		
		return listaTipoContactoDTO;
	}

	private TipoContactoDTO mapTipoContactoDTO(TipoContactoTb tipoContacto) {
		TipoContactoDTO tipoContactoDTO = new TipoContactoDTO();
		tipoContactoDTO.setTipoContacto(tipoContacto.getIdTipoContacto());
		tipoContactoDTO.setDescripcion(tipoContacto.getDescripcion());
		return tipoContactoDTO;
	}

}
