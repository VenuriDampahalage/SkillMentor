package online.Skill_Mentor.dto;

import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class MentorsDTO {

    @Email(message = "Invalid email format")
    @NotBlank(message = "Email is required")
    private String email;

    @NotBlank(message = "Enter the fiest name")
    @Size(min = 1, max = 100)
    private String first_Name;

    @NotBlank(message = "Enter the last name")
    @Size(min = 1, max = 100)
    private String last_Name;

    @NotBlank(message = "Enter your profession!")
    @Size(min = 1, max = 100)
    private String profession;

    @NotBlank(message = "Enter your Company!")
    private String company;

    @NotNull(message = "Enter experience Year(s)!")
    @PositiveOrZero
    private int experience_years;

    @Size(min = 1, max = 300)
    private String bio;
}
