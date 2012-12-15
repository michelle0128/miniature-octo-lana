
public class Permutation {
	private static void perm(String[] letters, int n, int depth) {
		if (n<0||n>26) { System.out.println("zu wenige/viele Argumente");
		                  return;}
		if (n == depth) {
		   String[]output = new String[n];
		   for(int t=0;t<n;)
		   for (int i = 0; i < n; i++){
			   output[i] = letters[i];
	           System.out.print(letters[i]);
		             t++;               }
		       System.out.println("");      }
		  
		  else {
		   for (int i =depth; i < n; i++) {
		    generate(letters, depth, i);
		    perm(letters, n,depth + 1);
		    generate(letters, i, depth);
		   }
		  }
		 }

		 private static void generate(String[] gen, int x, int y) {
		  String temp = gen[x];
		  gen[x] = gen[y];
		  gen[y] = temp;
		 }

	public static void main(String[] args) {
		  String [] alphabet=  {"a","b","c","d","e","f","g","h","i","j","k","l","m",
                             "n","o","p","q","r","s","t","u","v","w","x","y","z"};
		  int N= Integer.parseInt(args[0]);
		  perm(alphabet, N, 0);
		 }

}
