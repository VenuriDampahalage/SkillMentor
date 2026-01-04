package online.Skill_Mentor.dto;

import jakarta.validation.constraints.*;
import lombok.Data;
import org.hibernate.validator.constraints.URL;

@Data
public class PaymentsDTO {

    @NotNull
    @PositiveOrZero
    private int Session_id;

    @NotNull
    @PositiveOrZero
    private int Student_id;

    @NotBlank
    @URL
    private String reciept_url;

    @NotBlank
    private String notes;

}
