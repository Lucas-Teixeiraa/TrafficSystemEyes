package br.luk.system.TrafficSystemEyes.dto;

import lombok.Data;

import java.util.UUID;

@Data
public class VeiculoDTO {
    private UUID sensorID;
    private String placa;
    private double velocidade;
}
