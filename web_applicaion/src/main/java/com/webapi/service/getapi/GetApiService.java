package com.webapi.service.getapi;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webapi.model.GetApi;
import com.webapi.repository.GetApiRepository;

@Service
public class GetApiService {
	
	private final GetApiRepository getApiRepository;
	
	public GetApiService(GetApiRepository getApiRepository) {
		
		this.getApiRepository = getApiRepository;
	}

	public List<GetApi> getAllClients() {
		
		return getApiRepository.findAll();
	}

}
