package com.project.lojavirtualbff.api.response;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class ProductsDTO {

    @JsonProperty(value = "id")
    @JsonIgnore
    private Long id;
    @JsonProperty(value = "id_to_entity")
    private String entityId;
    @JsonProperty(value = "title")
    private String name;
    @JsonProperty(value = "price")
    private BigDecimal price;
    @JsonProperty(value = "cetegory")
    private String category;
    @JsonProperty(value = "description")
    private String description;
    @JsonProperty(value = "image")
    private String image;

}
