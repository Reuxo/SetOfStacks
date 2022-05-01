import stack.SetOfStacks;
import stack.Stack;

public class Main {
    public static void main(String[] args) {

        SetOfStacks st = new SetOfStacks(10);
        st.getLinLstOfSt().push(new Stack(st.getSize()));

        for (int i = 0; i < 42; i++) {
            st.setOfStacksPush(i + 1);
            //System.out.print(st.getLinLstOfSt().get(0).getArr()[i] + " ");
        }

        st.setOfStackPop();
//        System.out.println(st.getLinLstOfSt().get(0).getLastIndex() + " " + st.getLinLstOfSt().get(1).getLastIndex() +
//                " " + st.getLinLstOfSt().get(2).getLastIndex());
        System.out.println();
        st.popAt(3);
        st.setOfStackPush(88);
        st.setOfStackPush(77);
        st.setOfStackPop();
        st.setOfStackPop();
        st.setOfStackPop();
        st.setOfStackPush(77);
        st.setOfStackPush(88);


        st.print();

    }
}
