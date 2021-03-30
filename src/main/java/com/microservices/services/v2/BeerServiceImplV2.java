package com.microservices.services.v2;

import com.microservices.web.model.BeerDto;
import com.microservices.web.model.v2.BeerDtoV2;
import com.microservices.web.model.v2.BeerStyleEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class BeerServiceImplV2  implements BeerServiceV2{
    @Override
    public BeerDtoV2 getBeerById (UUID beerId){
        return BeerDtoV2.builder()
                .id(UUID.randomUUID())
                .beerName("Galaxy Cat")
                .beerStyle(BeerStyleEnum.MEDHAT)
                .build();
    }

    @Override
    public BeerDtoV2 saveNewBeer(BeerDtoV2 beerDto) {
        return BeerDtoV2.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDtoV2 beerDto) {

    }

    @Override
    public void deleteById(UUID beerId) {
        log.debug("Deleting Beer...");
    }
}
