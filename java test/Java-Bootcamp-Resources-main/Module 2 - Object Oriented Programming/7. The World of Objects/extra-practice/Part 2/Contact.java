import java.time.LocalDate;
import java.time.Period;

public class Contact {
    private String name;
    private String phoneNumber;
    private String birthDate;
    private int age;


    public Contact(String name, String phoneNumber, String birthDate) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.birthDate = birthDate;
        // this.age = age;
        this.age=toAge(birthDate);
    }

    public Contact(Contact source) {
        this.name = source.name;
        this.phoneNumber = source.phoneNumber;
        this.birthDate = source.birthDate;
        this.age = source.age;
    }

    public int toAge(String birthDate) {
        // Your implementation here
        LocalDate birthDateLocal = LocalDate.parse(birthDate);
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(birthDateLocal, currentDate);
        return period.getYears();
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getBirthDate() {
        return this.birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
        setAge(birthDate);
    }

    public int getAge() {
        return this.age;
    }

    private void setAge(String birthDate) {
        this.age = toAge(birthDate);
    }

}
