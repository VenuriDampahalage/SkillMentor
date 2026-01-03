package online.Skill_Mentor.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class PaymentsDTO {

    @NotNull(message = "Session Id must be included")
    @Positive
    private int Session_id;

    @NotNull(message = "Student Id must be include")
    @Positive
    private int Student_id;

    @NotBlank(message = "Put the reciept url!")
    private String reciept_url;
    
}
