package icesi.microservicio_equipo.controller;

import icesi.microservicio_equipo.model.EquipoId;
import icesi.microservicio_equipo.model.Equipo;
import icesi.microservicio_equipo.model.Estado;
import icesi.microservicio_equipo.model.Tipo;
import icesi.microservicio_equipo.service.EquipoService;

import java.util.Map;

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
    public void cambiarEstado (@PathVariable String id, @RequestBody Estado nuevoEstado){
        System.out.println("Recibido en el controlador: " + nuevoEstado);
        equipoService.cambiarEstado(new EquipoId(id), nuevoEstado);
        
    }

    @PutMapping("/{id}/cantidad")
    public void cambiarCantidad (@PathVariable String id, @RequestBody Map<String, String> body){
        String cantidad = body.get("cantidad");
        System.out.println("Recibido en el controlador: " + cantidad);
        equipoService.cambiarCantidad(new EquipoId(id), cantidad);
    }


}
