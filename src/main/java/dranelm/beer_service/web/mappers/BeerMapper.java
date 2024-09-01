package dranelm.beer_service.web.mappers;

import dranelm.beer_service.domain.Beer;
import dranelm.beer_service.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {
    Beer beerDtoToBeer(BeerDto beerDto);
    BeerDto beerToBeerDto(Beer beer);
}
