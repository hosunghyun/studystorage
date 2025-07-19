import java.util.*;

public class BFS {
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

        // BFS 메서드
        void BFS(int startNode) {
            boolean[] visited = new boolean[V]; // 방문 여부 확인 배열
            Queue<Integer> queue = new LinkedList<>(); // 큐 생성

            visited[startNode] = true; // 시작 노드 방문 처리
            queue.add(startNode); // 시작 노드를 큐에 추가

            while (!queue.isEmpty()) {
                int node = queue.poll(); // 큐에서 노드 꺼내기
                
                System.out.print(node + " ");

                // 인접 노드 방문
                for (int neighbor : adj[node]) {
                    if (!visited[neighbor]) {
                        visited[neighbor] = true;
                        queue.add(neighbor);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Graph graph = new Graph(6); // 노드가 5개 (0번 노드는 사용하지 않음)

        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.addEdge(3, 5);

        System.out.println("BFS 탐색 결과:");
        graph.BFS(1); // 1번 노드부터 시작
    }
}
