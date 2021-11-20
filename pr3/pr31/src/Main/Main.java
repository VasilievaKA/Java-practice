package Main;

public class Main {

    public static void main(String[] args) {
        // Создаем экземпляр класса MovablePoint
        MovablePoint point = new MovablePoint(0, 0, 1, 1);
        System.out.println(point);
        // Двигаем point вверх и влево
        point.moveUp();
        point.moveLeft();
        System.out.println(point);
        // Создаем экземпляр класса MovableCircle
        MovableCircle circle = new MovableCircle(0, 0, 1, 1, 2);
        System.out.println(circle);
        // Двигаем circle вниз и вправо
        circle.moveDown();
        circle.moveRight();
        System.out.println(circle);
        // Создаем экземпляр класса MovableRectangle
        MovableRectangle rectangle = new MovableRectangle(0, 0, 1, 1, 1,
                1);
        System.out.println(rectangle);
        // Двигаем rectangle вверх и влево
        rectangle.moveUp();
        rectangle.moveLeft();
        System.out.println(rectangle);
    }
}
