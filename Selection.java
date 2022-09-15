package Ds;

	public class Selection  
	{  
	    void selection(int a[])   
	{  
	    int   small;  
	    int n = a.length;  
	    for (int i = 0; i < n-1; i++)  
	    {  
	        small = i;  
	          
	        for (int j = i+1; j < n; j++)  
	        if (a[j] < a[small])  
	            small = j;  
	 
	    int temp = a[small];  
	    a[small] = a[i];  
	    a[i] = temp;  
	    }  
	  
	}  
	void printArr(int a[])   
	{  
	      
	    int n = a.length;  
	    for (int i = 0; i < n; i++)  
	    System.out.print(a[i] + " ");  
	}  
	  
	    public static void main(String[] args) {  
	    int a[] = { 91, 49, 4, 19, 10, 21 };  
	    Selection i1 = new Selection();  
	    System.out.println("Before sorting array elements are - ");  
	    i1.printArr(a);  
	    i1.selection(a);  
	    System.out.println("After sorting array elements are - ");  
	    i1.printArr(a);  
	    System.out.println();  
	    }  
	}  


