
public class ArraySum {
	public int sumOfArray(Integer[] a, int index) {
		int total;
		if (index == 0) 
			total = a[index];
		else 
			total = a[index] + sumOfArray(a, index-1);
		return total;
	}
}
