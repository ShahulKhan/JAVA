package week2.day4;

public class FebonocciFor8 {

public static void main(String[] args) {

	int range = 8;
	int value1 = 0;
	int value2 = 1;
	
	for (int i = 0; i < range; i++) {
		int sum=value1+value2;
		value1=value2;
		value2=sum;
		System.out.println(sum);
	}
}

}
