package za.ac.cput.domain.Administrator.main.java.za.ac.cput.domain.Administrator;
import java.io.Serializable;

public class Administrator implements Serializable
{
    private Long id;
    private String staffNumber;

    public Administrator (Builder builder)
    {   this.id = builder.id;
        this.staffNumber = builder.staffNumber;
    }

    public String getStaffNumber() {
        return staffNumber;
    }


    public Long getId() {
        return id;
    }

    public static class Builder
    {
        Long id;
        String staffNumber;

        public Builder id(Long value)
        {
            this.id = value;
            return this;
        }

        public Builder staffNumber(String value)
        {
            this.staffNumber = value;
            return this;
        }

        public Builder copy(Administrator administrator)
        {
            this.id = administrator.id;
            this.staffNumber = administrator.getStaffNumber();


            return this;
        }


        public Administrator build()
        {
            return new Administrator(this) {};
        }


    }

}
