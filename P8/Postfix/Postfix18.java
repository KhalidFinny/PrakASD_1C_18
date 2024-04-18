package P8.Postfix;

public class Postfix18 {
    int n;
    int top;
    char[] stack;

    public Postfix18(int total) {
        n = total;
        top = -1;
        stack = new char[n];
        push('(');
    }

    public void push (char c) {
        top++;
        stack[top] = c;
    }
    public char pop(){
        char item = stack[top];
        top--;
        return item;
    }
    public boolean isoperand(char c){
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') ||
                (c >= '0' && c <= '9');
    }
    public boolean isoperator(char c){
        return c == '^' || c == '%' || c == '/' || c == '*' || c == '-' || c == '+';
    }
    public int derajat(char c){
        switch (c) {
            case '^':
                return 3;
            case '%':
            case '/':
            case '*':
                return 2;
            case '-':
            case '+':
                return 1;
            default:
                return -1;

        }
    }
    public String konversi(String Q) {
        String p = "";
        char c;
        for (int i = 0; i < Q.length(); i++) {
            c = Q.charAt(i);
            if (isoperand(c)) {
                p = p + c;
            } else if (c == '(') {
                push(c);
            } else if (c == ')') {
                while (stack[top] != '(') {
                    p = p + pop();
                }
                pop(); // Menghapus '(' dari stack
            } else if (isoperator(c)) {
                while (top != -1 && derajat(stack[top]) >= derajat(c)) {
                    p = p + pop();
                }
                push(c);
            }
        }
        // Mengosongkan stack
        while (top != -1) {
            p = p + pop();
        }
        return p;
    }
}
