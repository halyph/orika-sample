package com.halyph.mapper;

import ma.glasnost.orika.MapperFacade;

public class OrikaMapper implements Mapper {

    private final MapperFacade mapper;

    public OrikaMapper(MapperFacade mapper) {
        this.mapper = mapper;
    }

    @Override
    public <S, D> D map(S sourceObject, Class<D> destinationClass) {
        return mapper.map(sourceObject, destinationClass);
    }
}
