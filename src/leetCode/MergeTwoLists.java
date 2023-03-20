package leetCode;

import java.util.Arrays;

public class MergeTwoLists {

	int value;
	MergeTwoLists next;
	MergeTwoLists(int x)
    {
        value = x;
        next = null;
    }
	public static void main(String args[])
    {
		MergeTwoLists l1 = new MergeTwoLists(1);
        l1.next = new MergeTwoLists(2);
        l1.next.next = new MergeTwoLists(9);
        MergeTwoLists l2 = new MergeTwoLists(1);
        l2.next = new MergeTwoLists(3);
        l2.next.next = new MergeTwoLists(4);
        System.out.println(mergeTwoLists(l1 , l2));
    }

	public static MergeTwoLists mergeTwoLists(MergeTwoLists l1, MergeTwoLists l2){
		if(l1 == null) return l2;
		if(l2 == null) return l1;
		if(l1.value < l2.value){
			l1.next = mergeTwoLists(l1.next, l2);
			return l1;
		} else{
			l2.next = mergeTwoLists(l1, l2.next);
			return l2;
		}
}
}
