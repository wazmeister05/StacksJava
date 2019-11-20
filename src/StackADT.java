public interface StackADT<E> {      //<E> is a generic element

    public E pop();                 //return top, remove from stack

    public E top();                 //look at top, doesn't remove from stack

    public int size();              //return size of stack

    public boolean isEmpty();       //return true (empty) or false (not empty)

    public void push(E element);    //add element E to stack
}
