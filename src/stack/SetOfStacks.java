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


    public void setOfStackPush(int value) {
        for (int i = linLstOfSt.size() - 1; i >= 0  ; i--) {
            if(!this.linLstOfSt.get(i).isFull()) {
                this.linLstOfSt.get(i).push(value);
                break;
            }
        }
        if(this.linLstOfSt.get(0).isFull()){
            this.linLstOfSt.push(new Stack(this.size));
        }
    }

    public int setOfStackPop() {
        if (this.linLstOfSt.get(0).isEmpty()) {
            this.linLstOfSt.pop();
        }
        return this.linLstOfSt.get(0).pop();

    }

    public int popAt(int index) {
     return linLstOfSt.get(index).pop();

    }


    public void print() {
        for (int i = 0; i < this.size; i++) {
            for (int j = linLstOfSt.size() - 1; j >= 0; j--) {
                if (linLstOfSt.get(j).getLastIndex() >= i) {
                    System.out.print(linLstOfSt.get(j).getArr()[i] + " ");
                } else {
                    System.out.print("x" + " ");
                }
            }
            System.out.println();
        }
    }
}



