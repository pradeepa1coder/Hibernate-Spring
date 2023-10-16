package Patterns;

public class Pattern4 {
	public static void main(String[] args) {
		int n = 5;
		for (int row = 1; row <= n * 2 - 1; row++)
		{
			if (row <= n) 
			{
				for (int col = 1; col <= row; col++) 
				{
					System.out.print("* ");
				}
				System.out.println();
			}
				
					
				
		}
		
	}
}

//*
//**
//***
//****
//*****
//****
//***
//**
//*
// n=5