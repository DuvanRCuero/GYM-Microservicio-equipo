package icesi.microservicio_equipo.service;

import icesi.microservicio_equipo.model.EquipoId;
import icesi.microservicio_equipo.model.Estado;
import icesi.microservicio_equipo.model.Equipo;
import icesi.microservicio_equipo.repository.EquipoRepository;
import jakarta.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EquipoService {
    @Autowired
    private EquipoRepository equipoRepository;

    public Equipo obtenerEquipo(EquipoId id) {
        return equipoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Equipo no encontrado"));
    }

    public void cambiarCantidad(EquipoId id, String nuevaCantidad) {
        Equipo equipo = obtenerEquipo(id);
        equipo.actualizarCantidad(nuevaCantidad);
        equipoRepository.save(equipo);
    }
    @Transactional
    public void cambiarEstado(EquipoId id, Estado nuevoEstado){
        Equipo equipo = obtenerEquipo(id);
        equipo.actualizarEstado(nuevoEstado);
        equipoRepository.save(equipo);


    }

    
}