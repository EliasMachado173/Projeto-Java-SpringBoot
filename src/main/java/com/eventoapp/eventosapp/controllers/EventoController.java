package com.eventoapp.eventosapp.controllers;

import com.eventoapp.eventosapp.models.Evento;
import com.eventoapp.eventosapp.repository.EventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import sun.font.EAttribute;

@Controller
public class EventoController {
    @Autowired
    private EventoRepository eventoRepository;

    @RequestMapping(value = "/cadastrarEvento", method = RequestMethod.GET)
    public String form() {
        return "evento/formEvento";
    }


    @RequestMapping(value = "/cadastrarEvento", method = RequestMethod.POST)
    public String form(Evento evento) {
        eventoRepository.save(evento);
        return "evento/formEvento";
    }

    @RequestMapping("/eventos")
    public ModelAndView listEventos() {
        ModelAndView mv = new ModelAndView("index");
        Iterable<Evento> eventos = eventoRepository.findAll();
        mv.addObject("eventos", eventos);
        return mv;
    }


}
