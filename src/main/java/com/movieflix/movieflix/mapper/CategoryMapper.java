package com.movieflix.movieflix.mapper;

import com.movieflix.movieflix.dto.list.CategoryListDTO;
import com.movieflix.movieflix.entity.CategoryEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CategoryMapper {
    CategoryListDTO toListDTO(CategoryEntity categoryEntity);
}
