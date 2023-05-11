package solidprinciple.contentmanagement.isp.improved;

public interface Loan extends Payment {
    void intiateLoanSettlement();
    void initiateRePayment();
}