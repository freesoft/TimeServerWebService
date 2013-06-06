package com.potatosoft;

import javax.xml.ws.Endpoint;

public class TimeServerPublisher {

	public static void main(String[] args) {
		Endpoint.publish("http://127.0.0.1:8081/", new TimeServerImpl());
	}

}
