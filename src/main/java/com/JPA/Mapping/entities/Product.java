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
@Table(name = "jpa_product")
public class Product {
    @Id
    private String pId;
    private String productName;

    @ManyToMany(mappedBy = "products",cascade = CascadeType.ALL)
    private List<Category> categories = new ArrayList<>();
}
