package HW_4;

import java.util.ArrayList;

public class DataContainer<T> {
    public Object[] container = new Object[0];

    public void add(T item) {
        int newIndex = extendSize();
        container[newIndex] = item;
    }

    public Object get(int index) {
        return container[index];
    }

    public void remove(int index) {
        ArrayList<Object> temp = new ArrayList<>();
        for (Object element : this.container) temp.add(element);
        temp.remove(index);
        this.container = new Object[this.container.length-1];
        for (int i = 0; i<temp.size(); i++) {
            this.container[i] = temp.get(i);
        }
    }

    public int getSize() {
        return container.length;
    }

    public int extendSize() {
        Object[] temp = this.container;
        this.container = new Object[this.container.length+1];
        for (int i = 0; i<temp.length; i++) {
            this.container[i] = temp[i];
        }
        return this.container.length+1;
    }
}