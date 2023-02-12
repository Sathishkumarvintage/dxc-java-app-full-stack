import java.util.Scanner;
import java.util.ArrayList;

public class Arraylist {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.print("Enter a sequence of numbers ending wih 0: ");
		int num = input.nextInt();
		while (num!= 0) {
			list.add(num);
			num = input.nextInt();
		}
		System.out.println("The largest number in the input is " + max(list));
	}
	public static Integer max(ArrayList<Integer> list) {
		if (list.size() == 0)
			return null;

	   int max = list.get(0);
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) > max)
				max = list.get(i);
		}
		return max;
	}
	}