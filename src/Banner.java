
public class Banner {
	private static String[][] number={{
	 	   "  ###   ",
	 	   " #   #  ",
	 	   "#     # ",
	 	   "#     # ",
	 	   "#     # ",
	 	   " #   #  ",
	 	   "  ###   "
	 	},{
	 	   "  #   ",
	 	   " ##   ",
	 	   "# #   ",
	 	   "  #   ",
	 	   "  #   ",
	 	   "  #   ",
	 	   "##### "
	 	},{
	 	   " #####  ",
	 	   "#     # ",
	 	   "      # ",
	 	   " #####  ",
	 	   "#       ",
	 	   "#       ",
	 	   "####### "
	 	},{
	 	   " #####  ",
	 	   "#     # ",
	 	   "      # ",
	 	   " #####  ",
	 	   "      # ",
	 	   "#     # ",
	 	   " #####  "
	 	},{
	 	   "#       ",
	 	   "#    #  ",
	 	   "#    #  ",
	 	   "#    #  ",
	 	   "####### ",
	 	   "     #  ",
	 	   "     #  ",
	 	},{
	 	   "####### ",
	 	   "#       ",
	 	   "#       ",
	 	   "######  ",
	 	   "      # ",
	 	   "#     # ",
	 	   " #####  "
	 	},{
	 	   " #####  ",
	 	   "#     # ",
	 	   "#       ",
	 	   "######  ",
	 	   "#     # ",
	 	   "#     # ",
	 	   " #####  ",
	 	},{
	 	   "####### ",
	 	   "#    #  ",
	 	   "    #   ",
	 	   "   #    ",
	 	   "  #     ",
	 	   "  #     ",
	 	   "  #     "
	 	},{
	 	   " #####  ",
	 	   "#     # ",
	 	   "#     # ",
	 	   " #####  ",
	 	   "#     # ",
	 	   "#     # ",
	 	   " #####  "
	 	},{
	 	   " #####  ",
	 	   "#     # ",
	 	   "#     # ",
	 	   " ###### ",
	 	   "      # ",
	 	   "#     # ",
	 	   " #####  "
	 	}}	;
	
public static void main (String[] args){
	String s = "";
	
    s= args[0];
	String[] output = {"","","","","","",""};
	
	
	for (int line = 0; line < 7; line++) {
		
		for (int i = 0; i < s.length(); i++) {
			String add = number [Integer.parseInt(s.substring(i, i + 1))][line];

			output[line] = output[line].concat(add);
		}
	}
	

	for (int line = 0; line < 7; line++){
		System.out.println(output[line]);
	}}
	
}

