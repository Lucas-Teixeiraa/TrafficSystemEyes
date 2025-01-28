package br.luk.system.TrafficSystemEyes.repository;

import br.luk.system.TrafficSystemEyes.model.Sensor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SensorRepository extends JpaRepository<Sensor, UUID> {
}
