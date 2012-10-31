package com.example.services.provider2.internal;

import com.example.service.model.Service;

public class ServiceImplNumberTwo implements Service {

	@Override
	public String getName() {
		return getClass().getSimpleName();
	}
}
