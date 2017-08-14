package za.ac.cput.factory.administrator;

import za.ac.cput.domain.Administrator.AdminPayment;

import java.util.Map;

public class AdminPaymentFactory
{
    public static AdminPayment getAdminPayment(Map<String, String> values, float amount)
    {
        AdminPayment myAdminPayment = new AdminPayment.Builder()
                .amount(amount)
                .bank(values.get("bank"))
                .accountNumber(values.get("accountNumber"))
                .id(values.get("id"))
                .build();
        return myAdminPayment;

    }
}
