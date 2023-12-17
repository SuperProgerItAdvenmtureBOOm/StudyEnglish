package MyExceptions;

public class WrongInputWordException extends Exception{
    public WrongInputWordException(){

    }

    public void printWarning() {
        System.out.println("warning");
    }
}
