package array;


public class Average {
	public static void main(String[] args) {
	int[] array= {10,20,30,40,50,60,70,80};
	int sum =0;
	int evenSize=0;
	int size = array.length;
	for(int i=0;i<array.length;i++) {
		
		if (i%2==0) {
			sum += array[i];
			evenSize++;
		}
		}
	int evenAverage=sum/evenSize;
	//double average = sum/size;
	System.out.println(evenAverage);
}
}