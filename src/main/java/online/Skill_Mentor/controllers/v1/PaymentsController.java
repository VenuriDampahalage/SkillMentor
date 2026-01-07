package online.Skill_Mentor.controllers.v1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import online.Skill_Mentor.dto.PaymentsDTO;
import online.Skill_Mentor.dto.SubjectDTO;
import online.Skill_Mentor.entities.Payments;
import online.Skill_Mentor.entities.Subject;
import online.Skill_Mentor.services.SubjectService;
import online.Skill_Mentor.services.impl.PaymentServiceImpl;
import org.modelmapper.ModelMapper;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/payments")
@AllArgsConstructor
@Data
public class PaymentsController {
    private final ModelMapper modelMapper;
    private final PaymentServiceImpl paymentService;

    //Retrieve resources
    @GetMapping
    public List<Payments> getAllSubjects() {
        return PaymentServiceImpl.getAllPayments();
    }

    //Create resource
    @PostMapping
    public Payments createSubject(@Validated @RequestBody PaymentsDTO newPayment) {
        Payments payments = modelMapper.map(newPayment, Payments.class);
        return PaymentServiceImpl.createPayment(payments);
    }
}
