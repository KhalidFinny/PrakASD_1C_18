package P2.dragonGame;

public class dragonmain18 {
    public static void main(String[] args) {

        dragon18 dg1 = new dragon18();
        dg1.x = 200;
        dg1.y = 150;
        dg1.width = 200;
        dg1.height = 300;

        dg1.moveLeft();
        dg1.moveRight();
        dg1.moveUp();
        dg1.moveDown();
        dg1.movePosition();
        dg1.detectCollision(200, 2);

    }
}
