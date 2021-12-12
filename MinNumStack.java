package com.edyodaassg.DsaAssgn;
import java.util.Stack;
public class MinNumStack {
    private Stack<Integer> st;
    private Stack<Integer> minSt;
    public MinNumStack() {
        st = new Stack<>();
        minSt = new Stack<>();
    }
    public void push(int data) {
        int min = data;
        if(!minSt.isEmpty() && min > minSt.peek()) {
            min = minSt.peek();
        }
        st.push(data);
        minSt.push(min);
    }
    public void pop() {
        st.pop();
        minSt.pop();
    }
    public int top() {
        return st.peek();
    }
    public int getMin() {
        return minSt.peek();
    }
    public static void main(String[] args) {
        MinNumStack minElem = new MinNumStack();
        minElem.push(4);
        minElem.push(5);
        minElem.push(8);
        minElem.push(1);
        System.out.println(" Minimum Element from Stack " + minElem.getMin());
    }
}
