package l2;

import java.util.NoSuchElementException;

public class ArrayListImp<E> implements List<E> {
    protected E[] data;
    private int size;
    private final int HEAD_DEFAULT = 0;
    private int head;

    public ArrayListImp () {
        this.size = 3;
        this.data = (E[]) new Object[size];
        head = HEAD_DEFAULT;
    }

    public boolean add (E value) {
        if (data == null) {
            data[0] = value;
        } else {
            data[head] = value;
            head++;
            if (head == size) {
                data = dynamicArray(data);
            }
        }
        return true;
    }

    private E[] dynamicArray (E[] data) {
        size = size + 10;
        E[] temp = (E[]) new Object[size];
        for (int i = 0; i < head; i++) {
            temp[i] = data[i];
        }
        return temp;
    }

    @Override
    public boolean remove (E value) {
        E temp;
        Boolean valueInArray = false;
        for (int i = 0; i < head; i++) {
            if (valueInArray == false && data[i] == value) {
                valueInArray = true;
            }
            if (valueInArray) {
                data[i] = data[i + 1];
            }
        }
        head--;
        if (valueInArray) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean contains (E value) {
        for (int i = 0; i < head; i++) {
            if (data[i] == value) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int size () {
        return head;
    }

    @Override
    public boolean isEmpty () {
        return data == null;
    }

    public E get (Integer position) {
        if (position > head - 1) {
            throw new NoSuchElementException();
        }
        return data[position];
    }

    @Override
    public String toString () {
        StringBuilder stringOut = new StringBuilder();
        stringOut.append("[");
        for (int i = 0; i < head; i++) {
            if (data[i] != null) {
                if (i == head - 1) {
                    stringOut.append(data[i]);
                } else {
                    stringOut.append(data[i] + ", ");
                }
            }
        }
        stringOut.append("]");
        return stringOut.toString();
    }
}
