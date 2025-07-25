package com.movieflix.movieflix.dto.update;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryUpdateDTO {
    private Long id;

    @NotBlank(message = "The field name is required")
    @Size(min = 4, max = 100, message = "Name must be between 4 and 100 characters")
    private String name;
}
