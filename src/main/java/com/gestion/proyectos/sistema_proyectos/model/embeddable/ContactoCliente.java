package com.gestion.proyectos.sistema_proyectos.model.embeddable;

import jakarta.persistence.Embeddable;

@Embeddable

public class ContactoCliente {
    
    private String nombreRepresentante;
    private String emailContacto;
    private String telefono;

}
