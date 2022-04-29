import stack.SetOfStacks;
import stack.Stack;

public class Main {
    public static void main(String[] args) {

        SetOfStacks st = new SetOfStacks(10);
        st.getLinLstOfSt().push(new Stack(st.getSize()));

        for (int i = 0; i < 20; i++) {
            st.setOfStacksPush(i + 1);
            //System.out.print(st.getLinLstOfSt().get(0).getArr()[i] + " ");
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(st.getLinLstOfSt().get(0).getArr()[i] + " ");
            System.out.print(st.getLinLstOfSt().get(1).getArr()[i] + " ");
             System.out.println(st.getLinLstOfSt().get(2).getArr()[i] + " ");
            //System.out.print(st.getLinLstOfSt().get(3).getArr()[i] + " ");
            //System.out.println(st.getLinLstOfSt().get(4).getArr()[i] + " ");

        }

        System.out.println(st.setOfStackPop());
        System.out.println(st.getLinLstOfSt().get(1).getArr()[st.getLinLstOfSt().get(1).getLastIndex()]);
    }
}
