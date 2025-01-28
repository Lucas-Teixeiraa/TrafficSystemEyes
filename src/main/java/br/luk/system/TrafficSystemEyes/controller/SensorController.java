package br.luk.system.TrafficSystemEyes.controller;


import br.luk.system.TrafficSystemEyes.dto.SensorDTO;
import br.luk.system.TrafficSystemEyes.model.Sensor;
import br.luk.system.TrafficSystemEyes.service.SensorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sensors")
public class SensorController {
    @Autowired
    private SensorService sensorService;

    @PostMapping
    public Sensor criarSensor(@RequestBody SensorDTO sensorDTO){
        return sensorService.criarSensor(sensorDTO);
    }
}
