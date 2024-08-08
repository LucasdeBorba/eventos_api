package com.hellow.eventos.controller;

import com.hellow.eventos.classes.evento.Evento;
import com.hellow.eventos.classes.evento.EventoRepository;
import com.hellow.eventos.classes.tipo.Tipo;
import com.hellow.eventos.classes.tipo.TipoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="Evento")


public class EventoController {
    @Autowired
    private com.hellow.eventos.classes.evento.EventoRepository EventoRepository;

    @GetMapping("todos")
    public List<Evento> getAipos(){
        return this.EventoRepository.findAll();

}
    @PostMapping("add")
    public Tipo addtipo(@RequestBody Evento evento) {
        this.EventoRepository.save(evento);
        return evento.getTipo(
        );


    }
}





