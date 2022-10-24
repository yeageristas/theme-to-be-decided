package com.respawn.entities;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.envers.Audited;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
@Audited
public class EstadoPedido extends GenericModel {
    private String nombre;
}