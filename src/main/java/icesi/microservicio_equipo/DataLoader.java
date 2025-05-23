package icesi.microservicio_equipo;

import icesi.microservicio_equipo.model.*;
import icesi.microservicio_equipo.repository.EquipoRepository;
import jakarta.persistence.Embedded;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    private EquipoRepository equipoRepository;

    @Override
    public void run(String... args) throws Exception {
        // Cargar datos de prueba
        EquipoId equipoId = new EquipoId("1");
        String descripcion = "una pesa bacana";

        Tipo tipo = new Tipo("pesa");
        Estado estado = new Estado("nuevo");
    
        
        equipoRepository.save(Equipo.builder()
                .id(equipoId)
                .nombre("pesa 10 kg")
                .descripcion(descripcion)
                .cantidad("10")
                .tipo(tipo)
                .estado(estado)
                .build());

        System.out.println("Datos de prueba cargados exitosamente.");
    }
}
