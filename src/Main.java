import java.io.*;

/**
 * Created by Gaute Nybø on 21.04.2015.
 */
public class Main{

    public static void main(String[] args) {


        try(BufferedReader br = new BufferedReader(new FileReader("file.txt"))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
            String everything = sb.toString();
            int lengde = everything.length();
            System.out.print(everything.length());
            String nyAlt = "";

            for(int i =0; i< lengde; i++){

                char cahrtull = everything.charAt(i);
                if (everything.charAt(i)=='(') {
                    while (cahrtull != ')') {
                        cahrtull = everything.charAt(i);
                        i++;
                    }
                }else {
                    nyAlt = nyAlt + cahrtull;
                }


            }


            File file = new File("example.txt");
            BufferedWriter output = new BufferedWriter(new FileWriter(file));
            output.write(nyAlt);
            output.close();



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }








    }







}


