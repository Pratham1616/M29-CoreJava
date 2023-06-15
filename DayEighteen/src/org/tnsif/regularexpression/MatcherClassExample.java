package org.tnsif.regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherClassExample {

	public static void main(String[] args) {
		
		Pattern p = Pattern.compile("Job");
		//Pattern p1 = Pattern.compile("Programming");
		Matcher m = p.matcher("Java Programming is enough to get a Job");
		
		while(m.find())
		{
			System.out.printf("pattern found from: " + m.start() +" " + (m.end()-1));
		}

	}

}