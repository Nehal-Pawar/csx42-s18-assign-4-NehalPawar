package maxKVisitors.util;

import java.util.*;

public  class MyVector implements AddElementInterface
{  
	 Vector<Integer> vec = new Vector<Integer>();
	public  String FileName;

	public void addelement(int number)
	{
		 vec.add(number);		
	}
	public void  setFileName(String Name)
	{
		FileName=Name;
	}
	public String getFileName()
	{
		return FileName;
	}

}
