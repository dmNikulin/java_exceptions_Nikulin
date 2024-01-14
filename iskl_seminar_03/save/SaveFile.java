package iskl_seminar_03.save;

import java.io.FileWriter;
import java.io.IOException;

import iskl_seminar_03.user.User;

public class SaveFile {

    public SaveFile(User user) throws IOException{
        try (FileWriter writer = new FileWriter("iskl_seminar_03\\data\\users.txt", true)) {
            writer.write("Фамилия: " + user.getFirstName() + ", ");
            writer.write("Имя: " + user.getSecondName() + ", ");
            writer.write("Отчество: " + user.getLastName() + ", ");
            writer.write("Дата рождения: " + user.getBirthDay().toString() + ", ");
            writer.write("Номер телефона: " + user.getPhoneNumber() + ", ");
            writer.write("Пол: " + user.getSex() + ";");
            writer.write("\n");
        }catch(IOException e){
            throw new IOException(e);
        }
    }
}
