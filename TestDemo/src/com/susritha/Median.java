package com.susritha;

import java.util.Arrays;

public class Median{
	
	
	public int medianfind(int a[]){
		int i=0;
		int[] b= new int[a.length];
		b[0]=a[a.length-1];
		for(i=0;i<a.length-1;i++){
			b[i+1]=a[i];
		}
		for(i=0;i<b.length;i++){
			System.out.println(b[i]);
		}
		Arrays.sort(a);
		int n = a.length;
		if(n%2==0){
			return (a[(n/2)-1]+a[((n/2)+1)-1])/2;
		}
		else
			return a[n/2];
	}

	public static void main(String[] args) {
			}

}
