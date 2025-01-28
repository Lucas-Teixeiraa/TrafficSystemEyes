package br.luk.system.TrafficSystemEyes.dto;

import lombok.Data;

import java.util.Date;
import java.util.UUID;

@Data
public class AlertaDTO {
    private UUID sensorID;
    private String tipo;
    private String descricao;
    private Date dataGeracao;

}
