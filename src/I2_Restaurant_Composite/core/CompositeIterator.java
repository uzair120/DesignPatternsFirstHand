package I2_Restaurant_Composite.core;

import java.util.*;

public class CompositeIterator implements Iterator {

    Stack stack = new Stack();

    public CompositeIterator(Iterator iterator) {
        stack.push(iterator);
    }

    @Override
    public boolean hasNext() {
        if(stack.empty()){
            return false;
        }
        Iterator iterator = (Iterator) stack.peek();
        if(!iterator.hasNext()){
            stack.pop();
            return this.hasNext();
        }
        else {
            return true;
        }
    }

    @Override
    public Object next() {
        if(hasNext()){
            Iterator iterator = (Iterator) stack.peek();
            MenuComponent menuComponent = (MenuComponent) iterator.next();
            if (menuComponent instanceof Menu){
                stack.push(((Menu) menuComponent).createIterator());
            }
            return menuComponent;

        }
        else{
            return null;
        }

    }
}
