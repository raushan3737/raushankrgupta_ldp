package solidprinciple.contentmanagement.isp.violation;

import java.util.List;

public interface Payment {
    void initiatePayments();
    Object status();
    List<Object> getPayments();
    void initiateLoanSettlement();
    void initiateRePayment();
}
