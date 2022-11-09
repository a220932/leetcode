class StockSpanner {

    List<Integer> list = new LinkedList<Integer>();
    List<Integer> comp = new LinkedList<Integer>();
    int count = -1;
    public StockSpanner() {
        
    }
    
    public int next(int price) {
        list.add(price);
          
        
        int i = count++;
        while (i >= 0 && price >= list.get(i)){
            i -= comp.get(i);
        }
        
        comp.add(count - i);
        return count - i;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
