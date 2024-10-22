package com.wora.Mapper;


import org.springframework.web.bind.annotation.Mapping;

import java.util.List;


public interface GenericMapper<D , T> {
    D toDTO(T entity);
    T toEntity(D dto);
    List<D> toListDTO(List<T> entityList);
    List<T> toEntityList(List<D> dtoList);
}
