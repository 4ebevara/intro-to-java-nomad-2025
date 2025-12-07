import processing.core.PApplet;

public class Part2 extends PApplet {

    int maxCount = 100;
    int currentCount = 0;

    float[] x = new float[maxCount];
    float[] y = new float[maxCount];
    float[] speed = new float[maxCount];
    float[] rotation = new float[maxCount];
    float[] rotationSpeed = new float[maxCount];
    float[] size = new float[maxCount];

    int lastSpawnTime = 0;
    int spawnInterval = 150;

    @Override
    public void settings() {
        size(800, 600);
    }

    @Override
    public void setup() {
    }

    @Override
    public void draw() {
        background(0);

        stroke(255);
        strokeWeight(2);
        noFill();

        // постепенно создание снежков, что бы сразу не было много
        if (currentCount < maxCount && millis() - lastSpawnTime > spawnInterval) {
            spawnSnowflake(currentCount);
            currentCount++;
            lastSpawnTime = millis();
        }

        // снежинка
        for (int i = 0; i < currentCount; i++) {

            pushMatrix();
            translate(x[i], y[i]);
            rotate(rotation[i]);

            drawSnowflake(size[i]);

            popMatrix();

            // Падение
            y[i] += speed[i];
            rotation[i] += rotationSpeed[i];
            x[i] += sin(rotation[i]) * 0.5;

            // если снежинка упала заново падает
            if (y[i] > height) {
                spawnSnowflake(i);
                y[i] = 0;
            }
        }
    }
    // создание сснежинки
    void spawnSnowflake(int i) {
        x[i] = random(width);
        y[i] = random(-200, -20);          // что бы появлялись выше жкрана
        speed[i] = random(1, 3);
        rotation[i] = random(0, TWO_PI);
        rotationSpeed[i] = random(-0.02f, 0.02f);
        size[i] = random(10, 25);
    }

    // рисую снежинку
    void drawSnowflake(float s) {
        for (int i = 0; i < 6; i++) {
            line(0, 0, s, 0);
            line(s * 0.6f, 0, s * 0.8f, s * 0.2f);
            line(s * 0.6f, 0, s * 0.8f, -s * 0.2f);
            rotate(PI / 3);
        }
    }

    public static void main(String[] args) {
        PApplet.main("Part2");
    }
}
