public class Greedy {
    public static void main(String[] args) {
        int[] coins = new int[] { 500, 100, 50, 10 };    // 동전의 종류
        
        int amount = 1260;  // 거스름돈
        int count = 0;      // 동전의 개수
        
        for (int coin : coins) {
            count += amount / coin;
            amount %= coin;
        }
        
        System.out.println("최소 동전의 개수 : " + count);
    }
}
