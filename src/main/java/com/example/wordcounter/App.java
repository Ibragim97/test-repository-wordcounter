package com.example.wordcounter;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Word Count Testing App!");
    }
    
    public static int wordcount(String s) {
   		String[] parts = s.split(" ");
		int cnt = 0;
	
		for(int i = 0; i < parts.length; i++)
			cnt += (parts[i].length() > 0 ? 1 : 0);
		
		return cnt;
    }
}
