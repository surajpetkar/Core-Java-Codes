import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SortedLinkedlist {

	public static void main(String[] args) {
		List<Integer> list1 = new LinkedList();
		List<Integer> list2 = Arrays.asList(1,3,4);
		list1.add(1);
		list1.add(2);
		list1.add(4);
		//ListIterator<Integer> itr = list2.listIterator();
		//while(itr.hasNext()) {
			list1.addAll(list2); // Adding another list into first
		//}
		Collections.sort(list1); // Sorting combined list
		System.out.println(list1);
	}

}
