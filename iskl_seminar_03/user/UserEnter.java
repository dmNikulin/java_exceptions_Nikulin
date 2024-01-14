package iskl_seminar_03.user;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class UserEnter {

    private Scanner in = new Scanner(System.in);
    private String firstName;
    private String secondName;
    private String lastName;
    private String birthDay;
    private String phoneNumber;
    private char sex;

    public String getFirstName(){
        System.out.println("Введите фамилию: ");
        return this.firstName = in.nextLine();
    }

    public String getSecondName(){
        System.out.println("Введите имя: ");
        return this.secondName = in.nextLine();
    }

    public String getLastName(){
        System.out.println("Введите отчество: ");
        return this.lastName = in.nextLine();
    }

    public LocalDate getBirthday() throws RuntimeException{
        System.out.println("Введите дату рождения в формате dd.mm.yyyy: ");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        this.birthDay = in.nextLine();
        try {
            LocalDate time = LocalDate.parse(this.birthDay, formatter);
            return time;
        } catch (Exception e) {
           throw new RuntimeException("Неверно введена дата");
        }
    }

    public String getPhoneNumber() throws NumberFormatException {
        System.out.println("Введите номер телефона: ");
        String number =  in.nextLine();
        try {
            for (Character i : number.toCharArray()) {
                if (Character.isDigit(i)) {
                    continue;
                }
                else {
                    throw new RuntimeException("Неправильно введен номер!");
                }
            }
            return number;
        } catch (Exception e) {
            throw new NumberFormatException();
        }
    }

    public Character getSex() throws RuntimeException{
        System.out.println("Введите пол (male -> m, female - f): ");
        try {
            Character ch = this.sex = Character.toLowerCase(in.nextLine().charAt(0));
            
            if (ch.equals('m') || ch.equals('f')) {
               return ch;
            }
            
            else {
                throw new RuntimeException("Неверно введен пол. Используйте формат m/f.");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
