package com.st.test;

public class TestMP {
    public static void main(String[] args) {
        int[] arr={7,5,3,2,4,9,1,0};
        int temp;
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]<arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for (int a:arr
             ) {
            System.out.print(a);
        }
    }
}
