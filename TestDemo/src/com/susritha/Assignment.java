package com.susritha;

public class Assignment {
	public static int findlarge(int arr[]){  

        int lar=0;  

        for(int i=1;i<arr.length;i++){  

            if(lar<arr[i])  

                lar=arr[i];  

        }  

        return lar;  

 } 
	public static void main(String args[]){
		System.out.println("hello");
	}
	
	
}
