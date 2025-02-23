package icesi.microservicio_equipo.repository;

import icesi.microservicio_equipo.model.Equipo;
import icesi.microservicio_equipo.model.EquipoId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EquipoRepository extends JpaRepository<Equipo, EquipoId> {
}
