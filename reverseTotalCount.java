/*
 * For two numbers in the array,
 * if the first number is greater than the following number,
 *  the two numbers form a reverse pair.
 * Enter an array and find the total number of reverse pairs in this array.
 *
 *
 */
class reverseToCount {
    public int count(int[] arr) {
        int total = 0;
          for (int i=0;i<arr.length;++i){
              for(int j=i+1; j<arr.length;++j){
                  if (arr[j]<arr[i]){
                      ++ total;
                  }
              }
        }
        return total;

    }

    public static void main(String[] args) {
        int[] arr = new int[]{8,5,4,2,1};
        int total = new reverseToCount().count(arr);
        System.out.println(total);






    }
}
