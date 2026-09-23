package com.example.PlayerRadio.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.PlayerRadio.service.RadioService;

@RestController
public class RadioStationController {
  private final RadioService radioService;

  public RadioStationController(RadioService radioService){
    this.radioService = radioService;
  }

  @GetMapping("/radios")
  public String radios(){
    return radioService.listRadioStations();
  }

}
