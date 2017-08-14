package za.ac.cput.domain.humanResource;

import java.io.Serializable;

public class HumanResource implements Serializable
{
    private String id;
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

    public String getId() {
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
        private String id;
        public String name;
        private String surname;
        private String email;



        public Builder id(String value)
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

        public HumanResource build ()
        {
            return new HumanResource(this) {
            };
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof HumanResource)) return false;

        HumanResource that = (HumanResource) o;

        return getId().equals(that.getId());
    }

    @Override
    public int hashCode() {
        return getId().hashCode();
    }
}
