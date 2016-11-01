package prog1;
//Programming Project 1
//Timothy Ratliff tratli2@lsu.edu
public class PriorityQueue {
	private int max, length;
	private Entry[] queue;
	
	/**
	 * Creates an Entry with two fields; name and priority.
	 * @author TimothyRatliff
	 */
	private class Entry
	{
		public String name;
		public int priority;
	}
	
	/**
	 * Constructs a PriorityQueue with length zero, and a given size.
	 * @param size The size of the PQ
	 */
	public PriorityQueue(int size)
    {
		max = size;
		queue = new Entry[max];
		length = 0;
    }
	
	/**
	 * Determines if the given PQ is empty.
	 * @return True or False
	 */
	public boolean isEmpty()
	{
		return (length == 0);
	}
	
	/**
	 * Inserts a value into the PQ with a given key
	 * @param value The given value
	 * @param key The given key
	 */
	public void insert(String value, int key)
    {
		Entry x = new Entry();
		x.name = value;
		x.priority = key;
		queue[length] = x;
	    Up(length);
	    length++;
    }
	
	private void Up(int newpos)
	{
		Entry temp = queue[newpos];
		int parent = (newpos-1)/2;
		while(newpos > 0 && queue[parent].priority < temp.priority){
			queue[newpos] = queue[parent];
			newpos = parent;
			parent = (newpos-1)/2;
		}
		queue[newpos] = temp;
	}
	
	/**
	 * Removes the Entry with the highest 
	 * priority value, then prints and returns the name 
	 * string from that record.
	 * @return The Entry with the highest priority value.
	 */
	public String remove()
    {
		if (isEmpty()) return null;
	    Entry temp = queue[0];
	    length--;
	    if(length > 0){
	    	  queue[0] = queue[length];
	    	  Down(0);
	    }
	    System.out.printf(temp.name + "%n");
	    return temp.name;
    }
	
	private void Down(int position)
	{
		int child;
		if(2*position+1 >= length){
			child = position;
		}
		else if (2*position+2 == length)
	    {
	        child = 2*position+1;     
	    }
	    else if (queue[2*position+1].priority > queue[2*position+2].priority)
	    {
	        child = 2*position+1;      
	    }
	    else
	    {
	        child = 2*position+2;      
	    }
		if(queue[position].priority < queue[child].priority){
			Entry temp = queue[position];
			queue[position] = queue[child];
			queue[child] = temp;
			Down(child);
		}
	}
}
