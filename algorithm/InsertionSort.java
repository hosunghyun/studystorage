public class InsertionSort{
    public static void main(String[] args) {
        int[] arr = new int[] {31, 25, 12, 22, 11};
        
        System.out.println("정렬 전 배열");
       	for(int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        
        for(int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        
        System.out.println("정렬 후 배열");
        for(int i : arr) {
            System.out.print(i + " ");
        }
    }
}