import processing.core.PApplet;

public class Part1 extends PApplet {

    @Override
    public void settings() {
        size(900, 900);
    }

    @Override
    public void draw() {
        int x = 900 / 3;
        int y = 900 / 3;

        fill(255, 255, 255);

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {

                int x1 = x + j * 50;
                int y1 = y + i * 50;

                if (mouseX >= x1 && mouseX <= x1 + 50 &&
                        mouseY >= y1 && mouseY <= y1 + 50) {
                    fill(255, 0, 0);
                } else {
                    fill(255);
                }

                square(x1, y1, 50);
            }
        }
    }

    public static void main(String[] args) {
        PApplet.main("Part1");
    }
}