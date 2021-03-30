package com.microservices.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data // this will provide the getters and setters & request hashcode method for us
@NoArgsConstructor // this will create no args constructor
@AllArgsConstructor // this will create all args constructor
@Builder // this will implement builder design pattern
public class BeerDto {
    private UUID id;
    private String beerName;
    private String beerStyle;
    private Long upc;

}
