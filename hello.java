public class Test {
	
	public int findMax(int[] array) {
		int max = Integer.MAX_VALUE;
		
		for(int i = 0; i < array.length; i++) {
			if(i > max) {
				max = i;
			}
		}
		return max;
	}
}
