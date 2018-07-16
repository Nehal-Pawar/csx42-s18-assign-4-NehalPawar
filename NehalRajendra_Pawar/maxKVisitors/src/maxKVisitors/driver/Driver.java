package maxKVisitors.driver;

import maxKVisitors.util.FileProcessor;
import maxKVisitors.util.Results;
import maxKVisitors.util.MyLogger;
import java.util.*;

public class Driver
{
    public static void main(String[] args)
    {
        String INPUTFILE = args[0];
       /* String DELETEFILE = args[1];
        String OUTPUTFILE1 = args[2];
        String OUTPUTFILE2 = args[3];
        String OUTPUTFILE3 = args[4];
        String DEBUGVALUE = args[5];
	*/
        //Read all the parameters and vlaidate if all are taken thorugh command line

        for (int i = 0; i < args.length; i++)
            if (args[i].equals("${arg" + i + "}"))
            {               
                System.err.println("incorrect args passed, Expected <input.txt> <delete.txt> <output1.txt> <output2.txt> <output3.txt> <debug value>. \n exiting \n");
                System.exit(1);
            }

        try
        {
          //  MyLogger.setDebugValue(Integer.parseInt(args[5]));
        }
        catch (Exception e)
        {
            System.err.println("fifth argument cannot be parse to integer to set debug value.");
            System.exit(1);
        }

       
        //Read file and add to array
        FileProcessor F1 = new FileProcessor();
        F1.openFile(INPUTFILE);
		String number = "";
		while (number != null) {
			number = F1.nextint();
			if(number == null)break;
					System.out.println(number);	
		}
    }
}