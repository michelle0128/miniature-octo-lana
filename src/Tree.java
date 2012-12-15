/* recursive graphic--Tree
 * @author Fusui Jiang
 * @version 1.0 Dec 09,2012*/





import gdp.stdlib.*;
/* @param size die Länge von der Baumzweigen
 * @param angle  die Winkeln von der Baumzweigen*/

public class Tree { 
	public static void draw(int n,double size,double angle, double x,double y){
	 if(n == 0) return;//keiner Baumzweig
	 StdDraw.setPenRadius(0.025);
	 StdDraw.line(0.5,0.4,0.5,0.0);//der Stamm
	 if(n-1==0)return;
	 double x0 = ((x*Math.cos(1.8708+angle)-y*Math.sin(1.8708+angle))*size*0.5)+x,//um wie viel Grad wird der Baumzweig gedreht,die Länge
			x1 = ((x*Math.cos(0.9599+angle)-y*Math.sin(0.9599+angle))*size*0.25)+x,// wird von "size" beschränkt,
			x2 = ((x*Math.cos(-6.1086+angle)-y*Math.sin(-6.1086+angle))*size*0.8)+x;
	 double y0 = ((x*Math.sin(1.8708+angle)+y*Math.cos(1.8708+angle))*size*0.5)+y,
			y1 = ((x*Math.sin(0.9599+angle)+y*Math.cos(0.9599+angle))*size*0.25)+y,
			y2 = ((x*Math.sin(-6.1086+angle)+y*Math.cos(-6.1086+angle))*size*0.8)+y;
    
	 StdDraw.setPenRadius(0.025*size);
	
	 StdDraw.line(x,y,x0,y0);
	 StdDraw.line(x,y,x1,y1);
	 StdDraw.line(x,y,x2,y2);
	 
	 
	 draw(n-1,size/1.5+0.005,angle+0.7853,x0,y0);
	 draw(n-1,size/3+0.005,angle+0.3421,x1,y1);
	 draw(n-1,size/2.0+0.005,angle-0.7854,x2,y2);
}
/*N wird als ein Kommandozeilenargument einliest
 * Die Anfangsmaße (Größe,Winkel,die Koordinaten)werden gesetzt*/
 public static void main(String[] args){
  
	  int N = Integer.parseInt(args[0]);
	  draw(N,  .5,0, .5, .4);
	  

	 }

}
