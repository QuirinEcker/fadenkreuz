import processing.core.PApplet;

public class Ecker_Fadenkreuz extends PApplet {

    public static void main(String[] args) {
        PApplet.main("Ecker_Fadenkreuz");
    }

    public void settings() {
        size(500,500);
    }

    public void setup() {
        background(255,255,255,255);
    }

    public void draw() {
        background(255,255,255,255);
        line(mouseX, 0, mouseX, 500);
        line(0,mouseY,500,mouseY);
    }
}
