package online.Skill_Mentor.controllers.v1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import online.Skill_Mentor.entities.Mentor;
import online.Skill_Mentor.services.MentorService;
import online.Skill_Mentor.services.impl.MentorServiceImpl;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController("api/v1/mentor")
@AllArgsConstructor
@Data
public class MentorController {
    private final ModelMapper modelMapper;
    private final MentorServiceImpl mentorService;

    //Read
    @GetMapping
    public List<Mentor> getMentor() {
        return mentorService.getAllMentors();
    }

    //Read by id
    @GetMapping("/{id}")
    public Mentor getMentorById(@PathVariable Long id) {
        return mentorService.getMentorById(id);
    }

    //Create
    @PostMapping
    public Mentor createMentor(@RequestBody Mentor mentor) {
        Mentor newMentor = modelMapper.map(mentor, Mentor.class);
        return mentorService.createMentor(newMentor);
    }

    //Update
    @PutMapping("/{id}")
    public Mentor updateMentor(@RequestBody Mentor mentor, @PathVariable Long id) {
        Mentor newMentor = modelMapper.map(mentor, Mentor.class);
        return mentorService.updateMentor(id, newMentor);
    }

    //Delete
    @DeleteMapping("/{id}")
    public void deleteMentor(@PathVariable Long id) {
        mentorService.deleteMentorById(id);
    }

}
