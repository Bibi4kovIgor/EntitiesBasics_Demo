package org.edu.entities;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Data
@Builder
public class Address {
    @NonNull private long id;
    @NonNull private String country;
    @NonNull private String city;
    @NonNull private String street;
    @NonNull private String houseNumber;
    private String flatNumber;

}
