package com.hellow.eventos.classes.midia;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name="Midia")
@Table(name="Midia")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor



public class Midia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    private String formato;
    private Integer duracao;
    private Integer tamanho;
    private String link;

    @ManyToOne
    @JoinColumn(name ="evento_id")
    private Integer eveneto_id;

    @ManyToOne
    @JoinColumn(name ="tipo_id")
    private Integer tipo_id;
    

}
