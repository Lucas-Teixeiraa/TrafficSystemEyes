package br.luk.system.TrafficSystemEyes.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Data
@Entity
public class Veiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID veiculoID;
    private String placa;
    private double velocidade;


}
