package pregunta3_bigO;

public class Combinaciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Combinaciones combinations = new Combinaciones();
		int n = 1;
		System.out.println("# Ladder's steps: " + n);
		for(int i = 0;i<n;i++) {
			int level = 0;
			long a1,a2;
			a1 = countCombinations(n-i,level+1);
			a2 = countCombinations(n-i,level+1)+a1;
			level++;
			
		}
		System.out.println("# Step combinations: " + combinations.countCombinations(n, 0));
		
	
	}
	public static long countCombinations(int n, int level) {
		int a = 0;
		if (n < 0) {
			a=0;
		}
		if (n == 0 && level == 0) {
			a=0;
		}
		if (n == 0 && level > 0) {
			a=1;
		}	
		return a;
	}

}
