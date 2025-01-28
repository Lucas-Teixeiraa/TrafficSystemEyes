package br.luk.system.TrafficSystemEyes.dto;

import lombok.Data;

import java.util.Date;

@Data
public class SensorDTO {
    private String localizacao;
    private String status;
    private Date dataInstalacao;
}
