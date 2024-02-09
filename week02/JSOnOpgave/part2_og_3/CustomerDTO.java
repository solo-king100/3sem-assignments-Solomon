package JSOnOpgave.part2_og_3;

public class CustomerDTO {
    String fullName;
    String city;
    String zipCode;
    boolean isActive;

    CustomerDTO(String fullName, String city, String zipCode, boolean isActive) {
        this.fullName = fullName;
        this.city = city;
        this.zipCode = zipCode;
        this.isActive = isActive;
    }

    public String toString() {
        return "CustomerDTO{" +
                "fullName='" + fullName + '\'' +
                ", city='" + city + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", isActive='" + isActive + '\'' +
                '}';
    }
}
