package stack;

import java.util.LinkedList;

public class SetOfStacks {
    private LinkedList<Stack> linLstOfSt;
    private int size;

    public LinkedList<Stack> getLinLstOfSt() {
        return linLstOfSt;
    }

    public void setLinLstOfSt(LinkedList<Stack> linLstOfSt) {
        this.linLstOfSt = linLstOfSt;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public SetOfStacks(int sizeOfSt) {
        this.linLstOfSt = new LinkedList<>();
        this.size = sizeOfSt;
    }

    public void setOfStacksPush(int value) {
        if (this.linLstOfSt.get(0).isFull() ) {
            this.linLstOfSt.push(new Stack(this.size));
        }
        this.linLstOfSt.get(0).push(value);

        if (this.linLstOfSt.get(0).isFull() ) {
            this.linLstOfSt.push(new Stack(this.size));
        }
    }

    public int setOfStackPop() {
        if(this.linLstOfSt.get(0).isEmpty() ) {
            return this.linLstOfSt.get(1).pop();
        }
        else {
            return this.linLstOfSt.get(0).pop();
        }
    }
    public int popAt(int index) {
     return 0;
    }

}



