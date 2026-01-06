package online.Skill_Mentor.services.impl;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import online.Skill_Mentor.entities.Payments;
import online.Skill_Mentor.services.PaymentsService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@NoArgsConstructor
@Data
public class PaymentServiceImpl implements PaymentsService {


    @Override
    public List<Payments> getPayments() {
        return List.of();
    }

    @Override
    public Payments getPaymentById(Long id) {
        return null;
    }

    @Override
    public Payments createPayment(Payments payment) {
        return null;
    }

    @Override
    public Payments updatePayment(Long id, Payments payment) {
        return null;
    }

    @Override
    public Payments patchPayment(Long id, Payments payment) {
        return null;
    }

    @Override
    public void deletePaymentById(Long id) {

    }

    @Override
    public List<Payments> getOrderPayments(List<Payments> payments) {
        return List.of();
    }
}
