package br.luk.system.TrafficSystemEyes.controller;

import br.luk.system.TrafficSystemEyes.dto.DadoTransitoDTO;
import br.luk.system.TrafficSystemEyes.model.DadoTransito;
import br.luk.system.TrafficSystemEyes.service.DadoTransitoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dados-transito")
public class DadoTransitoController {
    @Autowired
    private DadoTransitoService dadoTransitoService;

    @PostMapping
    public DadoTransito criarDadoTransito(@RequestBody DadoTransitoDTO dadoTransitoDTO){
        return dadoTransitoService.criarDadoTransito(dadoTransitoDTO);
    }
}
