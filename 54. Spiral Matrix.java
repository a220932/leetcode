class Solution {
    class Point{
        int x, y, dx, dy;
        int hand;
        Point(){
            x = 0;
            y = 0;
            dx = 0;
            dy = 1;
            hand = 0;
        }
        public void turn(){
            int t = -dx;
            dx = dy;
            dy = t;
            hand = (hand + 1) % 4;
        }
        public void next(){
            x += dx;
            y += dy;
        }
    }
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new LinkedList<Integer>();
        
        int m = matrix.length;
        int n = matrix[0].length;
        int count = m * n;
        
        int a = 0, b = 0, c = m - 1, d = n - 1;
        
        Point p = new Point();
        while (count-- != 0){
            list.add(matrix[p.x][p.y]);
                      
            if ((p.hand == 0)&&(p.y == d)){
                a++;
                p.turn();
            }
            else if ((p.hand == 1)&&(p.x == c)){
                d--;
                p.turn();
            }
            else if ((p.hand == 2)&&(p.y == b)){
                c--;
                p.turn();
            }
            else if ((p.hand == 3)&&(p.x == a)){
                b++;
                p.turn();
            }
            
            p.next();
        }    
        return list;
    }
}
