class Solution {
    public double getMinDistSum(int[][] positions) {
        double x = 0, y = 0;
        int n = positions.length;
        for (int[] p : positions) {
            x += p[0];
            y += p[1];
        }
        x /= n;
        y /= n;
        double step = 50.0;
        double minSum = distSum(x, y, positions);
        int[][] dirs = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        
        while (step > 1e-7) {
            boolean foundBetter = false;
            
            for (int[] d : dirs) {
                double nx = x + d[0] * step;
                double ny = y + d[1] * step;
                double curSum = distSum(nx, ny, positions);
                
                if (curSum < minSum) {
                    minSum = curSum;
                    x = nx;
                    y = ny;
                    foundBetter = true;
                    break;
                }
            }
            if (!foundBetter) {
                step /= 2.0;
            }
        }
        return minSum;
    }

    private double distSum(double x, double y, int[][] positions) {
        double sum = 0;
        for (int[] p : positions) {
            double dx = x - p[0];
            double dy = y - p[1];
            sum += Math.hypot(dx, dy);
        }
        return sum;
    }
}