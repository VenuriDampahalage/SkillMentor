package online.Skill_Mentor.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class StudentDTO {
    @NotBlank

    private String first_name;

    @NotBlank
    private String last_name;

    @NotBlank
    @Size(min = 1, max = 300)
    private String learning_goals;

}

