package ExampleClass;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class knapsack_dp {


	public static void main (String [] args)
	{
		int n;
		int C;
		
		Random randNum = new Random();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the value of C: ");
		C = sc.nextInt();
		
		System.out.print("Enter the value of n: ");
		n = sc.nextInt();
		
		int [] w = new int [n];
		int [] p = new int [n];
		
		/*
		for (int i=0; i<n; i++)
		{
			w[i]=Math.abs(randNum.nextInt(C) + 1);
			p[i]=Math.abs(randNum.nextInt());
		}
		*/
		
		System.out.println("Enter the value(s) of weights: ");
		for(int i=0; i<n;i++)
		{
			int weight = sc.nextInt();
			w[i] = weight;
		}
		
		System.out.println("Enter the value(s) of profits: ");
		for(int i=0; i<n;i++)
		{
			int pr = sc.nextInt();
			p[i] = pr;
		}
		
		/*
		System.out.println("The weight array is: ");
		for(int i=0; i<n;i++)
		{
			System.out.print(w[i]+" ");
			System.out.println();
		}
		
		System.out.println("The profit array is: ");
		for(int i=0; i<n;i++)
		{
			System.out.print(p[i]+" ");
			System.out.println();
		}
		*/
		
		knapsack.UnboundedKnapsack(w, p, C, n);
	}
}
