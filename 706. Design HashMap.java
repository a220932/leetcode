class MyHashMap {
    int index;
    int val;
    MyHashMap next; 
    public MyHashMap() {
        index = -1;
        val = -1;
        next = null;
    }
    private MyHashMap(int k, int v, MyHashMap n){
        index = k;
        val = v;
        next = n;
    }
    public void put(int key, int value) {
        remove(key);
        MyHashMap n = new MyHashMap(key, value, next);
        next = n;
        
    }
    
    public int get(int key) {
        if (index == key)
            return val;
        if (next == null)
            return -1;
        else
            return next.get(key);
    }
    
    public void remove(int key) {
        if (next == null)
            return;
        if (next.index == key){
            next = next.next;
            return;
        }   
        else{
            next.remove(key);
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
