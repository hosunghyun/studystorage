public class SelectionSort{
    public static void main(String[] args) {
        int[] arr = new int[] {9, 1, 6, 8, 4, 3, 2, 0};
        
        System.out.println("정렬 전 배열");
       	for(int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        
        for(int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
        
        System.out.println("정렬 후 배열");
        for(int i : arr) {
            System.out.print(i + " ");
        }
    }
}