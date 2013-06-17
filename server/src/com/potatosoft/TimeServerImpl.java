package com.potatosoft;

import java.util.Date;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService( endpointInterface = "com.potatosoft.TimeServer" )
public class TimeServerImpl implements TimeServer {

	@Override
	@WebMethod
	public String getTimeAsString() {
		return new Date().toString();
	}

	@Override
	@WebMethod
	public long getTimeAsElapsed() {
		return new Date().getTime();
	}

}
