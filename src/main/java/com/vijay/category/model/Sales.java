package com.vijay.category.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Sales {

    private Integer productId;
    private Integer leafCategoryId;
    private Integer primaryCategoryId;
    private Double amount;
    private Double quantity;

}
