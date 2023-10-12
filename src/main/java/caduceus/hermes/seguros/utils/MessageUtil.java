/**
 * 
 */
package caduceus.hermes.seguros.utils;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 23:54:32 - 11/10/2023
 *
 */
@Component
public class MessageUtil {

	private final MessageSource messageSource;

	public MessageUtil(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

	public String getMessage(String code) {
		HttpServletRequest request = 
		        ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes())
		                .getRequest();
		System.out.println("Locale from request: " + request.getLocale().toString());
		Locale currentLocale = LocaleContextHolder.getLocale();
		System.out.println("Locale: " + currentLocale.toString());
		return this.messageSource.getMessage(code, null, currentLocale);
	}
	
	@Bean
	public LocaleResolver localeResolver() {
	    SessionLocaleResolver slr = new SessionLocaleResolver();
	    slr.setDefaultLocale(new Locale("ca", "ES"));
	    return slr;
	}
}
