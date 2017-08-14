package za.ac.cput.domain.Administrator;

import java.io.Serializable;

/**
 * Created by student on 2016/04/03.
 */
public class Administrator implements Serializable
{
    private String id;
    private String staffNumber;

    public Administrator (Builder builder)
    {   this.id = builder.id;
        this.staffNumber = builder.staffNumber;
    }

    public String getStaffNumber() {
        return staffNumber;
    }


    public String getId() {
        return id;
    }

    public static class Builder
    {
        String id;
        String staffNumber;

        public Builder id(String value)
        {
            this.id = value;
            return this;
        }

        public Builder staffNumber(String value)
        {
            this.staffNumber = value;
            return this;
        }

        public Administrator build()
        {
            return new Administrator(this) {};
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Administrator)) return false;

        Administrator that = (Administrator) o;

        return getId().equals(that.getId());
    }

    @Override
    public int hashCode() {
        return getId().hashCode();
    }
}
