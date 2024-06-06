package P15.graph;

public class node18 {
    int data;
    node18 prev, next;
    int jarak;

    node18(node18 prev, int data, int jarak, node18 next){
        this.prev = prev;
        this.data = data;
        this.jarak = jarak;
        this.next = next;
    }

}
