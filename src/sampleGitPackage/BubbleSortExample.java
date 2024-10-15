package sampleGitPackage;

public class BubbleSortExample {
 public static void main(String [] args){
     int [] arr={35,1,5,16,3,9,12};//{4,2,1,5,3};
     System.out.println("array Before Sorting");
     for(int i=0;i<arr.length; i++){
         System.out.println(arr[i]);
     }
     for(int i=0;i<arr.length-1;i++){
         for(int j=0;j<arr.length-i-1;j++){
             if(arr[j]>arr[j+1]){
                 int temp=arr[j];
                 arr[j]=arr[j+1];
                 arr[j+1]=temp;
             }
         }
     }
     System.out.println("array after After Sort");
     for(int k=0;k<arr.length;k++){
         System.out.println(arr[k]);
     }
 }
}
