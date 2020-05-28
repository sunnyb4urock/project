package generics;

import java.util.ArrayList;

class Machine {
}

class Camera extends Machine {

}

public class App {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");

		showList(list);
	}

	private static void showList(ArrayList<String> list) {
		for (String value : list) {
			System.out.println(value);
		}

	}

}