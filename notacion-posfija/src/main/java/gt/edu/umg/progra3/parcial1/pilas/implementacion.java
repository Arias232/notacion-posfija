
package gt.edu.umg.progra3.parcial1.pilas;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class implementacion implements Pila{

    private final List<String> items;
    public implementacion(){
        this.items = new ArrayList<>();
    }
     @Override
    public void push(String item){
        this.items.add(item);
    }

    @Override
    public String pop(){
        if(isEmpty()){
            throw new NoSuchElementException("La pila esta vacía");
        }
        return this.items.remove(size()-1);
    }
    @Override
    public String peek(){
        if (isEmpty()){
            throw new NoSuchElementException("La pila está vacía");
        }

        return this.items.get(size()-1);
    }
    @Override
    public int size(){
        return this.items.size();
    }

    @Override
    public boolean isEmpty(){
        return this.items.isEmpty();
    }
}