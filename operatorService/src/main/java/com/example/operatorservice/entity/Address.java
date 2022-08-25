package com.example.operatorservice.entity;

import com.example.operatorservice.entity.templete.AbsNameEntity;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Setter
@Getter
@ToString
public class Address extends AbsNameEntity {
    @ManyToOne
    private User user;
    private Double lat;
    private Double lon;
    private String target;
}
