package testinium;

import java.util.ArrayList;
import java.util.List;

public class Task {

	public static void reverseTree(int counter, String c) {
		List<String> list = new ArrayList<String>();
		int plus = 0;
		var push = counter;
		do {
			list.add(c);
			push--;
		} while (push > 0);
		int size = list.size() - 1;

		for (int i = 0; i < counter; i += 2) {

			for (int j = 0; j < counter; j++) {
				System.out.print(list.get(j));
			}

			for (int k = 0; k <= plus; k++) {
				list.set(k, " ");
				list.set((size - k), " ");
			}
			plus++;
			System.out.println();
		}
	}

	public static void main(String[] args) {

		reverseTree(15, "T");
	}

}
