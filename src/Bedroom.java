public class Bedroom
{
    private Wall frontWall;
    private Wall leftWall;
    private Wall rightWall;
    private Wall backWall;
    private Wall ceiling;
    private Bed bed;
    private Light lamp;
    private TV tv;

    public Bedroom(Wall frontWall, Wall leftWall, Wall rightWall, Wall backWall, Wall ceiling, Bed bed, Light lamp, TV tv) {
        this.frontWall = frontWall;
        this.leftWall = leftWall;
        this.rightWall = rightWall;
        this.backWall = backWall;
        this.ceiling = ceiling;
        this.bed = bed;
        this.lamp = lamp;
        this.tv = tv;
    }

    public void wakeUp() {
        System.out.println("Goodmorning");
        tv.on();
        if (lamp.isOn())
            lamp.Off();
        else
            lamp.On();
    }
    public void sleep() {
        tv.off();
        bed.make();
        lamp.Off();
        System.out.println("Goodnight.");
    }

    public Wall getFrontWall() {
        return frontWall;
    }

    public Wall getLeftWall() {
        return leftWall;
    }

    public Wall getRightWall() {
        return rightWall;
    }

    public Wall getBackWall() {
        return backWall;
    }

    public Wall getCeiling() {
        return ceiling;
    }

    public Bed getBed() {
        return bed;
    }

    public Light getLamp() {
        return lamp;
    }

    public TV getTv() {
        return tv;
    }

    public void read() {
        lamp.On();
        tv.off();
        System.out.println("Happy reading!");
}
}
