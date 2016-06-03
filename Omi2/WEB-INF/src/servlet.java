import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
import java.io.FileWriter;
import java.io.IOException;
//import org.json.simple.JSONArray;
/*import org.json.simple.JSONObject;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.ArrayList;*/


public class servlet extends HttpServlet {
	int hitCount = 0;
	int a = 0;

	String allCards[] = {"cards/0_1.png","cards/0_2.png","cards/0_3.png","cards/0_4.png","cards/0_5.png","cards/0_6.png","cards/0_7.png","cards/0_8.png","cards/0_9.png","cards/0_10.png","cards/0_11.png","cards/0_12.png","cards/0_13.png","cards/1_1.png","cards/1_2.png","cards/1_3.png","cards/1_4.png","cards/1_5.png","cards/1_6.png","cards/1_7.png","cards/1_8.png","cards/1_9.png","cards/1_10.png","cards/1_11.png","cards/1_12.png","cards/1_13.png","cards/2_1.png","cards/2_2.png","cards/2_3.png","cards/2_4.png","cards/2_5.png","cards/2_6.png","cards/2_7.png","cards/2_8.png","cards/2_9.png","cards/2_10.png","cards/2_11.png","cards/2_12.png","cards/2_13.png","cards/3_1.png","cards/3_2.png","cards/3_3.png","cards/3_4.png","cards/3_5.png","cards/3_6.png","cards/3_7.png","cards/3_8.png","cards/3_9.png","cards/3_10.png","cards/3_11.png","cards/3_12.png","cards/3_13.png"};
	String[][] cards = new String[4][15];
	int k,i,j,n;

	String[] players = new String[4];
	
	public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException, IOException{
		hitCount++;
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String name = request.getParameter("img");

		//handle players
		/*if(name == "start"){
			a++;
			if(a < 4) out.println(a);			
		}
		*/

		int p = Integer.parseInt(name);
		//if(name == Integer.toString(hitCount)){
			
		    
	Random randomGenerator = new Random();
	//for(j = 0; j<4;j++){
	//out.print("[");
	for (i = 0; i < 13; i++){
				n = i;
		    	k = randomGenerator.nextInt(52);
		    	
		    	while(allCards[k] == null){
		    	k = randomGenerator.nextInt(52);
		    	}
		    	cards[p][i] = allCards[k];
		    	allCards[k] = null;
		    	out.print(cards[p][i]);
		    	
		    	if(n<12)
		    	out.print(",");
		    	//else	
		    	//out.print("]");	
		}

		//String s = '{"cards":[{"image": data[p][0]},{"image": data[p][1]},{"image": data[p][2]},{"image": data[p][3]},{"image": data[p][4]},{"image": data[p][5]},{"image": data[p][6]},{"image": data[p][7]},{"image": data[p][8]},{"image": data[p][9]},{"image": data[p][10]},{"image": data[p][11]},{"image": data[p][12]}]}';
		//out.print(s);
		//String s =  '{"cards":[{"image": '+ cards[p][0]+'},{"image": '+cards[p][1] +'},{"image": '+cards[p][2]+'},{"image": '+cards[p][3]+'},{"image":'+ cards[p][4]+'},{"image": +'cards[p][5]+'},{"image": +'cards[p][6]+'},{"image":'+ cards[p][7]+'},{"image":'+cards[p][8]+'},{"image":'+ cards[p][9]+'},{"image": '+cards[p][10]+'},{"image":'+ cards[p][11]+'},{"image": '+cards[p][12]+'},{"image": '+cards[p][13]+'}] }';
		

//}



	}

	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException, IOException{
		
				response.setContentType("text/html");
				PrintWriter out = response.getWriter();
			    String name1 = request.getParameter("img1");
		   		out.println(name1);

	
		
	}


}



