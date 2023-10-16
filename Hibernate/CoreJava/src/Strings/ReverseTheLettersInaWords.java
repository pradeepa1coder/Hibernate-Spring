package Strings;

import java.util.Scanner;

public class ReverseTheLettersInaWords
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a String ");
		String str=sc.nextLine();//rama laxman sai nagendra
		String temp="";			 //012345678910	
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);//r a m a
			if(ch!=' ')
			{
				temp=ch+temp;//amar
			}
			else
			{
				System.out.print(temp+" ");//**IMP**
				temp="";
			}
		}
		System.out.print(temp);// anamxal
		
	}
}