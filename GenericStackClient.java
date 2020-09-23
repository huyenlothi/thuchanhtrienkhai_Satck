import java.util.LinkedList;

public class GenericStackClient<E> {
        private static void stackOfString(){
                MyGenericStack<String> stack = new MyGenericStack();
                stack.push("five");
                stack.push("four");
                stack.push("three");
                stack.push("two");
                stack.push("one");
                System.out.println("size of stack after push operations: " + stack.size());
                System.out.println("pop elements from stack: ");
                while (!stack.isEmpty()){
                        System.out.println(stack.pop());
                }
                System.out.println("size of stack after pop operations: "+ stack.size());
        }
        private static void stackOfInteger(){
                MyGenericStack<Integer> stack = new MyGenericStack();
                stack.push(5);
                stack.push(4);
                stack.push(3);
                stack.push(2);
                stack.push(1);
                System.out.println("size of stack after push operations: " + stack.size());
                System.out.println("pop elements from stack: ");
                while (!stack.isEmpty()){
                        System.out.println(stack.pop());
                }
                System.out.println("size of stack after pop operations: "+ stack.size());
        }
        public static void main(String[] args) {
                System.out.println("1. Stack of integers");
                stackOfString();
                System.out.println("\n2. Stack of Strings");
                stackOfInteger();
        }

        

}
