package I1_Restaurant_Iterator.core;

public class PanCakeIterator implements Iterator{

    MenuItem[] menuItems;

    int position = 0;

    public PanCakeIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }


    @Override
    public boolean hasNext() {
        if(position >= menuItems.length || menuItems[position] == null)
        return false;
        else return true;
    }

    @Override
    public Object next() {
        MenuItem menuItem = menuItems[position];
        position++;
        return menuItem;
    }
}
