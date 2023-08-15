package revision;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import java.util.Vector;

public class Demo {
  public static void main(String[] args) {
    // ArrayDeque & LinkedList -> different underlying structure
    Deque<String> arrayDeque = new ArrayDeque<>();
    arrayDeque.addFirst("a");
    arrayDeque.addLast("a");
    arrayDeque.pollFirst();
    arrayDeque.pollLast();
    Deque<String> linkedList = new LinkedList<>(); // Linked list
    linkedList.addFirst("a");
    linkedList.addLast("a");
    linkedList.pollFirst();
    linkedList.pollLast();

    Queue<String> arrayQueue = new ArrayDeque<>();
    arrayQueue.add("a");
    arrayQueue.poll();
    Queue<String> linkedQueue = new LinkedList<>();
    linkedQueue.add("a");
    linkedQueue.poll();


    Queue<String> pQueue = new PriorityQueue<>();
    pQueue.add("a");
    pQueue.poll();

    List<Integer> arrayList = new ArrayList<>(); // array
    arrayList.add(3);
    arrayList.remove(3);
    List<Integer> linkedList1 = new LinkedList<>(); // linked list
    // linkedlist.poll();
    linkedList1.add(3);
    linkedList1.remove(3);

    List<String> stack = new Stack<>(); //
    stack.add("abc");
    stack.remove(0);
    
    Vector<String> stack2 = new Stack<>(); // Vector vs List
    stack.add("abc");
    stack.remove(0);

    Stack<String> stack3 = new Stack<>();
    stack3.push("abc");
    stack3.pop();

  }
}
