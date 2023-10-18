/**
 * 
 */
package caduceus.hermes.seguros.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import caduceus.hermes.seguros.i18n.MessageUtil;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 21:25:16 - 11/10/2023
 *
 */
@RestController
@RequestMapping(value = { "/i18n" })
public class I18nController {

	
	
	@GetMapping(path = "/mensaje/{key}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> obtenerMensajeJson(@PathVariable String key) throws IOException {
		return ResponseEntity.ok(MessageUtil.getMessage(key));
	}
}
