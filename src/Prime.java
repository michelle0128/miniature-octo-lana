
public class Prime {
	public static void main(String []args){
		int n = Integer.parseInt(args[0]);
		int N = n*n;
		
		boolean [] p = new boolean [N];
		
		for (int i = 2; i<N; i++)
		   p[i]= true;
		for (int i=2; i*i<N; i++){
			if (p[i]){
				for (int t = 2; t*i<N; t++)
					p[t*i] = false;
			}
		
		}
         for (int i=2,j=0;i<N && j<n; i++) {
        	 
        	 if (p[i]){
        	    j++;
        	
         System.out.println(i);
      
        	 }
                  	   
        
}}
}
