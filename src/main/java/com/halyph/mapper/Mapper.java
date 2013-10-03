package com.halyph.mapper;

public interface Mapper {

    <S, D> D map(S sourceObject, Class<D> destinationClass);

}
