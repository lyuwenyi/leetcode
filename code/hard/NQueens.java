package hard;

import java.util.ArrayList;
import java.util.List;

public class NQueens {
    List<List<String>> res;

    public List<List<String>> solveNQueens(int n) {
        res = new ArrayList<>();
        int[][] board = new int[n][];
        for (int i = 0; i < n; i++) {
            board[i] = new int[n];
        }
        chess(board, 0, n);
        return res;
    }

    public void chess(int[][] board, int index, int n) {
        if (index == n) {
            List<String> ans = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                StringBuilder row = new StringBuilder();
                for (int j = 0; j < n; j++) {
                    if (board[i][j] == 99) {
                        row.append('Q');
                    } else {
                        row.append('.');
                    }
                }
                ans.add(row.toString());
            }
            res.add(ans);
            return;
        }
        for (int i = 0; i < n; i++) {
            if (board[index][i] == 0) {
                board[index][i] = 99;
                for (int j = 0; j < n - index; j++) {
                    if (i - (j + 1) >= 0 && index + (j + 1) < n) {
                        board[index + j + 1][i - (j + 1)]++;
                    }
                    if (i + (j + 1) >= 0 && i + (j + 1) < n && index + j + 1 < n) {
                        board[index + j + 1][i + (j + 1)]++;
                    }
                    if (index + j + 1 < n) {
                        board[index + j + 1][i]++;
                    }
                }
                chess(board, index + 1, n);
                board[index][i] = 0;
                for (int j = 0; j < n - index; j++) {
                    if (i - (j + 1) >= 0 && index + (j + 1) < n) {
                        board[index + j + 1][i - (j + 1)]--;
                    }
                    if (i + (j + 1) >= 0 && i + (j + 1) < n && index + j + 1 < n) {
                        board[index + j + 1][i + (j + 1)]--;
                    }
                    if (index + j + 1 < n) {
                        board[index + j + 1][i]--;
                    }
                }
            }
        }
    }
}
