package by.guru13.dynArray;

import java.lang.reflect.Array;
import java.util.Arrays;

public class DynArray<T>
{
    public T [] array;
    public int count;
    public int capacity;
    Class clazz;

    public DynArray(Class clz)
    {
        clazz = clz; // нужен для безопасного приведения типов
        // new DynArray<Integer>(Integer.class);

        count = 0;
        makeArray(16);
    }

    public void makeArray(int new_capacity)
    {
        // array = (T[]) Array.newInstance(this.clazz, new_capacity);
        // ваш код

        if(array == null) {
            array = (T[]) Array.newInstance(this.clazz, new_capacity);
        } else {
            array = Arrays.copyOf(array, new_capacity);
        }

    }

    public T getItem(int index)
    {
        // ваш код
        return array[index];
    }

    public void append(T itm)
    {
        // ваш код
    }

    public void insert(T itm, int index)
    {
        // ваш код
    }

    public void remove(int index)
    {
        // ваш код
    }

}