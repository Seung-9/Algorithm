class Solution {
    // 캐릭터가 처음 걸어본 길의 길이 구하기
    // 좌표평면 넘어가는 경우에는 해당 명령어 무시
    // 좌표 평면 넘어가는지 체크 -> 넘어가지 않고 방문하지 않았으면 count + 1
    // 좌표 평면 (0, 0) ~ (10, 10)
    // 시작위치 (5, 5)
    // ++ 어느 방향에서 오는지도 체크하기 U = 0 , L = 1, D = 2, R = 3
    public int solution(String dirs) {
        int answer = 0; // 카운트
        int x = 5, y = 5;


        boolean[][][] visited = new boolean[11][11][4];
        char[] dir = new char[dirs.length() + 1];


        // 문자열을 문자로 받기
        for (int i = 0; i < dirs.length(); i++) {
            dir[i] = dirs.charAt(i);
        }

        for (int i = 0; i < dir.length; i++) {

            // ULURRDLLU
            switch (dir[i]) {
                case 'U':
                    if (y < 10) {
                        if (!visited[x][y + 1][0] && !visited[x][y][2]) {
                            visited[x][y + 1][0] = true;
                            visited[x][y][2] = true;
                            answer++;
                        }
                        y += 1;
                    }
                    break;
                case 'L':
                    if (x > 0) {
                        if (!visited[x - 1][y][1] && !visited[x][y][3]) {
                            visited[x - 1][y][1] = true;
                            visited[x][y][3] = true;
                            answer++;
                        }
                        x -= 1;
                    }
                    break;
                case 'D':
                    if (y > 0) {
                        if (!visited[x][y][0] && !visited[x][y - 1][2]) {
                            visited[x][y][0] = true;
                            visited[x][y - 1][2] = true;
                            answer++;
                        }
                        y -= 1;
                    }
                    break;
                case 'R':
                    if (x < 10) {
                        if (!visited[x][y][1] && !visited[x + 1][y][3]) {
                            visited[x][y][1] = true;
                            visited[x + 1][y][3] = true;
                            answer++;
                        }
                        x += 1; // 이미 방문한 경로라도 좌표는 이동하기 떄문
                    }
                    break;
            }
        }

        return answer;
    }
}