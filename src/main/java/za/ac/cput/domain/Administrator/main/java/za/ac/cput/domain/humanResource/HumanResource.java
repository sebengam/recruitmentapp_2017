package za.ac.cput.domain.Administrator.main.java.za.ac.cput.domain.humanResource;

import java.io.Serializable;

public class HumanResource implements Serializable
{
    private Long id;
    private String name;
    private String surname;
    private String email;

    public HumanResource(Builder builder)
    {
        this.id = builder.id;
        this.name = builder.name;
        this.surname = builder.surname;
        this.email = builder.email;
    }

    public String getEmail() {
        return email;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }


    public static class Builder
    {
        private Long id;
        public String name;
        private String surname;
        private String email;



        public Builder id(Long value)
        {
            this.id = value;
            return this;
        }

        public Builder email(String value)
        {

            this.email = value;
            return this;
        }

        public Builder name(String value)
        {

            this.name = value;
            return this;
        }

        public Builder surname(String value)
        {
            this.surname = value;
            return this;
        }



        public Builder copy(HumanResource value)
        {
            this.id = value.id;
            this.name = value.name;
            this.surname = value.surname;
            this.email = value.email;
            return this;
        }

        public HumanResource build ()
        {
            return new HumanResource(this) {
            };
        }
    }


}
