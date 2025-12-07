import java.util.Random;
import processing.core.PApplet;

public class Part2 extends PApplet {

    /// Полями Глобальными переменными
    public static float initValue;
    public static float deltaY; // null
    public static float y;
    public static float deltaY2 = 0.5f;
    public static float y2 = 0;
    public static float deltaX;
    public static float deltaAngle = PI/4;
    public static float angle = PI/4;

    public static float deltaAngle2 = PI/16;
    public static float angle2 = PI/8;

    public static float x;
    public static float[] arrOfX = new float[100];
    public static float[] arrOfY = new float[100];
    public static float[] arrOfDeltaY = new float[100];
    public static float[] arrOfRotation = new float[100];

    /// 1
    @Override
    public void settings() {
        size(800, 600);
    }

    /// 2
    @Override
    public void setup() {
        initValue = PI / 8;
        deltaY = 1;
        y = 0;
        deltaX = 10;
        x = 0;

        for (int i = 0; i < 100; i++) {
            arrOfX[i] = random(0,500);
            arrOfDeltaY[i] = 0;
            arrOfRotation[i] = random(-PI/8, PI/8);
        }
    }

    /// 3
    @Override
    public void draw() {
        background(255, 255, 255);
        //-----
        pushMatrix();
        translate(100,y);
        rotate(angle);
        //\
        // \
        line(0,0, 100, 0);
        popMatrix();

        //-----
        pushMatrix();
        translate(400, y2);
        rotate(angle2);
        stroke(125,125,125);
        strokeWeight(10);
        line(-25,0, 25, 0);
        line(0,-15, 0, 15);
        line(0, 0, 10, -10);

        popMatrix();

        y += deltaY;
        y2 += deltaY2;
        angle += deltaAngle;
        angle2 += 0.02f;

        if (y > height) {
            y = 0;
        }
        if (y2 > height) {
            y2 = 0;
        }
    }


    public static void main(String[] args) {
        PApplet.main("Part2");
    }
}