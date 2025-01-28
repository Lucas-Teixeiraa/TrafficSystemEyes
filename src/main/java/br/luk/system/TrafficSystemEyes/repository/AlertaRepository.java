package br.luk.system.TrafficSystemEyes.repository;

import br.luk.system.TrafficSystemEyes.model.Alerta;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AlertaRepository extends JpaRepository<Alerta, UUID> {
}
