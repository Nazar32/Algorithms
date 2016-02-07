package Garbage;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * Created by Java on 06.02.2016.
 */
public class OnesCounter {
    public static void main(String[] args) {


        try

        {
            File outFile = new File("E:\\input.txt");
            File inFile  = new File("E:\\output.txt");

            FileReader reader = new FileReader(outFile);
            int counter = 0;
            Integer temp = 0;

            while(reader.ready()) {

                if ((char)reader.read() == '1') {

                    counter++;
                }

                else {

                    counter = 0;
                }

                if (temp < counter) {

                    temp = counter;
                }
            }

            System.out.println(temp);
            FileWriter writer = new FileWriter(inFile);
            writer.append(temp.toString());
            reader.close();
            writer.close();

        } catch (Exception e) {

            System.out.println(e.getMessage());
        }
    }
}
