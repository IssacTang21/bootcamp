package queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class DemoArrayDeque {
  
  public static void main(String[] args) {
    ArrayDeque<String> strings = new ArrayDeque<>();
    strings.add("abc");
    strings.add("def");
    strings.add("abc");
    System.out.println(strings.poll());
    System.out.println(strings.size());
    strings.addLast("xyz"); // addlast() = add()
    System.out.println(strings.poll()); // def
    strings.addFirst("ijk");
    System.out.println(strings.peek()); // ijk
    System.out.println(strings.pollFirst()); // ijk, pollfirst() = poll()
    System.out.println(strings.pollLast()); //xyz
    strings.addFirst("efg");
    System.out.println(strings);

    Deque<String> queue = new LinkedList<>();
    Queue<String> queue2 = new LinkedList<>();
  }
}
