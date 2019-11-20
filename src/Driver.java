import java.util.NoSuchElementException;

public class Driver {

    private static StackADT<Integer> arrayStack = new ArrayStack<>();

    private static StackADT<Integer> arrayListStack = new ArrayListStack<>();

    private static StackADT<Integer> linkedListStack = new LinkedListStack<>();

    public static void main(String[] args){
        try{
            System.out.println("ArrayStack Popped: " + linkedListStack.pop());
        } catch (NoSuchElementException e){
            System.out.println("Stack is empty");
        }

        linkedListStack.push(1);
        System.out.println("ArrayStack Popped: " + linkedListStack.pop());
        linkedListStack.push(1);
        linkedListStack.push(2);
        linkedListStack.push(3);
        System.out.println("ArrayStack Popped: " + linkedListStack.pop());
        System.out.println("ArrayStack Popped: " + linkedListStack.top());
        linkedListStack.push(3);
        linkedListStack.push(3);
        linkedListStack.push(3);
        linkedListStack.push(3);
        linkedListStack.push(10);

        System.out.println("Size: " + linkedListStack.size());
        System.out.println("isEmpty: " + linkedListStack.isEmpty());
        System.out.println("Top: " + linkedListStack.top());

    }
}
