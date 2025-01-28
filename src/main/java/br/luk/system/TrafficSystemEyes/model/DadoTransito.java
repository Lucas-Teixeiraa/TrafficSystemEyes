package br.luk.system.TrafficSystemEyes.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.UUID;


@Data
@Entity
public class DadoTransito {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID dadosID;

    @ManyToOne
    @JoinColumn(name = "sensorID", nullable = false)
    private Sensor sensor;

    private double velocidadeMedia;
    private int intensidade;
    private Date dataColeta;


}
