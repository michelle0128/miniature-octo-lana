
public class Coins {
	public static void main(String[] args ){
		int x = Integer.parseInt(args[0]);
		if (x>1000)
			System.out.println("zu viel Argument");
		else if (x>200)
			System.out.println(x + " can be paid in "+ two_hundred(x,0,0) + " ways ");
		else if (x>=100 && x<200)
			System.out.println(x + " can be paid in "+ hundred(x,0,0) + " ways ");
		else if (x>=50 && x<100)
			System.out.println(x + " can be paid in "+ fifty(x,0,0) + " ways ");
		else if (x>=20 && x<=50)
			System.out.println(x + " can be paid in "+ twenty(x,0,0) + " ways ");
		else if (x>=10 && x<=20 )
			System.out.println(x + " can be paid in "+ ten(x,0,0) + " ways ");
		else if (x>1 && x<10)
			System.out.println(x + " can be paid in "+ five(x,0,0) + " ways ");
		else
			System.out.println(x + " can be paid in 1 ways ");
	} 

	public static int five(int m,int V,int counter){
		int V_limit = m/5;

		for(V=0;V<=V_limit;V++){
			int two_limit = (m-V*5)/2;
			counter += 1 + two_limit  ;
	    }

		return counter;
	}
	public static int ten(int m,int X,int counter){
		int X_limit = m/10;
		for(X=0;X<=X_limit;X++){
		    
		    counter += five(m-X*10,0,0);
		}
		return counter;
	}
	public static int twenty(int m,int XX,int counter){
		int XX_limit = m/20;
		for(XX=0;XX<=XX_limit;XX++){
			counter += ten(m-XX*20,0,0);
		}
		return counter;
	}
    public static int fifty(int m,int L,int counter){
    	int L_limit = m/50;
    	for(L=0;L<=L_limit;L++){
    		counter = counter + twenty(m-L*50,0,0);
    
    	}
    	
    	return counter;
    }
    public static int hundred(int m ,int C,int counter){
    	int C_limit = m/100;
    	for(C=0;C<=C_limit;C++){
    		if(m-C*100<10)
    			counter += five(m-C*100,0,0);
    		if(m-C*100>=10&&m-C*100<20)
    			counter += ten(m-C*100,0,0);
    		if(m-C*100>=20&&m-C*100<50)
    		  counter += twenty(m-C*100,0,0);
    		else
    		  counter += fifty(m-C*100,0,0);
    		
    	}
    	return counter;
    }
    public static int two_hundred(int m,int CC,int counter){
    	int CC_limit = m/200;
    	for(CC=0;CC<=CC_limit;CC++){
    		if(m-CC*200<10)
    			counter += five(m-CC*200,0,0);
    		if(m-CC*200>=10 && m-CC*200<20)
    			counter += ten(m-CC*200,0,0);
    		if(m-CC*200>=20 && m-CC*200<50)
    			counter += twenty(m-m-CC*200,0,0);
    		if(m-CC*200>=50 && m-CC*200<100)
    			counter += fifty(m-CC*200,0,0);
    		else
    			counter += hundred(m-CC*200,0,0);

    	}
    	return counter;
    }

}
