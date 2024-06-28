import java.util.LinkedList;
import java.util.Queue;

class Solution {
    static int[][] arr;

    public int solution(int n, int[][] wires) {
        int answer = n;
        arr = new int[n + 1][n + 1];
        
        // 1. 인접 행렬에 input
        for (int i = 0; i < wires.length; i++) {
            arr[wires[i][0]][wires[i][1]] = 1;
            arr[wires[i][1]][wires[i][0]] = 1;
        }
        
        // 2. 선을 하나씩 끊어보며 순회
        int a, b;
        for (int i = 0; i < wires.length; i++) {
            a = wires[i][0];
            b = wires[i][1];
            
            // 선을 하나 끊고
            arr[a][b] = 0;
            arr[b][a] = 0;
            
            // bfs
            answer = Math.min(answer, bfs(n, a));
            
            // 선 다시 복구
            arr[a][b] = 1;
            arr[b][a] = 1;
        }
        
        return answer;
    }
    
    public int bfs(int n, int start) {
        boolean[] visited = new boolean[n + 1];
        int cnt = 1;
        
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        visited[start] = true;
        
        while (!queue.isEmpty()) {
            int point = queue.poll();
            
            for (int i = 1; i <= n; i++) { // point와 연결된 애들 중에 방문한 적 없는 노드 전부 큐에 넣기
                if (!visited[i] && arr[point][i] == 1) {
                    queue.offer(i);
                    visited[i] = true;
                    cnt++;
                }
            }
        }
        return Math.abs(n - 2 * cnt);
    }
}
