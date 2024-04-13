package InterfazIntList;

public class IntVector implements IntList {
    private int[] array;
    private int size;
    private static final int INITIAL_CAPACITY = 20;

    public IntVector() {
        array = new int[INITIAL_CAPACITY];
        size = 0;
    }

    @Override
    public void add(int number) {
        if (size == array.length) {
            int newCapacity = array.length * 2;
            int[] newArray = new int[newCapacity];
            System.arraycopy(array, 0, newArray, 0, size);
            array = newArray;
        }
        array[size++] = number;
    }

    @Override
    public int get(int id) {
        if (id < 0 || id >= size)  {
            return -1;
        }
        return array[id];
    }
}
