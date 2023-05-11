package solidprinciple.contentmanagement.isp.violation;

import java.util.List;

public class BankPayment implements Payment {

    @Override
    public void initiatePayments() {
        // ...
    }

    @Override
    public Object status() {
        // ...
        return null;
    }

    @Override
    public List<Object> getPayments() {
        // ...
        return null;
    }

    @Override
    public void initiateLoanSettlement() {
        throw new UnsupportedOperationException("This is not a loan payment");
    }

    @Override
    public void initiateRePayment() {
        throw new UnsupportedOperationException("This is not a loan payment");
    }
}
