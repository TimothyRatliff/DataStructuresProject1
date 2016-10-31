package prog1;

public class PriorityQueue {
	int max, length;
	Entry[] queue;
	Entry x;
	
	private class Entry{
		public String name;
		public int priority;
	}
	
	public PriorityQueue(int size)
	   {
	      max = size;
	      queue = new Entry[max];
	      length = 0;
	   }
	
	public boolean isEmpty(){
		return (length == 0);
	}
	
	public void insert(String value, int key)
	   {
		Entry x = new Entry();
		x.name = value;
		x.priority = key;
		queue[length] = x;
		int newpos = length;
		Entry temp = queue[newpos];
		int parent = (newpos-1)/2;
		while(newpos > 0 && queue[parent].priority < temp.priority){
			queue[newpos] = queue[parent];
			newpos = parent;
			parent = (newpos-1)/2;
		}
	      queue[newpos] = temp;
	      length++;
	   }
	public Entry remove()
	   {
	      Entry temp = queue[0];
	      length--;
	      if(length > 0){
	    	  queue[0] = queue[length];
	      }
	      return temp;
	   }
	public String toString(){
		String str = "";
        for(int i = 1; i <= length; i ++)
            str += (queue[i].name);
        return str;
	}
	
}
