package za.ac.cput.domain.Administrator;

import java.io.Serializable;

/**
 * Created by Tank on 4/23/2016.
 */
public class AdminPayment implements Serializable
{   String id;
    String bank;
    String accountNumber;
    float amount;

    public AdminPayment(Builder builder) {
        this.id = builder.id;
        this.bank = builder.bank;
        this.accountNumber = builder.accountNumber;
        this.amount = builder.amount;
    }

    public float getAmount() {
        return amount;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getBank() {
        return bank;
    }

    public String getId() {
        return id;
    }

    public static class Builder
    {
        String id;
        String bank;
        String accountNumber;
        float amount;

        public Builder id(String value)
        {
            this.id = value;
            return this;
        }

        public Builder bank(String value)
        {
            this.bank = value;
            return this;
        }

        public Builder accountNumber(String value) {
            this.accountNumber = value;
            return this;
        }

        public Builder amount(float value) {
            this.amount = value;
            return this;
        }

        public AdminPayment build()
        {
            return new AdminPayment(this)
            {};
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AdminPayment)) return false;

        AdminPayment that = (AdminPayment) o;

        return getId().equals(that.getId());
    }

    @Override
    public int hashCode() {
        return getId().hashCode();
    }
}
