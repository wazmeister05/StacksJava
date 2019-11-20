import java.util.ArrayList;

public class ArrayStack<E> implements StackADT {

    private E[] data;
    private int size;           //how big array is currently
    private int top;
    private static int capacity = 5;       //how big array can get

    public ArrayStack(int capacity){            //constructor with user set capacity
        data = (E[]) new Object[capacity];    //can't define generic type directly so must be initialised as Object[] and cast as E
        top = -1;                               //can't be 0 otherwise it will reference data[0]
    }

    public ArrayStack(){                        //constructor with default capacity
        this(capacity);
    }

    @Override
    public Object pop() {
        if(isEmpty()){
            return null;
        }
        E elementToReturn = data[top];      //store element from top in temporary variable elementToReturn
        data[top] = null;                   //set element at this position to null
        top--;                              //reduced size of array so have to reduce number that gives size

        return elementToReturn;
    }

    @Override
    public Object top() {
        if(isEmpty()){
            return null;
        }
        return data[top];
    }

    @Override
    public int size() {
        return top + 1;                 //points to index of last item in there
    }

    @Override
    public boolean isEmpty() {
        return top == -1;               //if this is true it is empty otherwise it isn't!
    }

    @Override
    public void push(Object element) throws IllegalStateException {     //thrown whenever number of object in array meets capacity of array
        if(size() == data.length){                                      //reached capacity
            throw new IllegalStateException("Stack is full");
        }
        data[++top] = (E) element;                                             //does increment before being used.
    }
}
