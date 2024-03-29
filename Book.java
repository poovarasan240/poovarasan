package Collection;

//ArrayList
import java.util.ArrayList;
import java.util.*;

public class Book 
{
	//String story,crime,passion;
	//Book book=new Book();
	//Scanner sc=new Scanner(System.in);
	void create() {
		
	
	//ArrayList<String> obj=new ArrayList <String>();
	System.out.println("Enter Story book name");
//	book.story=sc.nextLine();
	System.out.println("Enter Crime book name");
	//	book.crime=sc.nextLine();
		System.out.println("");
		
	}
	void method() {
		ArrayList<String> list=new ArrayList<String>();
		//History his=new History("poo","king","k7","vickey");
		//book.History("one", "two", "Three", "four");
		ArrayList<String> obj=new ArrayList<String>();
		obj.add("hello");
		obj.add("annum illa");
		System.out.println(obj);
		obj.add(0, " third add");
		System.out.println(obj);
		//obj.addAll(book);	
		System.out.println(obj.getFirst());
		System.out.println(obj.size());
		//obj.getLast();
		//obj.set(2, "poo");
		System.out.println(obj);
		Collections.sort(obj); 
		System.out.println(obj);
		
	}
	void Display() {
		
	}
	public static void main(String[] args) 
	{
		Book book=new Book();
		//book.create();
		book.method();
		
	}

}
