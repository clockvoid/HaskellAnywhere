
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Core.*;

public class Main {

	private static String inputString() throws IOException {
		String result = "";
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		result = reader.readLine();
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringShaper shaper = new StringShaper();
		
		String inputBuffere;
		while (true) {
			try {
				inputBuffere = inputString();
				if (inputBuffere.equals("quit")) {
					break;
				} else {
					System.out.println(shaper.input(inputBuffere));
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

	}

}