package com.potatosoft;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.potatosoft.TimeServerWebService.client.TimeServer;

/**
 * Very basic SOAP WebService client for TimeServer.
 * 
 * @author wonhee.jung
 *
 */
public class TimeClient {

	public static void main(String[] args) throws MalformedURLException {
		
		URL url = new URL("http://localhost:5000/?wsdl");
		QName qname = new QName("http://potatosoft.com/", "TimeServerImplService");
		
		Service service = Service.create(url, qname);
		
		TimeServer eif = service.getPort(TimeServer.class);
		
		System.out.println(eif.getTimeAsString());
		System.out.println(eif.getTimeAsElapsed());
	}

}
