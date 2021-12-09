package 자바테스트;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		String[] name = { "Queen", "Tod", "kim" };
		findkim(name);

	}

	public static void findkim(String[] name) {
		for (int i = 0; i < name.length; i++) {
			if (name[i] == "kim") {
				System.out.println("김서방은 " + (i + 1) + "에 있다.");
				break;
			}
		}
	}
}