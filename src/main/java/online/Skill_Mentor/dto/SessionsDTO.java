package online.Skill_Mentor.dto;

import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class SessionsDTO {

    @NotNull
    @PositiveOrZero
    private int student_Id;

    @NotNull
    @PositiveOrZero
    private int mentor_Id;

    @NotNull
    @PositiveOrZero
    private int session_at;

    @Min(0)
    @PositiveOrZero
    private int duration_minutes;

    @NotBlank
    private String session_status;

    @NotBlank
    private String meeting_links;

    @NotBlank
    private String session_notes;

    @Size(min = 0, max = 200)
    private String student_review;

    @PositiveOrZero
    @Size(min = 0, max = 5)
    private int student_rating;

}
