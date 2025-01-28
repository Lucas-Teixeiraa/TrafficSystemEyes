package br.luk.system.TrafficSystemEyes.service;

import br.luk.system.TrafficSystemEyes.dto.DadoTransitoDTO;
import br.luk.system.TrafficSystemEyes.model.DadoTransito;
import br.luk.system.TrafficSystemEyes.model.Sensor;
import br.luk.system.TrafficSystemEyes.repository.DadoTransitoRepository;
import br.luk.system.TrafficSystemEyes.repository.SensorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DadoTransitoService {
    @Autowired
    private DadoTransitoRepository dadoTransitoRepository;

    @Autowired
    private SensorRepository sensorRepository;

    public DadoTransito criarDadoTransito(DadoTransitoDTO dadoTransitoDTO){
        DadoTransito dadoTransito = new DadoTransito();
        Sensor sensor = sensorRepository.findById(dadoTransitoDTO.getSensorID()).orElseThrow();
        dadoTransito.setVelocidadeMedia(dadoTransitoDTO.getVelocidadeMedia());
        dadoTransito.setIntensidade(dadoTransito.getIntensidade());
        dadoTransito.setDataColeta(dadoTransitoDTO.getDataColeta());
        return dadoTransitoRepository.save(dadoTransito);
    }
}
