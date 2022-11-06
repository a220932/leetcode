class MyQueue {
    int s;
    int unit;
    public MyQueue() {
        s = 0;
        unit  = 0;
    }
    
    public void push(int x) {
        s *= 10;
        s += x;
        if (unit == 0)
            unit = 1;
        else
            unit *= 10;
    }
    
    public int pop() {
        int t = s / unit;
        s %= unit;
        unit /= 10;
        return t;
    }
    
    public int peek() {
        int t = s / unit;
        return t;
        
    }
    
    public boolean empty() {
        return (unit == 0);
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
