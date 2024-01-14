package iskl_seminar_03.user;

import java.time.LocalDate;

public class User {
    UserEnter ui = new UserEnter();

    public String firstName;
    public String secondName;
    public String lastName;
    public LocalDate birthDay;
    public String phoneNumber;
    public Character sex;

    public User() {
        this.firstName = ui.getFirstName();
        this.secondName = ui.getSecondName();
        this.lastName = ui.getLastName();
        this.birthDay = ui.getBirthday();
        this.phoneNumber = ui.getPhoneNumber();
        this.sex = ui.getSex();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Character getSex() {
        return sex;
    }
}
