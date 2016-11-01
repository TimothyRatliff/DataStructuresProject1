package prog1;
//Programming Project 1
//Timothy Ratliff tratli2@lsu.edu

import java.io.*;
import java.util.Scanner;
public class prog1demo {

	public static void main(String[] args) throws FileNotFoundException{
		Scanner input = new Scanner(new File(args[0]));
		PriorityQueue queue = new PriorityQueue(255);
		while (input.hasNextLine()){
			String str = input.next();
			if(str.equals("insert"))
			{
				String value = input.next();
				int key = input.nextInt();
				queue.insert(value, key);
			}
			if(str.equals("remove"))
			{
				queue.remove();
			}
		}
		input.close();
	}

}
