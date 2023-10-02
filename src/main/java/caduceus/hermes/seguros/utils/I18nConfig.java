/**
 * 
 */
package caduceus.hermes.seguros.utils;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.AcceptHeaderLocaleResolver;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 23:59:06 - 02/10/2023
 *
 */
@Configuration
public class I18nConfig {

	@SuppressWarnings("deprecation")
	@Bean
	public LocaleResolver localeResolver() {
		AcceptHeaderLocaleResolver resolver = new AcceptHeaderLocaleResolver();
		resolver.setDefaultLocale(new Locale("ca", "ES")); // Establece el idioma predeterminado
		return resolver;
	}
	
	/* Ficheros properties
    @Bean
    public MessageSource messageSource() {
        ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
        messageSource.setBasename("classpath:lang/properties/messages");
        //messageSource.setDefaultEncoding("UTF-8");
        messageSource.setUseCodeAsDefaultMessage(true);
        return messageSource;
    }
    */
    @Bean
    public ReloadableResourceBundleMessageSource messageSource() {
        ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
        messageSource.setBasename("classpath:lang/json/messages"); // Ruta base de los archivos YAML (sin extensión)
        //messageSource.setDefaultEncoding("UTF-8");
        return messageSource;
    } 
}