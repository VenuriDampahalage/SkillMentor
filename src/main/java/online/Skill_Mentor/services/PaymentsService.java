package online.Skill_Mentor.services;

import online.Skill_Mentor.entities.Payment;

import java.util.List;

//no usage = 2

public interface PaymentsService {
    List<Payment> getAllPayments();
    Payment getPaymentById(Long id);
    Payment createPayment(Payment payment);
    Payment updatePayment(Long id, Payment payment);
    Payment patchPayment(Long id, Payment payment);
    void deletePaymentById(Long id);
    List<Payment> getOrderPayments(List<Payment> payments);
}
