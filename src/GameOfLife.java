import gdp.stdlib.*;

public class GameOfLife {public static void visualize(boolean[][] gol) {

	StdDraw.clear();

	for (int i = 0; i < gol.length; ++i) {
		for (int j = 0; j < gol[i].length; ++j) {
			if (gol[i][j]) {
				StdDraw.setPenColor(StdDraw.BLUE);
				StdDraw.filledCircle(i+0.5, j+0.5, 0.5);
			}
		}
	}
	StdDraw.show(200);
}

public static void main(String[] args) {

	int x = Integer.parseInt(args[0]);
	int y = Integer.parseInt(args[0]);
	
	StdDraw.setXscale(0, x);
	StdDraw.setYscale(0, y);
	StdDraw.show(50);
	
	boolean[][] gol = new boolean[x][y];
	
	for (int i = 0; i < x; ++i) {
		for (int j = 0; j < y; ++j) {
			gol[i][j] = (Math.random() >= 0.5)?true:false;
		}
	}
	while (true) {
			visualize(gol);
			
		     for (int i=0;i<x;++i){
		    	 for(int j=0;j<y;++j){
		   
		    	    		 if(gol[i][j]){
		    	    			 boolean [][] next_gen = new boolean[i][j];
		    	    			 for(int a=0;a<x;++a){
		    	    				 for(int b=0;b<y;++b){
		    	    					 for(int count=0;count<8;)
		    	    					 if (next_gen [a][b]!=gol[i][j]){
		    	    							 count++;
		    	    							 if(count>1&&count<4){
		    	    								 visualize(next_gen);
		    	    								  if(count==1||count>3){
		    	    									 gol[i][j]=false;
		    	    								 }
		    	    							 }
		    	    					 }
		    	    				 }
		    	    			 }
		    	    			 
		    	    			 
		    	    			 
		     }}}}}}


