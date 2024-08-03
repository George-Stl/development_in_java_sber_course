package Episode3;

import java.io.*;

public class MartialLaw {
    public static void main(String[] args) throws Exception{
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String name1 = bufferedReader.readLine();
        String name2 = bufferedReader.readLine();


        if (((name1.equals("Anakin"))|(name1.equals("Obi-Wan")))&((name2.equals("Obi-Wan"))|(name2.equals("Anakin"))))
            System.out.println(name1 + " and " + name2 + " - friends");
        else if (((name1.equals("Anakin"))||(name1.equals("Obi-Wan")))&&((!name2.equals("Obi-Wan"))&&(!name2.equals("Anakin"))))
            System.out.println(name1 + " - friend, " + name2 + " - foe");
        else if (((!name1.equals("Anakin"))&&(!name1.equals("Obi-Wan")))&&((name2.equals("Obi-Wan"))||(name2.equals("Anakin"))))
            System.out.println(name2 + " - friend, " + name1 + " - foe");
        else
            System.out.println(name1 + " and " + name2 + " - foes");
    }
}

