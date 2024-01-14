package iskl_seminar_03.exception;

public class EmptyFormException extends RuntimeException{
    public String message;

    public EmptyFormException(String message){
        System.out.println();
        System.out.println(this.message = message);
        System.out.println();
    }
}
