package org.edu.entities;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

import java.util.List;

@Data
@Builder
public class Order {
    @NonNull private long id;
    @NonNull private Customer customer;
    @NonNull private Seller seller;
    @NonNull private List<Product> products;

}
