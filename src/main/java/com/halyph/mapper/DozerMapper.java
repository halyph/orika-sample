package com.halyph.mapper;

//import ma.glasnost.orika.MapperFacade;

public class DozerMapper implements Mapper {

    private final org.dozer.Mapper mapper;

    public DozerMapper(org.dozer.Mapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public <S, D> D map(S sourceObject, Class<D> destinationClass) {
        return mapper.map(sourceObject, destinationClass);
    }
}
