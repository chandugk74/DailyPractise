package basics;

public class NumberOfObjects {
    static int noOfObj=0;

    public NumberOfObjects() {
        noOfObj++;
    }

    public static void main(String[] args) {
        NumberOfObjects n1 = new NumberOfObjects();
        NumberOfObjects n2 = new NumberOfObjects();
        NumberOfObjects n3 = new NumberOfObjects();
        NumberOfObjects n4 = new NumberOfObjects();
        NumberOfObjects n5 = new NumberOfObjects();
        System.out.println(noOfObj);
    }
}
