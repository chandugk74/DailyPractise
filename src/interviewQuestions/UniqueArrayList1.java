package interviewQuestions;

import java.util.ArrayList;
//implement an arraylist which should not accept duplicates in it
public class UniqueArrayList1<E> extends ArrayList<E> {
    @Override
    public boolean add(E element) {
        if (!contains(element)) {
            return super.add(element);
        }
        return false; // Element already exists, so it's not added.
    }
    public static void main(String[] args) {
        UniqueArrayList1<Integer> uniqueList = new UniqueArrayList1<>();
        uniqueList.add(1);
        uniqueList.add(2);
        uniqueList.add(3);
        uniqueList.add(2); // Duplicate, won't be added
        System.out.println(uniqueList); // [1, 2, 3]
    }
}
