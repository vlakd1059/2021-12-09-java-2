package �ڹ��׽�Ʈ;

public class Test01 {
	//???
	public static void main(String[] args) { 
		String str = "ZAbcdVefEg";
		reverseStr(str);

	}

	public static void reverseStr(String s) {
		String answer = "";
		char[] str = s.toCharArray(); // ���ڿ��� ������ �迭�� ��ȯ
		int[] intStr = new int[str.length];
		for (int i = 0; i < str.length; i++) {
			intStr[i] = (int) str[i];  // intStr�迭�ڸ����� �ƽ�Ű�ڵ尪 �Է�

		}

		// Arrays.sort(intStr);

		for (int i = 0; i < str.length; i++) {
			int minIdx = i;
			for (int j = (i + 1); j < intStr.length; j++) {
				if (intStr[minIdx] < intStr[j]) {
					minIdx = j;

				}

			}
			int temp = intStr[i];
			intStr[i] = intStr[minIdx];
			intStr[minIdx] = temp;

		}
		for (int i = 0; i < intStr.length; i++) {
			str[intStr.length - 1 - i] = (char) intStr[i];
		}
		answer = new String(str);
		System.out.println(answer);
	}
}