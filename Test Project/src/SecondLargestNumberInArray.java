public class SecondLargestNumberInArray {

    public static void main(String[] args) {

             int arr[] = { 14, 46, 47, 45, 92, 52, 48, 36, 66, 85 };
             
             System.out.println(arr.length);
             
             int largest = arr[0], secondLargest = arr[0];
             
             System.out.println(largest);
             
             System.out.println(secondLargest);

             for (int i = 0; i < arr.length; i++) {   
            	 
            	 System.out.println(arr[i]);
            	 
                 if (arr[i] > largest) {
                	 System.out.println("INSIDE IF");
                        secondLargest = largest;
                        largest = arr[i];

               } else if (arr[i] > secondLargest) {
            	   System.out.println("INSIDE ELSE IF");
                        secondLargest = arr[i];
               }
             }
             

             System.out.println("\nSecond largest number is:" + secondLargest);

    }
}


