package iskl_seminar_03;

import java.io.IOException;

import iskl_seminar_03.check.CheckForm;
import iskl_seminar_03.save.SaveFile;
import iskl_seminar_03.user.User;

public class Main {
    public static void main(String[] args) {

        User user1 = new User();
        CheckForm check = new CheckForm();
        

        check.checkForm(user1);
        try {
            SaveFile saveFile = new SaveFile(user1);
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
}
