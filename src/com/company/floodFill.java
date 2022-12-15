class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int m = image.length;
        int n = image[0].length;

        if(image[sr][sc] == color)
            return image;

        fill(image, sr, sc, m, n, color, image[sr][sc]);
        return image;
    }

    void fill(int[][] arr, int x, int y, int m, int n, int color, int pColor)
    {
        if(x < 0 || x >= m  || y < 0 || y >= n || arr[x][y] != pColor)
            return;

        arr[x][y] = color;

        fill(arr, x-1, y, m, n, color, pColor);
        fill(arr, x+1, y, m, n, color, pColor);
        fill(arr, x, y+1, m, n, color, pColor);
        fill(arr, x, y-1, m, n, color, pColor);
    }
}

