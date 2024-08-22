package com.hellow.eventos.classes.cliente.Ingresso;

import com.hellow.eventos.classes.evento.Evento;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name="Ingresso")
@Table(name="Ingresso")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Ingresso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id_Ingresso;
    private Float valor_base;
    private Boolean meia;
    private Boolean social;
    private Float valor_pego;
    private Boolean pago;
    private Boolean vip;


    @ManyToOne
    @JoinColumn(name="id_tipo")
    private Evento evento;

}
