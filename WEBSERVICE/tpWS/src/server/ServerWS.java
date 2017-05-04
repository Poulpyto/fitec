package server;

import javax.xml.ws.Endpoint;

import ws.BanqueService;

public class ServerWS {

	public static void main(String[] args) {
		
		//1 Création du serveur
		String url="http://localhost:8585/";
		// 2 Publication du webservice
		Endpoint.publish(url, new BanqueService());
	}

}
