public class Light
{
    private boolean on;
    private String colour;
    private int watts;

    public Light(String colour, int watts) {
        this.colour = colour;
        this.watts = watts;
    }

    public boolean isOn() {
        return on;
    }

    public void Off() {
        on = false;
        System.out.println("Lamp switched off.");
    }

    public void On() {
        on = true;
        System.out.println("Lamp switched on.");
    }
}
