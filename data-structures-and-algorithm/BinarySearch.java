public class BinarySearch {
    public static void main(String[] args) {

        int[] myArray = {2,3,4,6,8};
        int target = 5;
        int high = myArray.length - 1;
        int low = 0;
        int ave = (high + low) / 2;
        while (true) {
            ave = (high + low) / 2;
            System.out.println("AVE: " + ave + " HIGH: " + high + " LOW: " + low);
            if (target == myArray[ave]) {;            
                System.out.println("Value found at index: " + ave);
                break;
            } else if (target < myArray[ave]) {
                high = --ave;
            } else if (target > myArray[ave]) {
                low = ++ave;
            } 
            if (low >= high) {
                System.out.println("Value not found");
                break;
            }
        }
    }
}
