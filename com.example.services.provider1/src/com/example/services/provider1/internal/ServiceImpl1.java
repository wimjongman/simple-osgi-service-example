package com.example.services.provider1.internal;

import com.example.service.model.Service;

public class ServiceImpl1 implements Service {

	@Override
	public String getName() {
		return getClass().getSimpleName();
	}
}
