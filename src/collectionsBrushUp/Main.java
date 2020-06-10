package collectionsBrushUp;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		
		Map<String, Integer> map = new HashMap<>();
		
		Set<Integer> set = new HashSet<>();
		
		
		LinkedList<String> list = new LinkedList<>();
		
				
		Collections.sort(list);
		
		List<String> arr = new ArrayList<>();
		
		arr.toArray();
		
		Deque <String> queue = new LinkedList<>();
		
		queue.offer("a");
		queue.offer("b");
		
				System.out.println(queue.size());
		
		Iterator<String> it = queue.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println();
		
		for(String el: queue) {
			String x = el+ "1";
			System.out.println(x);
		}


		System.out.println();
		
		System.out.println(queue.peek());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		
		
		
		System.out.println(queue.peek());
		
		
		Stack<Integer> stack = new Stack<>();
		stack.push(2);
		
		System.out.println(stack.empty());
		

	}

}
