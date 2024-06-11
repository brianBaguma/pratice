package Project.ADSDentalSurgeries.Model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long addressid;
    private String street;
    private String city;
    private String Zipcode;
    //relationship
    @ManyToOne
    @JoinColumn(name = "patientid")
    private Patient patient;

    public Address(Long addressid, String street, String city, String zipcode, Patient patient) {
        this.addressid = addressid;
        this.street = street;
        this.city = city;
        Zipcode = zipcode;
        this.patient = patient;
    }

    @Override
    public String toString() {
        return "Address{" +
                "addressid=" + addressid +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", Zipcode='" + Zipcode + '\'' +
                ", patient=" + patient +
                '}';
    }

    public Long getAddressid() {
        return addressid;
    }

    public void setAddressid(Long addressid) {
        this.addressid = addressid;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipcode() {
        return Zipcode;
    }

    public void setZipcode(String zipcode) {
        Zipcode = zipcode;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(addressid, address.addressid) && Objects.equals(street, address.street) && Objects.equals(city, address.city) && Objects.equals(Zipcode, address.Zipcode) && Objects.equals(patient, address.patient);
    }

    @Override
    public int hashCode() {
        return Objects.hash(addressid, street, city, Zipcode, patient);
    }
}
