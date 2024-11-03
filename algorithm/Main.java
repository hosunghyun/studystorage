package algorithm;

class SequenceSearch {
    public int sequenceSearch(int n, int[] S, int x) {
        int location = 0;
        while (location <= n && S[location] != x) {
            location++;
        }
        if(location > n) {
            location = 0;
        }
        return location;
    }
}

public class Main {
    public static void main(String[] args) {
        SequenceSearch sequenceSearch = new SequenceSearch();
        int[] S = new int[] {10, 7, 11, 5, 13, 8};
        int n = 6;
        int location = sequenceSearch.sequenceSearch(n, S, 5);
        System.out.println("result : " + location);
    }
}
