<a> 문제 : https://www.hackerrank.com/challenges/ctci-queue-using-two-stacks/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=stacks-queues (medium, 두 개의 스택으로 큐를 구현하는 문제) </a>

```java

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<Integer>();

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            int operation = scan.nextInt();
            if (operation == 1) { // enqueue
              queue.enqueue(scan.nextInt());
            } else if (operation == 2) { // dequeue
              queue.dequeue();
            } else if (operation == 3) { // print/peek
              System.out.println(queue.peek());
            }
        }
        scan.close();
    }
    public static class MyQueue<T> {
        Stack<T> stackNewestOnTop = new Stack<T>();
        Stack<T> stackOldestOnTop = new Stack<T>();

        public void enqueue(T value) {
            stackNewestOnTop.push(value);
        }

        public T peek() {
            if(stackOldestOnTop.isEmpty()){
                while(!stackNewestOnTop.isEmpty()){
                    stackOldestOnTop.push(stackNewestOnTop.pop());
                }
            }
            return stackOldestOnTop.peek();
        }

        public T dequeue() {
            if(stackOldestOnTop.isEmpty()){
                while(!stackNewestOnTop.isEmpty()){
                    stackOldestOnTop.push(stackNewestOnTop.pop());
                }
            }
            return stackOldestOnTop.pop();
        }
    }
}


```
