package icesi.microservicio_equipo.service;

import icesi.microservicio_equipo.model.EquipoId;
import icesi.microservicio_equipo.model.Equipo;
import icesi.microservicio_equipo.repository.EquipoRepository;
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

    public void cambiarCantidad(EquipoId id, Cantidad nuevoEmail) {
        Usuario usuario = obtenerUsuario(id);
        usuario.cambiarEmail(nuevoEmail);
        usuarioRepository.save(usuario);
    }
}