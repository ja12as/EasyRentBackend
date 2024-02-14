/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.EasyRent.entity;

import java.util.Date;
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
public class CustomerOpinion {
     @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(length = 36)
    private String id;
    
    private String qualifying;
    private String comment;
    private Date date;
    
    @ManyToOne
    private MultimediaOpinion multimediaOpinion;
    
    @ManyToOne
    private Property property;
    
    @ManyToOne
    private User user;
    
}
