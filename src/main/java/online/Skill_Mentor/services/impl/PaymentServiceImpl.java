package online.Skill_Mentor.services.impl;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import online.Skill_Mentor.entities.Payment;
import online.Skill_Mentor.entities.Subject;
import online.Skill_Mentor.repositories.PaymentsRepo;
import online.Skill_Mentor.services.PaymentsService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@NoArgsConstructor(force = true)
@Data
public class PaymentServiceImpl implements PaymentsService {

    private final PaymentsRepo paymentsRepository;

    @Override
    public List<Payment> getAllPayments() {
        return paymentsRepository.findAll();
    }

    @Override
    public Payment getPaymentById(Long id) {
        if (paymentsRepository.existsById(id)) {
            return paymentsRepository.findById(id).get();
        }
        else{
            return null;
        }
    }

    @Override
    public Payment createPayment(Payment payment) {
        Payment newPayment = paymentsRepository.save(payment);
        return newPayment;
    }

    @Override
    public Payment updatePayment(Long id, Payment payment) {
         if (paymentsRepository.existsById(id)) {
             Payment oldPayment = paymentsRepository.findById(id).get();
             oldPayment.setSession_id(payment.getSession_id());
             oldPayment.setStudent_id(payment.getStudent_id());
             oldPayment.setReciept_url(payment.getReciept_url());
             oldPayment.setNotes(payment.getNotes());
         }
        return null;
    }

    @Override
    public Payment patchPayment(Long id, Payment payment) {
        return null;
    }

    @Override
    public void deletePaymentById(Long id) {
        if (paymentsRepository.existsById(id)) {
            paymentsRepository.deleteById(id);
        }
        else
            return;
    }

    @Override
    public List<Payment> getOrderPayments(List<Payment> payments) {
        return List.of();
    }
}
