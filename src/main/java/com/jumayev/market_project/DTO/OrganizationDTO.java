package com.jumayev.market_project.DTO;


import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Builder
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class OrganizationDTO {
    Long id;

    String name;

    String address;
    String phone_number;

    Integer doc_number;

}
