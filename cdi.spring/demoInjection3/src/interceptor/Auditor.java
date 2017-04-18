package interceptor;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

import org.jboss.logging.Logger;

@Interceptor
@Audited
public class Auditor {
	private static Logger LOGGER = Logger.getLogger(Auditor.class.getName());
	
	@AroundInvoke//seffectue une fois que la methode sest executée
	public Object audit(InvocationContext context) throws Exception{
		LOGGER.info("Appel de la methode" + context.getMethod().getName());
		return context.proceed();
	}
}
