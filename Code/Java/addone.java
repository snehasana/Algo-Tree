import java.io.*;

import java.util.*;

class addone{

    public static int[] add_one(int []arr, int n){
     int carry = 1;
    
    int value,sum;
    int[] result = new int[n+1];  // output array
    for(int i =n-1;i>=0;i--){
    sum = (arr[i] +carry);
    value = sum%10;
    carry = sum/10;
    result[i+1] = value;
    
    }
    
    if( carry !=0){
    result[0] = carry;
    
    }
    // counter to count number of leading zeroes
    int counter =0;
    
    for(int k =0;k<result.length;k++)
    {
    if(result[k]!=0){
    break;}
    counter++;
    }
    //create new array if  number of leading zeros >0
    if(counter>0){
    int[] resarr= new int[result.length-counter];
    for(int i=0; i<result.length-counter;i++){
    resarr[i] = result[i+counter];
    }
     return resarr;
    }
     return result;
    }


    public static void main(String[] args) 
    {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter all the elements:");
        for(int i = 0; i < n; i++)
        {
            arr[i] = s.nextInt();
    }
   System.out.print(Arrays.toString( add_one(arr,n)));


s.close();


    }
}