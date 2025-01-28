package br.luk.system.TrafficSystemEyes.dto;

import lombok.Data;

import java.util.Date;
import java.util.UUID;

@Data
public class DadoTransitoDTO {
    private UUID sensorID;
    private double velocidadeMedia;
    private int intensidade;
    private Date dataColeta;
}
