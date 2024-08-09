package Episode5;

import java.io.FileNotFoundException;
import java.net.URISyntaxException;
import java.util.InputMismatchException;

public class NoWayOut {
    public static void main(String[] args) {
        try{
            method1();
        } catch(FileNotFoundException | NullPointerException e){
            System.out.println(e.getClass().getSimpleName());
        } catch(ArithmeticException | URISyntaxException ignore){

        }
    }

    public static void method1() throws FileNotFoundException, URISyntaxException,
            NullPointerException, ArithmeticException{
        int i = (int) (Math.random() * 4);
        if(i == 0){
            throw new FileNotFoundException();
        } else if(i == 1) {
            throw new NullPointerException();
        } else if(i == 2){
            throw new ArithmeticException();
        } else {
            throw new URISyntaxException("", "");
        }

    }
}
