package online.Skill_Mentor.services;

import online.Skill_Mentor.entities.Payments;

import java.util.List;

public interface PaymentsService {
    List<Payments> getAllPayments();
    Payments getPaymentById(Long id);
    Payments createPayment(Payments payment);
    Payments updatePayment(Long id, Payments  payment);
    Payments patchPayment(Long id, Payments  payment);
    void deletePaymentById(Long id);
    List<Payments> getOrderPayments(List<Payments> payments);
}
