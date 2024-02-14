/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.EasyRent.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author Lenovo
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Property {
    
    /**
     * @Id = Indica la clave primaria de la entidad
     * @GeneratedValue =Genera un Id Numerico
     * @GenericGenerator = Identificadores UUID (universally unique Identifier)
     * @Column = Cambia lo longitud a 36 cracterespara UUID
     */
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(length = 36)
    private String id;
    
    private String name;
    private String description;
    private String location;
    private int room;
    private int bathroom;
    private int parking;
    private int beds;
    private int guests;
    private Boolean state;
    private float price;
    private float puntuacion;
    private int nReviews;
    
    @ManyToOne
    private User user;
    
    @ManyToOne
    private Service service;
    
    @ManyToOne
    private PropertyType propertyType;
    
    @ManyToOne
    private PhotoProperty photoProperty;
    
    
}
