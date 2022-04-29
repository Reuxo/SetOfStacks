package stack;

public class Stack {
    private int[] arr;
    private int size;
    private int lastIndex;

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public int getLastIndex() {
        return lastIndex;
    }

    public void setLastIndex(int lastIndex) {
        this.lastIndex = lastIndex;
    }

    public Stack(int size) {
        this.size = size;
        this.arr = new int[size];
        this.lastIndex = -1;
    }


    public void push(int value) throws IndexOutOfBoundsException {
        this.lastIndex++;
       /* if (lastIndex > arr.length) {
            throw new IndexOutOfBoundsException();
        }*/
        this.arr[this.lastIndex] = value;
    }

    public int pop() throws IndexOutOfBoundsException {
        return this.arr[lastIndex--];
    }

    public int peek() {
        return arr[this.lastIndex];
    }

    public boolean isFull() {
        return this.size == this.lastIndex + 1;
    }

    public boolean isEmpty() {
        return this.lastIndex == -1;
    }

    public int search(int value) {
        for (int i = 0; i < this.lastIndex + 1; i++) {
            if(this.arr[i] == value){
                return i;
            }
        }
        return -1;
    }


}
