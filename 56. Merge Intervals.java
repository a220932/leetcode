class Solution {
    class Inte{
        int[] a;
        static int count;
        Inte next;
        Inte(){
            count = 0;
            next = null;
        }
        private Inte(int[] arr){
            a = arr;
            next = null;
        }
        void union(int[] arr){
            Inte p = this;
            while (p.next != null){
                if (!(arr[1] < p.next.a[0] || p.next.a[1] < arr[0])){
                    arr[0] = Math.min(p.next.a[0], arr[0]);
                    arr[1] = Math.max(p.next.a[1], arr[1]);
                    p.next = p.next.next;
                    count--;
                }
                else
                    p = p.next;
            }
            p.next = new Inte(arr);
            count++;
            return;
        }
        int[][] toArray(){
            int[][] array = new int[count][2];
            Inte p = this;
            for (int i = 0; i < count; i++){
                p = p.next;
                array[i] = p.a;
            }
            return array;
        }
    }
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        Inte I = new Inte();
        for (int i = 0; i < n; i++)
            I.union(intervals[i]);
        return I.toArray();
    }
}
