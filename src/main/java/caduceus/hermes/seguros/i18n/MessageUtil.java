/**
 * 
 */
package caduceus.hermes.seguros.i18n;

import java.text.MessageFormat;
import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Component;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 23:54:32 - 11/10/2023
 *
 */
@Component
public class MessageUtil {

	private static MessageSource messageSource;

	public static void setMessageSource(MessageSource source) {
		messageSource = source;
	}

	public static String getMessage(String code, String ...args) {
		Locale currentLocale = LocaleContextHolder.getLocale();
		System.out.println("Locale: " + currentLocale.toString());
		String message = messageSource.getMessage(code, null, currentLocale);
		return MessageFormat.format(message, args);
	}

}
