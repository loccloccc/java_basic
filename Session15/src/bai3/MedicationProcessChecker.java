package bai3;

import java.util.Stack;

public class MedicationProcessChecker {
    static Stack<String> stack = new Stack<>();
    static void main(String[] args) {
        String[] action = {"PUSH", "PUSH", "POP", "POP"};
        boolean check = checkProcess(action);
        reset();

    }
    public static boolean checkProcess(String[] actions){
        for (String x : actions){
            if (x.equals("PUSH")){
                stack.push(x);
            } else if (x.equals("POP")) {
                if (stack.isEmpty()) return false;
                else return true;
            }
        }
        return stack.isEmpty();
    }
    public static void reset(){
        stack.clear();
    }
}
