
public class MrProduktSumme {
public static void main(String[] args){
	int product,summe;
	int k,l;
	    k=0;
	    l=0;
	product=k*l;
	summe=k+l;
	boolean [] p = new boolean [100];
	for (int i = 2; i<100; i++)
		   p[i]= true;
		for (int i=2; i*i<100; i++){
			if (p[i]){
				for (int t = 2; t*i<100; t++){
					p[t*i] = false;
					for(int x=0,y=0;x<100&&y<100;x++,y++){
						summe=t*i; 
						x=summe-y;
						System.out.println(x);
			     		 if(x*y!=i);
			     		                                  }
			                                  }
                      }
                                   }
                                      }
                           }