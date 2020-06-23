package come.codewithiqra;

public class Main {

    public static void main(String[] args) {
	int array[]= {3,2,1,4,6,77,88,99,6,5};
	int sum = 0;

	   for (int i: array)
	   	sum= sum+i;
		System.out.println("The Sum Of This Array: "+sum);
    }
}
