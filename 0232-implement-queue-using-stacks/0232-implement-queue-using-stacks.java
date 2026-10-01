import java.util.Stack;

class MyQueue {
    Stack<Integer> S1;
    Stack<Integer> S2;

    public MyQueue() {
        S1 = new Stack<>();
        S2 = new Stack<>();
    }

    public void push(int x) {
        S1.push(x);
    }

    public int pop() {
        shiftStack();
        return S2.pop(); 
    }

    public int peek() {
        shiftStack();
        return S2.peek();
    }

    public boolean empty() {
        return S1.isEmpty() && S2.isEmpty();
    }

    private void shiftStack() {
        if (S2.isEmpty()) {
            while (!S1.isEmpty()) {
                S2.push(S1.pop());
            }
        }
    }
}
