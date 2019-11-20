import java.util.ArrayList;
import java.util.List;

public class ArrayListStack<E> implements StackADT<E> {         //overcomes the limitations of an arrays upper bounds

    private List<E> data;
    private int top;

    public ArrayListStack(){
        data = new ArrayList<>();           //ArrayList expands automatically
    }

    @Override
    public E pop() {
        if(isEmpty()) {
            return null;
        }
        return data.remove(data.size() - 1);        //remove and return
    }

    @Override
    public E top() {
        if(isEmpty()){
            return null;
        }
        return data.get(data.size() - 1);                   //return but don't remove
    }

    @Override
    public int size() {
        return data.size();                 //ArrayList method
    }

    @Override
    public boolean isEmpty() {
        return data.isEmpty();              //use isEmpty from ArrayList data. If the ArrayList is empty, the stack is empty
    }

    @Override
    public void push(E element) {
        data.add(element);
    }
}
