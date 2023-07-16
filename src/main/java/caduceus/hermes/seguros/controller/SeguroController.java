/**
 * 
 */
package caduceus.hermes.seguros.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import caduceus.hermes.seguros.model.dto.SeguroDTO;
import caduceus.hermes.seguros.service.SeguroService;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 16:22:03 - 16/07/2023
 *
 */
@RestController
@RequestMapping(value = { "/seguro" })
public class SeguroController {

	@Autowired
	private SeguroService seguroService;
	
	@GetMapping(path = "/{idSeguro}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<SeguroDTO> obtenerSeguro(@PathVariable int idSeguro) {
		return ResponseEntity.ok(this.seguroService.obtenerSeguroPorId(idSeguro));
	}
}
