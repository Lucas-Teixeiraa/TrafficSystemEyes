package br.luk.system.TrafficSystemEyes.repository;

import br.luk.system.TrafficSystemEyes.model.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface VeiculoRepository extends JpaRepository<Veiculo, UUID> {
}
