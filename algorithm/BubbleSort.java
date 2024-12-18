public class BubbleSort{
    public static void main(String[] args) {
        int[] arr = new int[] {7, 2, 0, 1, 5, 6, 4};
        System.out.println("정렬 전 배열");
       	for(int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        
        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = 0; j < arr.length - 1; j++) {
                if(arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        
        System.out.println("정렬 후 배열");
        for(int i : arr) {
            System.out.print(i + " ");
        }
    }
}
