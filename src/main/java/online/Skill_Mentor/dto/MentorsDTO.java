package online.Skill_Mentor.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.*;
import lombok.Data;

import java.time.LocalDate;

@Data
public class MentorsDTO {

    //Create
    @NotBlank(message = "Email Can't be empty")
    @Email(regexp = ".*@gmail\\.com$", message = "Email must be a @gmail.com address")
    private String email;

    @NotBlank(message = "The first name can not be empty")
    private String first_Name;

    @NotBlank(message = "The last name can not be empty")
    private String last_Name;

    @NotBlank(message = "Fill out the Profession")
    private String profession;

    @NotBlank(message = "Enter the company you work!")
    private String company;

    @PositiveOrZero
    @NotNull(message = "Enter the experience year!")
    private int experience_years;

    @Size(min = 2, max = 100, message = "Bio must be between 2 and 100 characters")
    private String bio;

}
