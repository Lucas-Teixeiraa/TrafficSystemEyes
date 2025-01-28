package br.luk.system.TrafficSystemEyes.repository;

import br.luk.system.TrafficSystemEyes.model.DadoTransito;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface DadoTransitoRepository extends JpaRepository<DadoTransito, UUID> {
}
