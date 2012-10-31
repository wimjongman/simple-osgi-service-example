package com.example.services.provider3.internal;

import com.example.service.model.Service;

public class ServiceImplNumberThree implements Service {

	@Override
	public String getName() {
		return getClass().getSimpleName();
	}
}
