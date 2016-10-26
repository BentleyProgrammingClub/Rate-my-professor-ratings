import java.net.*;
import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;


public class Main {

	
	public static void main(String[] args) throws IOException {
	
		URL url = new URL("https://my.bentley.edu/web/guest/course-listings/-/courses/201609/UC/D/EC?p_p_lifecycle=0&p_p_state=normal&p_p_mode=view&p_p_col_id=column-1&p_p_col_count=1");
		
		URLConnection con = url.openConnection();
		InputStream is = con.getInputStream();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		
		String line = null;
		
		while ((line = br.readLine()) != null){
			
			System.out.println(line);
		}

	}

}
