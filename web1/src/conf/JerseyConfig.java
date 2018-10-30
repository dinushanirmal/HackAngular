package com.interblocks.iadmin.userservice.configuration;

import org.springframework.stereotype.Component;

@Component
public class JerseyConfig //extends ResourceConfig 
{
	//TODO:enable spring security for rest endpoints
	public JerseyConfig() {
		register(Endpoint.class);
		setProperties(Collections.singletonMap(
				"jersey.config.server.response.setStatusOverSendError", true));
	}
}
