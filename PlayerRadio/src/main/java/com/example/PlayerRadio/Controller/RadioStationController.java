package com.example.PlayerRadio.Controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.PlayerRadio.model.RadioStation;
import com.example.PlayerRadio.service.RadioService;

@Controller
public class RadioStationController {
  private final RadioService radioService;

  public RadioStationController(RadioService radioService) {
    this.radioService = radioService;
  }

  @GetMapping("/home")
  public String home(Model model) {
    List<RadioStation> radios = radioService.listRadioStations();
    List<RadioStation> radiosFavoritas = radioService.listFavoriteStations(null);

    model.addAttribute("radios", radios);
    model.addAttribute("radiosFavoritas", radiosFavoritas);

    return "home";
  } 
}
