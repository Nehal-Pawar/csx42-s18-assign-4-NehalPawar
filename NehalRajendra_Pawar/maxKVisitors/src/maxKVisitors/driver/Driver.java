package maxKVisitors.driver;

import maxKVisitors.util.FileProcessor;
import maxKVisitors.util.Results;
import maxKVisitors.util.MyLogger;
import maxKVisitors.util.IVisitor;
import maxKVisitors.util.PopulateVisitor;
import maxKVisitors.util.MyArray;
import maxKVisitors.util.MyVector;
import maxKVisitors.util.AddElementInterface;
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
	
	MyVector myv1=new MyVector(); 
        IVisitor Obj=new PopulateVisitor();
        myv1.setFileName(INPUTFILE);
	Obj.visit(myv1);
    }
}
