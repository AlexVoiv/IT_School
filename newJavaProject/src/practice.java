import java.awt.*;
import java.sql.SQLOutput;
import java.util.Date;

public class practice {
    public static void main(String[] args) {
        Point point1 = new Point (1, 1);
        Point point2 = point1;
        point1.x = 2;
        System.out.println(point2);
        String message = "Hello World" + "!!";
        System.out.println(message.replace("!", "*"));
    }
}

