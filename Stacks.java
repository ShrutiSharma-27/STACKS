import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(34);
        stack.push(45);
        stack.push(2);

        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.empty());
        System.out.println(stack.isEmpty()); //used in new jdk version, both (empty() and isEmpty()) are duplicates with different names only

        System.out.println(stack.search(45)); //present : return its position from top
        System.out.println(stack.search(34));
        System.out.println(stack.search(2)); //not present : return -1

        System.out.println(stack.size());
    }
}

//Output :

// 2
// 2
// 45
// false
// false
// 1
// 2
// -1
// 2
