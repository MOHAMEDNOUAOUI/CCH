package com.wora.Mapper;

import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface GenericMapper<D , T> {
    D toDTO(T entity);
    T toEntity(D dto);
    List<D> toListDTO(List<T> entityList);
    List<T> toEntityList(List<D> dtoList);
}
