package online.Skill_Mentor.controllers.v1;

import lombok.AllArgsConstructor;
import lombok.Data;
import online.Skill_Mentor.dto.PaymentsDTO;
import online.Skill_Mentor.entities.Payment;
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
    public List<Payment> getAllSubjects() {
        return paymentService.getAllPayments();
    }

    //Create resource
    @PostMapping
    public Payment createSubject(@Validated @RequestBody PaymentsDTO newPayment) {
        Payment payment = modelMapper.map(newPayment, Payment.class);
        return paymentService.createPayment(payment);
    }
}
