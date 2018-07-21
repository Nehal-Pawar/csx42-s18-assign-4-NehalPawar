package maxKVisitors.util;

public class PopulateVisitor implements IVisitor
{
	public void visit(MyVector myv)
	{
		FileProcessor F1 = new FileProcessor();
	        F1.openFile(myv.getFileName());
		String number = "";
		while (number != null) {
			number = F1.nextint();
			if(number == null)break;
					System.out.println(number);
					myv.addelement(Integer.parseInt(number));	
		}
	}

	public void visit(MyArray mya)
	{
		
	}
}
