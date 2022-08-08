package com.queue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
class StringLengthComparator implements Comparator<String>{

	@Override
	public int compare(String arg0, String arg1) {
		// TODO Auto-generated method stub
		return Integer.compare(arg0.length(), arg1.length());
	}
	
}
public class QueueController {
	public static void main(String arg[]) {
		Queue<String> queue=new PriorityQueue<>(new StringLengthComparator());
		queue.add("Zebra");
		queue.add("Apple");
		queue.offer("Cat");
		
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue);
	}

}
