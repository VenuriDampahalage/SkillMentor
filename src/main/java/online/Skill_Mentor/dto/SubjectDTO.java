package online.Skill_Mentor.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class SubjectDTO {

    @NotBlank
    @Size(min = 2, max = 20, message = "Name must be between 2 and 20 characters")
    private String Name;

    @NotBlank
    @Size(min = 10, max = 200, message = "Description must be between 10 and 200 characters")
    private String Description;
}
