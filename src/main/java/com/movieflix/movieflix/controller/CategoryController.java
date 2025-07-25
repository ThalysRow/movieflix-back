package com.movieflix.movieflix.controller;

import com.movieflix.movieflix.dto.create.CategoryCreateDTO;
import com.movieflix.movieflix.dto.list.CategoryListDTO;
import com.movieflix.movieflix.service.CategoryService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movieflix/category")
@RequiredArgsConstructor
public class CategoryController {
    private final CategoryService categoryService;

    @GetMapping("/all")
    public ResponseEntity<List<CategoryListDTO>> getAllCategories(){
        List<CategoryListDTO> categories = categoryService.getCategories();
        return ResponseEntity.status(HttpStatus.OK).body(categories);
    }

}
