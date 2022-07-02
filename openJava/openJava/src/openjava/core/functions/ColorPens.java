package openjava.core.functions;

public class ColorPens {
    String color;

    public ColorPens(String color) {
        this.color = color;
    }

    void draw(){
        System.out.println(color);

    }

    public static void main(String[] args) {
        ColorPens red = new ColorPens("red");
        ColorPens green = new ColorPens("Green");
        red.draw();
        green.draw();
    }
}
