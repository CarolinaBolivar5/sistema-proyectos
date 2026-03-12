package com.gestion.proyectos.sistema_proyectos.model.entity;

import com.gestion.proyectos.sistema_proyectos.model.embeddable.ContactoCliente;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "proyectos")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class Proyecto extends BaseEntity {
    private String nombre;
    private String descripcion;

    @Embedded
    private ContactoCliente contactoCliente;
   
}
