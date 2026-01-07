package online.Skill_Mentor.controllers.v1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import online.Skill_Mentor.services.impl.MentorServiceImpl;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.RestController;


@RestController("api/v1/mentor")
@AllArgsConstructor
@Data
public class MentorController {
    private final ModelMapper modelMapper;
    private final MentorServiceImpl mentorService;

}
