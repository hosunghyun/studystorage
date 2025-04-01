package algorithm;

class SequenceSearchs {
    public int sequenceSearch(int[] S, int F) {
        int location = -1;  // 인덱스 기본값은 -1로 설정 (찾지 못했을 때의 값)

        for (int i = 0; i < S.length; i++) {    // 배열의 길이만큼 순차적으로 검사
            if (S[i] == F) {
                location = i;  // 값을 찾으면 그 인덱스를 location에 저장
                break;  // 찾았으면 더 이상 탐색할 필요 없음
            }
        }

        // 찾지 못한 경우 location은 -1로 유지됨 (기본값)
        return location;
    }
}

public class SequenceSearch {
    public static void main(String[] args) {
        SequenceSearchs sequenceSearch = new SequenceSearchs();
        
        int[] S = new int[] {10, 7, 11, 5, 13, 8};  // 배열 S
        int F = 8;  // 찾을 원소

        int location = sequenceSearch.sequenceSearch(S, F);  // 배열 S에서 원소 8을 찾아라

        System.out.println("result : " + location);     // 원소 8의 인덱스를 출력
    }
}