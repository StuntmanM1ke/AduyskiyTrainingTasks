package array_iterator_7_4;

import java.util.Iterator;

class ArrayIterator2d implements Iterator<Integer> {
    private Integer[][] array;
    private int i, j;

    public ArrayIterator2d(Integer[][] array) {
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        return i < array.length && j < array[i].length;
    }

    @Override
    public Integer next() {
        Integer r = array[i][j++];
        if (j >= array[i].length) {
            i++;
            j = 0;
        }
        return r;
    }
}

