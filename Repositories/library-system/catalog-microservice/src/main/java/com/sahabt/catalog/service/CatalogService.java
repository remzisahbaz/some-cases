package com.sahabt.catalog.service;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.sahabt.catalog.dto.request.AddCatalogRequest;
import com.sahabt.catalog.dto.response.CatalogResponse;
import com.sahabt.library.applications.CatalogApplication;
import com.sahabt.library.domain.catalog.Catalog;

@Service
public class CatalogService {

	private CatalogApplication catalogApplication;
	private ModelMapper modelMapper;
	
	private CatalogService(CatalogApplication catalogApplication, ModelMapper modelMapper) {
		this.catalogApplication = catalogApplication;
		this.modelMapper = modelMapper;
	}
	
	public CatalogResponse addCatalog(AddCatalogRequest request) {
		 var catalog = modelMapper.map(request, Catalog.class);
		 var addCatalog = catalogApplication
	}
	
	
	
	
	
}
