package iskl_seminar_03.check;

import iskl_seminar_03.exception.EmptyFormException;
import iskl_seminar_03.user.User;

public class CheckForm {

    public void checkForm(User user) {
        if (user.getFirstName() == "" || user.getFirstName() == null) {
            throw new EmptyFormException("Поле фамилии не заполнено. Введите данные снова.");
        }
        if (user.getSecondName() == "" || user.getSecondName() == null) {
            throw new EmptyFormException("Поле имени не заполнено. Введите данные снова.");
        }
        if (user.getLastName() == "" || user.getLastName() == null) {
            throw new EmptyFormException("Поле отчества не заполнено. Введите данные снова.");
        }
        if (user.getBirthDay() == null) {
            throw new EmptyFormException("Поле дня рождения не заполнено. Введите данные снова.");
        }
        if (user.getPhoneNumber() == "" || user.getPhoneNumber() == null) {
            throw new EmptyFormException("Поле телефона не заполнено. Введите данные снова.");
        }
        if (user.getSex().equals(' ')) {
            throw new EmptyFormException("Поле телефона не заполнено. Введите данные снова.");
        }
        
    }
}
