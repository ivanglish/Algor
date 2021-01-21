package comscore;

public class ChainCut {
	
	public static void main(String[] args) {
		
		int min=Integer.MAX_VALUE;
		int min2=Integer.MAX_VALUE;
		int [] array = {5,2,1,-7,3,8};
		for (int i = 1; i < array.length-1; i++) {
			if (array[i]<min) {
				min2=min;
				min=array[i];
				i++;
			}
			if (array[i]<min2 && array[i]>min) min2=array[i];
		}
		System.out.println(min+min2);
	}
}
