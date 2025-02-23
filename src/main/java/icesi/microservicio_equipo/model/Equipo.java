package icesi.microservicio_equipo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Equipo {

    @EmbeddedId
    private EquipoId id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "cantidad")
    private int cantidad;

    public void actualizarCantidad(cantidad nuevaCantidad) {
        this.cantidad = nuevaCantidad;
    }
}
