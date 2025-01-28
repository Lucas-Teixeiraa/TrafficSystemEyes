package br.luk.system.TrafficSystemEyes.model;

import jakarta.persistence.*;
import java.util.Date;
import java.util.UUID;

public class Alerta {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID alertaID;
    private String tipo;
    private String descricao;
    private Date dataGeracao;
}
