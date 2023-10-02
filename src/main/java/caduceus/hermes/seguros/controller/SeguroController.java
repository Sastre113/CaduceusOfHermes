/**
 * 
 */
package caduceus.hermes.seguros.controller;

import java.io.IOException;
import java.net.URL;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;

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
	private MessageSource messageSource;
	@Autowired
	private SeguroService seguroService;

	@GetMapping(path = "/{idSeguro}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<SeguroDTO> obtenerSeguro(@PathVariable int idSeguro) {
		return ResponseEntity.ok(this.seguroService.obtenerSeguroPorId(idSeguro));
	}

	@GetMapping(path = "/bundleMessage/{key}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> obtenerSeguro(@PathVariable String key) throws IOException {
		Locale locale = LocaleContextHolder.getLocale();
		ObjectMapper mapper = new ObjectMapper();
		System.out.println(locale.toString());
		StringBuilder str = new StringBuilder("lang/json/messages_");
		if(StringUtils.hasText(locale.toString())) {
			str.append(locale.toString());
		}
		
		str.append(".json");
	    URL resourceUrl = SeguroController.class.getClassLoader().getResource(str.toString());
		return ResponseEntity.ok(mapper.readTree(resourceUrl).get(key).asText());
	}
}
