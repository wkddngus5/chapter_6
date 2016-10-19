package chapter_6;

public class Exercise6_20 {
	
	public static int[] shuffle(int[] original){
		int[] shuffle = original;
		System.out.println(original.length);
		int tmp;
		int random;
		for(int i=0; i<100;i++){
			random=(int)(Math.random()*8+1);
			tmp=shuffle[random];
			shuffle[random]=shuffle[9-random];
			shuffle[9-random]=tmp;
		}
		
		return shuffle;	
	}
	public static void main(String[] args) {
		
		int[] original = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		System.out.println(java.util.Arrays.toString(original));

		int[] result = shuffle(original);
		System.out.println(java.util.Arrays.toString(result));
	}
}
