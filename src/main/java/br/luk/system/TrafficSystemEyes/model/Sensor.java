package br.luk.system.TrafficSystemEyes.model;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;
import java.util.UUID;

@Data
@Entity
public class Sensor {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID sensorID;
    private String localizacao;
    private String status;
    private Date dataInstalacao;
}
