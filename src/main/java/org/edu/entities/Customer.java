package org.edu.entities;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

import java.util.List;

@Data
@Builder
public class Customer {
    @NonNull private long id;
    @NonNull private String name;
    private List<Address> addresses;
    private List<Payment> payments;

}
