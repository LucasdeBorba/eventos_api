package com.hellow.eventos.classes.cliente.Usuario;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;


@Entity(name="usuario")
@Table(name="usuario")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor


public class Usuario {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name="id")
        private Integer id_usuario;

        private String nome;
        private String sobrenome;
        private String login;
        private String senha;
        private Integer dt_nascimento;
        private Date dt_criacao;
        private Date dt_filiacao;
        private String email;
        private Integer telefone;
        private Integer cpf;
        private String usuario_id;




        @ManyToOne
        @JoinColumn(name ="tipo_id")
        private Integer tipo_id;

}
