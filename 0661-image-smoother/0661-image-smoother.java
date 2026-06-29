class Solution {
    public int[][] imageSmoother(int[][] img) {

        int n = img.length;
        int m = img[0].length;
        int[] ai = { 0, 1, 1, -1, -1, 0, +1, -1 };
        int[] aj = { +1, 0, +1, 0, -1, -1, -1, +1 };
        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int sum = img[i][j];
                int count = 1;
                for (int k = 0; k < 8; k++) {
                    int arri = i + ai[k];
                    int arrj = j + aj[k];
                    if (arri < n && arri >= 0 && arrj < m && arrj >= 0) {
                        sum += img[arri][arrj];
                        count++;
                    }

                }
                arr[i][j] = sum / count;
            }
        }
        return arr;
    }
}