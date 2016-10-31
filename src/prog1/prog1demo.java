package prog1;
//Programming Project 1
//Timothy Ratliff tratli2@lsu.edu
public class prog1demo {

	public static void main(String[] args) {
		System.out.println("Hello World");
		PriorityQueue queue = new PriorityQueue(255);
		queue.insert("Walter", 21);
		queue.insert("Matthew", 13);
		queue.insert("Lisa", 12);
		queue.insert("Richard", 17);
		//queue.remove();
		queue.toString();
	}

}
