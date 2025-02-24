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
    @Column(name = "descripcion", insertable = false, updatable = false)
    private String descripcion;
    @Column(name = "cantidad")
    private String cantidad;
    @Embedded
    private Tipo tipo;
    @Embedded
    private Estado estado;


    public void actualizarCantidad(String nuevaCantidad) {
        this.cantidad = nuevaCantidad;
    }

    public void actualizarEstado(Estado nuevoEstado){
        this.estado = nuevoEstado;
    }
}
