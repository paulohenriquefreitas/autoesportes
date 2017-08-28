package com.autoesporte.autoesporte.service;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.stereotype.Service;

import com.autoesporte.autoesporte.model.AutoEsporte;

import retrofit.RestAdapter;
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@Service
public class AutoesporteService {
	
	public AutoEsporte find() {
		RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint("https://feedapp.herokuapp.com")
                .setLogLevel(RestAdapter.LogLevel.FULL).build();
		AutoService service = restAdapter
                .create(AutoService.class);
		return  service.get();
	}
}
