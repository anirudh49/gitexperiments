
public class IntegerArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {26, 3, 45, 86, 1};
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			int temp = arr[i];
			if(temp<min)
				min = temp;
			if(temp>max)
				max = temp;
		}
		System.out.println("Largest Number in array is:" + max);
		System.out.println("Smallest Number in array is:" + min);
	}

}
