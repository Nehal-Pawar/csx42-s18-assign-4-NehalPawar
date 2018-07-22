package maxKVisitors.util;

import java.util.*;

public class MaxHeapVisitor implements IVisitor
{
	int size;
	
	/**
	 * This method sorts elemtnts from MyVector vector myv in descending order
	 * @param  myv from class MyVector 
	 */
	public void visit(MyVector myv)
	{
		Vector<Integer> Heap=myv.getvec();
		
		sort(Heap);
		
		for (Object o : myv.getvec()) 
		{
			System.out.print(o + " ");
		}
		System.out.println("vec heap");
	}
	
	/**
	 * This method sorts elemtnts from MyVector vector myv in descending order
	 * @param  mya from class MyArray 
	 */
	public void visit(MyArray mya)
	{
		ArrayList<Integer> Heap=new ArrayList<Integer>();
		Heap=mya.getlist();
		sort(Heap);
		
		for (Object o : mya.getlist()) 
		{
			System.out.print(o + " ");
		}
		System.out.println("arrayheap");
	}
	/**
	 * This method swap elemtnts and calls heapify for MyVector vector myv in descending order
	 * @param  arr from Vector<Integer> 
	 */

	   public void sort(Vector<Integer> arr)
	    {
		int n = arr.size();	 
		for (int i = n / 2 - 1; i >= 0; i--)
		    heapify(arr, n, i);
	 
		for (int i=n-1; i>=0; i--)
		{
		    int temp = arr.get(0);
		    arr.set(0,arr.get(i));
		    arr.set(i, temp);
		    heapify(arr, i, 0);
		}
	    }
	/**
	 * This method swap elemtnts and calls heapify for MyArray myv in descending order
	 * @param  ArrayList<Integer> arr
	 */

	   public void sort(ArrayList<Integer> arr)
	    {
		int n = arr.size();	 
		for (int i = n / 2 - 1; i >= 0; i--)
		    heapify(arr, n, i);
	 
		for (int i=n-1; i>=0; i--)
		{
		    int temp = arr.get(0);
		    arr.set(0,arr.get(i));
		    arr.set(i, temp);
		    heapify(arr, i, 0);
		}
	    }

	/**
	 * This method sorts elemtnts from MyVector vector myv in descending order
	  * @param  ArrayList<Integer> arr
	 * int n
	 * int i 
	 */

	    void heapify(Vector<Integer> arr, int n, int i)
	    {
		int largest = i;  
		int l = 2*i + 1;  
		int r = 2*i + 2;  
	 
		if (l < n && arr.get(l) < arr.get(largest))
		    largest = l;
	 
		if (r < n && arr.get(r) < arr.get(largest))
		    largest = r;
	 
		if (largest != i)
		{
		    int swap = arr.get(i);
		    arr.set(i, arr.get(largest));
		    arr.set(largest, swap);	 
		    heapify(arr, n, largest);
		}
	    }

	/**
	 * This method heapify elemtnts 
	 * @param  ArrayList<Integer> arr
	 * int n
	 * int i 
	 */
	    void heapify(ArrayList<Integer> arr, int n, int i)
	    {
		int largest = i;  
		int l = 2*i + 1;  
		int r = 2*i + 2;  
	 
		if (l < n && arr.get(l) < arr.get(largest))
		    largest = l;
	 
		if (r < n && arr.get(r) < arr.get(largest))
		    largest = r;
	 
		if (largest != i)
		{
		    int swap = arr.get(i);
		    arr.set(i, arr.get(largest));
		    arr.set(largest, swap);	 
		    heapify(arr, n, largest);
		}
	    }

}
