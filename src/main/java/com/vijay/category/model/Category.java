package com.vijay.category.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Category {
    private Integer id;
    private String name;
    private List<Category> children;
    private Double totalSales;
    private Double totalQuantity;

    public Category(Integer id, String name, List<Category> children) {
        this.id = id;
        this.name = name;
        this.children = children;
    }
}
