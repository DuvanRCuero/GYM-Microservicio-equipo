package icesi.microservicio_equipo.controller;

import icesi.microservicio_equipo.model.EquipoId;
import icesi.microservicio_equipo.model.Equipo;
import icesi.microservicio_equipo.model.Estado;
import icesi.microservicio_equipo.model.Tipo;
import icesi.microservicio_equipo.service.EquipoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/Equipos")
public class EquipoController {
    @Autowired
    private EquipoService equipoService;

    @GetMapping("/{id}")
    public Equipo obtenerEquipo(@PathVariable String id){
        return equipoService.obtenerEquipo(new EquipoId(id));
    }

    @PutMapping("/{id}/estado")
    public void cambiarEstado (@PathVariable String id, @RequestBody String nuevoEstado){
        
    }

    @PutMapping("/{id}/cantidad")
    public void cambiarCantidad (@PathVariable String id, @RequestBody String nuevaCantidad){
        equipoService.cambiarCantidad(new EquipoId(id),nuevaCantidad);
    }


}
