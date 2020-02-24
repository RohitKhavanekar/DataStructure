import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Queue<String> queue = new LinkedList<>();  //Inatlize a queue & add elements to in
		queue.add("one");
		queue.add("two");
		queue.add("three");
		queue.add("four");
		System.out.println(queue); 
		
		queue.remove("three"); //Remove method
		System.out.println(queue);
		System.out.println("Queue Size :"+queue.size());   
		System.out.println("Queue contains element 'one' :" +queue.contains("one"));  //Gives Boolean Output
		
		queue.clear();

	}

}
