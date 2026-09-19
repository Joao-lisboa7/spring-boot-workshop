package com.example.PlayerRadio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.PlayerRadio.config.ApiConfig;

@Service 
public class service {

  @Autowired
  ApiConfig apiConfig; 
  String url = apiConfig.getSearchUrl() + "?country=Brazil&state=Minas Gerais&city=Belo Horizonte";
  
}
