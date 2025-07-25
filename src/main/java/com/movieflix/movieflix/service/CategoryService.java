package com.movieflix.movieflix.service;

import com.movieflix.movieflix.dto.list.CategoryListDTO;
import com.movieflix.movieflix.mapper.CategoryMapper;
import com.movieflix.movieflix.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryService {

   private final CategoryRepository categoryRepository;
   private final CategoryMapper categoryMapper;

    public List<CategoryListDTO> getCategories() {
        return categoryRepository.findAll().stream().map(categoryMapper::toListDTO).toList();
    }

}
