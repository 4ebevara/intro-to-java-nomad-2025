import processing.core.PApplet;

public class Part2 extends PApplet {

    int maxCount = 150;

    float[] x = new float[maxCount];
    float[] y = new float[maxCount];
    float[] speed = new float[maxCount];
    float[] rotation = new float[maxCount];
    float[] rotationSpeed = new float[maxCount];
    float[] size = new float[maxCount];
    float[] windEffect = new float[maxCount];

    @Override
    public void settings() {
        size(1200, 800);
    }

    @Override
    public void setup() {
        for (int i = 0; i < maxCount; i++) {
            spawnSnowflake(i);
            y[i] = random(-200, -10);
        }
    }

    @Override
    public void draw() {
        background(0);

        stroke(255);
        strokeWeight(2);
        noFill();

        // обновление и рисование снежинок
        for (int i = 0; i < maxCount; i++) {

            pushMatrix();
            translate(x[i], y[i]);
            rotate(rotation[i]);

            drawSnowflake(size[i]);

            popMatrix();

            // падение с силой ветра
            y[i] += speed[i];
            x[i] += windEffect[i];
            rotation[i] += rotationSpeed[i];

            // если снежинка упала падает обратно
            if (y[i] > height) {
                spawnSnowflake(i);
                y[i] = random(-200, -10);
            }
        }
    }

    // создание снежинки
    void spawnSnowflake(int i) {
        x[i] = random(width);
        speed[i] = random(1, 3);
        rotation[i] = random(0, TWO_PI);
        rotationSpeed[i] = random(-0.02f, 0.02f);
        size[i] = random(10, 25);
        windEffect[i] = random(-0.5f, 0.5f);
    }

    // рисую снежинку
    void drawSnowflake(float s) {
        for (int i = 0; i < 6; i++) {
            line(0, 0, s, 0);
            rotate(PI / 3);
        }
    }

    public static void main(String[] args) {
        PApplet.main("Part2");
    }
}
