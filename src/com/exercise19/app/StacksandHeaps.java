package com.exercise19.app;

import java.util.Stack;

public class StacksandHeaps 
{
	String cad = "Alejandra Avila Torres";
	
	Stack<Character> letters = new Stack<Character>();
	char[] lettersArray = cad.toCharArray();
	{
	
		for(Character c: lettersArray)
		{
			if(Character.toUpperCase(c)=='A')
			{
				letters.push(c);
			}
		}
		while(!letters.isEmpty())
		{
			System.out.println(letters.pop());
		}
		
	}	
	
}
