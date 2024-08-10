import java.util.PriorityQueue;

public class NearbyCars {
    static class Point implements Comparable<Point> {
        int x;
        int y;
        int disSq;
        int idx;

        public Point(int x, int y, int idx) {
            this.x = x;
            this.y = y;
            this.idx = idx;
            this.disSq = x * x + y * y;
        }

        @Override
        public int compareTo(Point p1) {
            return this.disSq - p1.disSq;
        }
    }

    public static void nearbyKCars(int points[][], int n, int k) {
        PriorityQueue<Point> pq = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            pq.add(new Point(points[i][0], points[i][1], i));
        }
        int count = 0;
        while (!pq.isEmpty() && count < k) {
            count++;
            System.out.println(pq.peek().idx);
            pq.remove();
        }
    }

    public static void main(String[] args) {
        int points[][] = { { 3, 3 }, { 5, -1 }, { -2, 4 } };
        int k = 2;
        nearbyKCars(points, points.length, k);
    }
} 
