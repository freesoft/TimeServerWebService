package com.potatosoft;

import javax.xml.ws.Endpoint;

/**
 * Added multi-thread publisher.
 * 
 * @author wonhee.jung
 *
 */
public class MultithreadTimeServerPublisher {
	
	private Endpoint endpoint;
	
	public Endpoint getEndpoint(){
		return endpoint;
	}
	
	public void setEndpoint(Endpoint endpoint){
		this.endpoint = endpoint;
	}

	public static void main(String[] args) {
		
		MultithreadTimeServerPublisher publisher = new MultithreadTimeServerPublisher();
		publisher.setEndpoint(Endpoint.create(new TimeServerImpl()));
		publisher.getEndpoint().setExecutor(new PausableThreadPoolExecutor());
		publisher.getEndpoint().publish("http://127.0.0.1:5000/", new TimeServerImpl());
		
	}

}
