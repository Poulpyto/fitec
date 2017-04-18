package interceptor;

import java.util.Date;
import java.util.Scanner;

import javax.interceptor.AroundInvoke;
import javax.interceptor.AroundTimeout;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@Interceptor
@Timed
public class Timo {
	@AroundInvoke
	public Object connect(InvocationContext context) throws Exception{
		System.out.println("avant");
		Date d1 = new Date();
		Object retval = context.proceed();
		System.out.println("apres");
		Date d2 = new Date();
		long time = d1.getTime();
		long time2 = d2.getTime();
		long diff = time2 - time;
		System.out.println("temps de traitement = " + diff + "millisecondes");
		return retval;
	
	}
}
