package P8.Barang;

public class stackkonversi18 {
    int size;
    int[] tumpukanbiner;
    int top;

    public stackkonversi18(){
        this.size = 32;
        tumpukanbiner = new int[size];
        top = -1;
    }
    public boolean isempty(){
        return top == -1;
    }
    public boolean isfull(){
        return top == size -1;
    }
    public void push(int data){
        if (isfull()){
            System.out.println("Stack penuh");
        } else {
            top++;
            tumpukanbiner[top] = data;
        }
    }
    public int pop(){
        if (isempty()){
            System.out.println("Stack kosong");
            return -1;
        } else {
            int data = tumpukanbiner[top];
            top--;
            return data;
        }
    }
}
