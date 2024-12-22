import java.util.*;

public class DFS {
    // 그래프를 인접 리스트로 표현
    static class Graph {
        private int V; // 노드 수
        private LinkedList<Integer>[] adj; // 인접 리스트

        Graph(int v) {
            V = v;
            adj = new LinkedList[v];
            for (int i = 0; i < v; i++) {
                adj[i] = new LinkedList<>();
            }
        }

        // 간선 추가
        void addEdge(int v, int w) {
            adj[v].add(w);
        }

        // DFS 메서드
        void DFSUtil(int v, boolean[] visited) {
            // 현재 노드 방문
            visited[v] = true;
            System.out.print(v + " ");

            // 모든 인접 노드 탐색
            for (int neighbor : adj[v]) {
                if (!visited[neighbor]) {
                    DFSUtil(neighbor, visited); // 재귀 호출
                }
            }
        }

        // DFS 시작점
        void DFS(int startNode) {
            boolean[] visited = new boolean[V]; // 방문 여부 확인 배열
            DFSUtil(startNode, visited);
        }
    }

    public static void main(String[] args) {
        Graph graph = new Graph(6); // 노드가 5개 (0번 노드는 사용하지 않음)

        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.addEdge(3, 5);

        System.out.println("DFS 탐색 결과:");
        graph.DFS(1); // 1번 노드부터 시작
    }
}

