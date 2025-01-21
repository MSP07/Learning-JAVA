class Solution {
    public int minCost(int[][] grid) {
        int[][] deltas = {
            {0, 1}, {0, -1}, {1, 0}, {-1, 0}
        }; 
        int R = grid.length;
        int C = grid[0].length;
        int[] costGrid = new int[R * C];
        Arrays.fill(costGrid, Integer.MAX_VALUE);
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(0);
        costGrid[0] = 0;
        while (!deque.isEmpty()) {
            int front = deque.poll();
            int i = front >> 8;
            int j = front & 0xff;
            if (i == R - 1 && j == C - 1) {
                return costGrid[i * C + j];
            }
            int cost = costGrid[i * C + j];
            int dir = grid[i][j] - 1;
            for (int l = 0; l < deltas.length; l++) {
                int newCost = cost + 1 - (l == dir ? 1 : 0);
                int ii = i + deltas[l][0];
                int jj = j + deltas[l][1];
                int cIndex = ii * C + jj;
                if (ii < 0 || ii >= R || jj < 0 || jj >= C || costGrid[cIndex] <= newCost) {
                    continue;
                }
                costGrid[cIndex] = newCost;
                if (l == dir) {
                    deque.addFirst((ii << 8) | jj);
                } else {
                    deque.addLast((ii << 8) | jj);
                }
            }
        }
        return -1;
    }
}
