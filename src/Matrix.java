public class Matrix {
	static double[][] add(double[][] M1, double[][] M2){
		if(M1.length < 1 | M2.length < 1 //Keine Zeilen
			| M1[0].length < 1 | M2[0].length < 1 //Keine Spalten
			| M1. length != M2.length //Zeilenzahl ungleich
			| M1[0].length != M2[0].length //Spaltenzahl ungleich
			){
			System.out.println("Matrizen sind nicht addierbar.");
			return null;
		}
		
		for(int i = 0; i < M1.length; i++){
			for(int j = 0; j < M1[0].length; j++){
              M1[i][j]+=M2[i][j];
			}
		}
		return M1;
	}
    static double[][] sub(double[][] M1,double[][] M2){
    	 if(M1.length < 1 | M2.length < 1 //Keine Zeilen
    				| M1[0].length < 1 | M2[0].length < 1 //Keine Spalten
    				| M1. length != M2.length //Zeilenzahl ungleich
    				| M1[0].length != M2[0].length //Spaltenzahl ungleich
    				){
    				System.out.println("Matrizen sind nicht substrahierbar.");
    				return null;
    			}
    	 for(int i =0; i < M1.length; i++){
    		 for(int j = 0; j < M1[0].length;j++){
    			 M1[i][j]-=M2[i][j];
    		 }
    	 }
         return M1;
    }
    static double[][] mul(double[][] M1, double[][] M2){
    	 if  (M1.length < 1 | M2.length < 1 //Keine Zeilen
 				| M1[0].length < 1 | M2[0].length < 1 //Keine Spalten
 				| M1[0].length != M2.length//die Anzahl der Spalte von M1
						                  // die Anzahl der Zeile ungleich
						){
				System.out.println("Matrizen sind nicht multiplizierbar.");
				return null;
			}
    	 double[][] MUL = new double[M1.length][M2[0].length];
    	 for (int i = 0; i < M1.length; i++){
			for (int j = 0; j < M2[0].length; j++){
			   for (int m = 0, n = 0; m <M2.length && n < M1[0].length; n++, m++)
				   MUL[i][j] += M1[i][n] * M2[m][j];
				   }
    	 }
			
    	 return MUL;
    }
    static double[][] transpose(double[][] M) {
    	if(M.length<1|//Keine Zeilen
    	   M[0].length<1//Keine Spalten
    	   ){System.out.println("Matrix ist nicht transponierbar.");
			return null;}
   
    	double trans[][] = new double[M[0].length][M.length];
		for (int i = 0; i<M.length; i++){
			for (int j = 0; j<M[0].length; j++){
				trans[j][i]=M[i][j];
			}
		}
		return trans;
    }
    
    public static void test(){
    	testADD();
    	testSUB();
    	testMUL();
    	testTRANSPOSE();
    }
    
	public static void testADD(){
		double[][] M1 = {{1,2,3},
		      {3,4,5},
		      {6,7,9}};
		double[][] M2 = {{6,7,9},
				         {1,2,3},
		                 {4,5,6}};
		double[][] add_result = {{7,9,12},
				                 {4,6,8},
				                {10,12,15}
		};
		
		
		assert matrixEquals(add(M1,M2),add_result);
		
	}
	public static void testSUB(){
		double[][] M1 = {{1,2,3},
			             {3,4,5},
			            {6,7,9}};
	    double[][] M2 = {{6,7,9},
					     {1,2,3},
			             {4,5,6}};
	    double[][] sub_result ={{-5,-5,-6},
	    		                 {2,2,2},
	    		                 {2,2,3}};
	    assert matrixEquals(sub(M1,M2),sub_result);
	}
	public static void testMUL(){
		double[][] M1 ={{2,3,4},
		                {3,4,7}};
		double[][] M2 ={{2,3},
				        {4,6},
				        {3,5}};
		double [][] mul_result ={{28,44},
		                          {43,68}};
		assert matrixEquals(mul(M1,M2), mul_result);
	}
	public static void testTRANSPOSE(){
		double[][] M ={{3,5},
				       {2,5},
				       {4,7},
				       {4,9}};
		double[][] transpose_result ={{3,2,4,4},
				                      {5,5,7,9}};
		assert matrixEquals(transpose(M),transpose_result);
	}
	
	public static boolean matrixEquals(double[][] M1, double[][] M2){
		try {
			for(int i = 0; i<M1.length; i++){
				for(int j = 0; j<M1[0].length; j++)
					if(M1[i][j]!=M2[i][j])
						return false;
			}
			return true;
		}
		catch (Exception e){
			return false;
		}
	}
	
	public static void main(String[] args){
		test();
		
		
	}

}
