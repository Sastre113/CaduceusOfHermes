/**
 * 
 */
package caduceus.hermes.seguros.i18n;

import java.util.Locale;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.AcceptHeaderLocaleResolver;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 21:46:34 - 12/10/2023
 *
 */
@Configuration
public class I18nConfig {

	@Bean
	public ReloadableResourceBundleMessageSource messageSource() {
		ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
		messageSource.setBasename("classpath:lang/properties/messages");
		messageSource.setDefaultEncoding("UTF-8");
		messageSource.setFallbackToSystemLocale(false);
		messageSource.setDefaultLocale(Locale.forLanguageTag("ca-ES"));

		MessageUtil.setMessageSource(messageSource);	
		return messageSource;
	}

	@Bean
    public LocaleResolver localeResolver() {
        AcceptHeaderLocaleResolver resolver = new AcceptHeaderLocaleResolver();
        resolver.setDefaultLocale(Locale.forLanguageTag("ca-ES"));
        return resolver;
    }
}
