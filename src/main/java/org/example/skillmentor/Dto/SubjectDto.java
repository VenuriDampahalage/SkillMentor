package org.example.skillmentor.Dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.Date;

@Data
public class SubjectDto {
    private Long id;

    @NotBlank(message = "Name can't be empty")
    @Size(min = 1, max = 100, message = "Name must be betweeb 1 and 100 characters")
    private String name;

    @NotEmpty(message = "")
    @Size(min = 1, max = 300, message = "")
    private String description;

    private Date createAt;
    private Date updateAt;
}

