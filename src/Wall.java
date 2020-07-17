public class Wall
{
    private double width, height;
    private String colour, design;

    public Wall(double width, double height, String colour, String design) {
        this.width = width;
        this.height = height;
        this.colour = colour;
        this.design = design;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public String getColour() {
        return colour;
    }

    public String getDesign() {
        return design;
    }
}
