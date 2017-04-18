package interceptor;

import java.util.Scanner;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

import org.jboss.logging.Logger;
@Interceptor
@Connected
public class Connector {
					
		@AroundInvoke//seffectue une fois que la methode sest executée
		public Object connect(InvocationContext context) throws Exception{
			Scanner sc = new Scanner(System.in);
			System.out.println("saisir le login");
			String login = sc.next();
			System.out.println("saisir mdp");
			String mdp = sc.next();
			sc.close();
			if (login.equalsIgnoreCase("root") && mdp.equalsIgnoreCase("root"))
			{
				System.out.println("connecter");
				return context.proceed();
			}
			else
			{
				System.out.println("erreur de connection");
				return null;
			}
		}
	}

