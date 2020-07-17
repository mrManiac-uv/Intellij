public class Bed
{
    private int height, quilt, pillows;
    private String style, size, bedsheet;

    public Bed(int height, int quilt, int pillows, String style, String size, String bedsheet) {
        this.height = height;
        this.quilt = quilt;
        this.pillows = pillows;
        this.style = style;
        this.size = size;
        this.bedsheet = bedsheet;
    }

    public void make() {
        System.out.println("Bed made");
    }

    public int getHeight() {
        return height;
    }

    public int getQuilt() {
        return quilt;
    }

    public int getPillows() {
        return pillows;
    }

    public String getStyle() {
        return style;
    }

    public String getSize() {
        return size;
    }

    public String getBedsheet() {
        return bedsheet;
    }
}
