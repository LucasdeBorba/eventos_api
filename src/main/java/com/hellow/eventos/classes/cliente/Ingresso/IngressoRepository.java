package com.hellow.eventos.classes.cliente.Ingresso;

import com.hellow.eventos.classes.tipo.Tipo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngressoRepository extends JpaRepository<Tipo,Integer> {
}
