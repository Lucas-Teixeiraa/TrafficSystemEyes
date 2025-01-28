package br.luk.system.TrafficSystemEyes.service;

import br.luk.system.TrafficSystemEyes.dto.SensorDTO;
import br.luk.system.TrafficSystemEyes.model.Sensor;
import br.luk.system.TrafficSystemEyes.repository.SensorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SensorService {
    @Autowired
    private SensorRepository sensorRepository;

    public Sensor criarSensor(SensorDTO sensorDTO){
        Sensor sensor = new Sensor();
        sensor.setLocalizacao(sensorDTO.getLocalizacao());
        sensor.setStatus(sensorDTO.getStatus());
        sensor.setDataInstalacao(sensorDTO.getDataInstalacao());
        return sensorRepository.save(sensor);
    }

}
