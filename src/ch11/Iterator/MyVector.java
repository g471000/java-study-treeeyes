package ch11.Iterator;

import java.util.Iterator;

public class MyVector extends ch11.List.MyVector implements Iterator {
    int cursor = 0;
    int lastRet = -1;


    public MyVector(int capacity) {
        super(capacity);
    }

    public MyVector() {
        this(10);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator it = this.iterator();

        for (int i = 0; it.hasNext(); i++) {
            if (i != 0) {
                sb.append(", ");
            }
            sb.append(it.next());
        }

        return sb.toString();
    }

    public Iterator iterator() {
        cursor = 0;
        lastRet = -1;
        return this;
    }

    @Override
    public boolean hasNext() {
        return cursor != size();
    }

    @Override
    public Object next() {
        Object next = get(cursor);
        lastRet = cursor++;
        return next;
    }

    @Override
    public void remove() {
        if (lastRet == -1) {
            throw new IllegalStateException();
        }
        remove(lastRet);
        cursor--;
        lastRet = -1;
    }
}
