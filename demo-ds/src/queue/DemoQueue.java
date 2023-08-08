package queue;

import java.util.LinkedList;
import java.util.PriorityQueue;

public class DemoQueue {

  public static void main(String[] args) {
    LinkedList<String> queue = new LinkedList<>();
    // first in first out
    queue.add("hello");
    queue.add("world");
    System.out.println(queue.peek()); // hello
    System.out.println(queue.poll()); // hello
    System.out.println(queue.poll()); // world
    System.out.println(queue.size()); // 0

    queue.add("abc");
    queue.add("xyz");
    queue.add("def");
    queue.remove("def");
    System.out.println(queue.remove("def")); // true
    System.out.println(queue.poll());// abc
    System.out.println(queue.poll());// 0

    System.out.println(queue.offer("def")); // add()
    System.out.println(queue.offer("abc"));
    System.out.println(queue.offer("ijk")); // add()
    System.out.println(queue.size()); // 2

    // if (queue.contains("ijk")){ // true
    // queue.remove("ijk"); // first occurance of element
    // }

    LinkedList<String> backup = queue;

    while (!queue.isEmpty()) {
      System.out.println(queue.poll()); // abc, ijk
    }
    System.out.println(backup.size());

    LinkedList<Integer> queueNum = new LinkedList<>();
    queueNum.add(10);
    queueNum.add(9);
    queueNum.add(0);
    queueNum.add(-3);
    queueNum.add(100);
    int count = 0;
    int first = queueNum.peek();
    do  {
      if (queueNum.peek() % 2 == 0) {
        count++;
        if (count == 2){
          queueNum.poll();
          continue;
        }
        queueNum.add(queueNum.poll());
      } else {
        queueNum.add(queueNum.poll());
      }
    }while (queueNum.peek() != first);
    System.out.println(count);
    System.out.println(queueNum);
  }
}
