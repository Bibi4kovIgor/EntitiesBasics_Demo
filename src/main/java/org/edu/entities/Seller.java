package org.edu.entities;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

import java.util.List;

@Data
@Builder
public class Seller {
    @NonNull private long id;
    @NonNull private String name;
    @NonNull private List<Payment> accounts;
    @NonNull private Address legalAddress;

    List<Product> propositions;
}
