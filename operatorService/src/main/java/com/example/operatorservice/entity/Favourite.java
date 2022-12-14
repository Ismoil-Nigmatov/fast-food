package com.example.operatorservice.entity;

import com.example.operatorservice.entity.templete.AbsEntity;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Favourite extends AbsEntity {
    @OneToOne
    private User user;
    @OneToMany
    private List<Product> productList;
}
