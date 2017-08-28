package com.autoesporte.autoesporte.service;


import com.autoesporte.autoesporte.model.AutoEsporte;

import retrofit.http.GET;

public interface AutoService {
        @GET("/feed")
        AutoEsporte get();
}
