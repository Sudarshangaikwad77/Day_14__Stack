package com.bl.stack_problem;
import java.util.LinkedList;
public class StackMain
{
    private LinkedList<Integer> stackList;

        public StackMain() {
            stackList = new LinkedList<Integer>();
        }

        public void push(int item) {
            stackList.addFirst(item);
        }

        public int peek() {
            return stackList.getFirst();
        }

        public static void main(String[] args) {
            System.out.println("Welcome to Stack with linked list problem.");
            StackMain stack = new StackMain();

            stack.push(70);
            stack.push(30);
            stack.push(56);

            System.out.println("Top element of the stack: " + stack.peek());
        }
    }

