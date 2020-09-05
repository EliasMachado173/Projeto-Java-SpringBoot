package com.eventoapp.eventosapp.repository;

import com.eventoapp.eventosapp.models.Evento;
import org.springframework.data.repository.CrudRepository;

public interface EventoRepository extends CrudRepository<Evento,String> {
}
