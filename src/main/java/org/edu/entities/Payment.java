package org.edu.entities;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Data
@Builder
public class Payment {
    @NonNull private long id;
    @NonNull private String IBAN;
    @NonNull private String name;
}
