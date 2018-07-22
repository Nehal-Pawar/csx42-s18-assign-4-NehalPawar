package maxKVisitors.util;

import java.util.*;

public  class MyVector implements AddElementInterface
{  
	 Vector<Integer> vec = new Vector<Integer>();
	public  String FileName;
	static int K;
	public String Results;
	Results result=new Results(); 
	/**
	 * This method adds elemtnts from fileprocessor tp MyVector vector
	 * @param int number from fileprocessor
	 */

	public void addelement(int number)
	{
		 vec.add(number);		
	}
	
	/**
	 * This method sets file that is send to  fileprocessor 
	 * @param String Name
	 */
	public void  setFileName(String Name)
	{
		FileName=Name;
	}
	
	/**
	 * This method reutrns  filename that is send to  fileprocessor 
	 * @return String Name
	 */
	public String getFileName()
	{
		return FileName;
	}

	/**
	 * This method reutrns vector
	 * @return Vector<Integer>
	 */
	public Vector<Integer> getvec()
	{
		return vec;
	}
	
	/**
	 * This method calls the compile time Visitor class vector
	 * @param IVisitor
	 */
	public void accept(IVisitor Visitor)
	{
		Visitor.visit(this);
	}
	
	public int getK()
	{
		return K;
	}
		
	public void setK(int Re)
	{
		K=Re;
	}

	public String getResults()
	{
		return Results;
	}
		
	public void setResults(String Re)
	{
		Results=Re;
	}
}
