
import java.io.*;
import java.util.HashSet;
import java.util.Scanner;
import java.io.File;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Set;

public class DuplicateRemover
{
   public static  Set<String> masterSet= new HashSet<String>();

    public static void remove(String dataFile) throws IOException
    {
        BufferedReader buffRead=new BufferedReader(new FileReader(dataFile) );
        String line =buffRead.readLine();
      while(buffRead.readLine()!=null) {
          line = buffRead.readLine();
          masterSet.add(line);
      }

    }



public static void write(String outputFile) throws FileNotFoundException
{File destination = new File(outputFile);
   // destination.getParentFile().mkdirs();
    PrintWriter printer = new PrintWriter(outputFile);
    printer.write(masterSet.toString());
    printer.flush();
    printer.close();

}



}