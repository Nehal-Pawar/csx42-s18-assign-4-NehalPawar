package maxKVisitors.util;

import maxKVisitors.util.MyVector;
import maxKVisitors.util.MyArray;

public interface IVisitor
{
	void visit(MyVector myv);
	void visit(MyArray mya);
}