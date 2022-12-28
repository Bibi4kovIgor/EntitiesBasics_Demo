package org.edu.entities;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

import java.math.BigDecimal;

@Data
@Builder
public class Product {
    @NonNull private long id;
    @NonNull private String name;
    private String description;
    @NonNull private BigDecimal price;
    private long quantity;
}
