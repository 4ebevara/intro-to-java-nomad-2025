import javax.swing.JOptionPane;
import processing.core.PApplet;

public class Part1 extends PApplet {

    int x = 0;
    int y = 0;

    int height;
    int width;

    // 1
    @Override
    public void settings() {
        size(900, 900);
    }

    // 2
    @Override
    public void setup() {
        try {
            String v1 =  JOptionPane.showInputDialog(null, "Вводи ширину доски:");
            String v2 =  JOptionPane.showInputDialog(null, "Вводи высоту доски:");
            //"123" -> 123
            width = Integer.parseInt(v1);
            height = Integer.parseInt(v2);
        }catch (Exception e) {
            String v1 =  JOptionPane.showInputDialog(null, "Вводи ширину доски:");
            String v2 =  JOptionPane.showInputDialog(null, "Вводи высоту доски:");
            //"123" -> 123
            width = Integer.parseInt(v1);
            height = Integer.parseInt(v2);
        }

    }

    // 3
    @Override
    public void draw() {
        x = 900 / 3;
        y = 900 / 3;
        fill(255, 255, 255);
        //  begin
        //  process -> conditions
        //  finish
        //  process is not finished yet, it works after completion again and again
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                // x = 300
                int x1 = x + j * 50;
                // j = 1 => x1 = 350
                int y1 = y + i * 50;
                // i = 0 => y1 = 300
                fill(255, 255, 255);
                // j = 0 => x1 = 300, y1 = 300
                // j = 1 => x1 = 350, y1 = 300
                square(x1, y1, 50);

                if (mouseX >= x1 && mouseY >= y1 && mouseX <= x1 + 50 && mouseY <= y1 + 50) {
                    fill(255, 0, 0);
                    square(x1, y1, 50);
                }
            }
        }
    }


    @Override
    public void keyPressed() {
        if (key == ' ') {
            System.out.println("You clicked on space");
        }
    }

    public static void main(String[] args) {
        PApplet.main("Part1");
    }
}