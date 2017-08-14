package za.ac.cput.domain.humanResource;

public class HumanResourceLocation
{
    public String id;
    double number;
    String street;
    String surburb;
    String city;
    String province;

    public HumanResourceLocation(Builder builder) {
        this.id = builder.id;
        this.number = builder.number;
        this.street = builder.street;
        this.surburb = builder.surburb;
        this.city = builder.city;
        this.province = builder.province;

    }


    public String getId() {
        return id;
    }

    public double getNumber() {
        return number;
    }

    public String getStreet() {
        return street;
    }

    public String getSurburb() {
        return surburb;
    }

    public String getCity() {
        return city;
    }

    public String getProvince() {
        return province;
    }

    public static class Builder
    {
        String id;
        double number;
        String street;
        String surburb;
        String city;
        String province;

        public Builder id(String value)
        {
            this.id = value;
            return this;
        }

        public Builder number(double value)
        {
            this.number = value;
            return this;
        }

        public Builder street(String value) {
            this.street = value;
            return this;
        }

        public Builder surburb(String value) {
            this.surburb = value;
            return this;
        }

        public Builder city(String value) {
            this.city = value;
            return this;

        }

        public Builder province(String status) {
            this.province = status;
            return this;
        }

        public HumanResourceLocation build(){

            return new HumanResourceLocation(this)
            {
            };
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof HumanResourceLocation)) return false;

        HumanResourceLocation that = (HumanResourceLocation) o;

        return getId().equals(that.getId());
    }

    @Override
    public int hashCode() {
        return getId().hashCode();
    }
}
