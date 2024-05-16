// 내 노드를 제외한 다른 노드를 방문했으면 true, 안 했으면 false
class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] visited = new boolean[n];
        
        for (int i = 0; i < n; i++) {
            if (!visited[i]) { // 아직 방문 안 했으면
                answer++; // 네트워크 수 증가
                dfs(i, computers, visited); // 연결된 컴퓨터들 모두 방문
                // 이게 다 끝나면 연결된 네트워크들은 모두 true로 변했고,
                // 연결이 안 됐으면 false 라서 네트워크 개수가 1이 더 증가함
            }
        }
        
        return answer;
    }
    
    public void dfs(int curr, int[][] computers, boolean[] visited) {
        visited[curr] = true;

        for (int i = 0; i < computers.length; i++) {
            if (computers[curr][i] == 1 && !visited[i]) { // computer[][] 가 1이고, 방문을 하지 않았으면 해당 컴퓨터 방문
                dfs(i, computers, visited); // 연결된 컴퓨터를 방문
            }
        }
    }
}