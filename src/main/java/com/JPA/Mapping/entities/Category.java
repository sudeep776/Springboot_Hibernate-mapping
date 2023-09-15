package com.JPA.Mapping.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="jpa_category")
public class Category {
    @Id
    private String cId;
    private String title;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Product> products = new ArrayList<>();
}
