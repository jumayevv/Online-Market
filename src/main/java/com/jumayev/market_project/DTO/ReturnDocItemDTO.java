package com.jumayev.market_project.DTO;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Builder
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ReturnDocItemDTO {
    Long id;
    Integer return_doc_id;
    Integer store_doc_id;
    Integer count;
}
