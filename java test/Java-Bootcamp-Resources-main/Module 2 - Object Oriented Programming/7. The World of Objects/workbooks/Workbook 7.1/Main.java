import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person person=new Person();
        person.name = "Sid";
        person.nationality = "Indian";
        person.dateOfBirth = "10/05/2003";
        person.passport = new String[]{person.name, person.nationality, person.dateOfBirth};
        person.seatNumber = 7;
        System.out.println(person.name);
        System.out.println(person.nationality);
        System.out.println(person.dateOfBirth);
        System.out.println(Arrays.toString(person.passport));
        System.out.println(person.seatNumber);

    }
}
