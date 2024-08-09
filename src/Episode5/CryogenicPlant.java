package Episode5;

import java.util.ArrayList;

public class CryogenicPlant {
    public static void main(String[] args) {
        try{
            ArrayList<String> list = new ArrayList<>();
            list.get(18);
        } catch(IndexOutOfBoundsException e){
            System.out.println(e.getLocalizedMessage());
        }


    }
}
