public class TV
{
    private String type, channel;
    private double size;

    public TV(String type, String channel, double size) {
        this.type = type;
        this.channel = channel;
        this.size = size;
    }

    public void on() {
        System.out.println("Tv is ON.");
    }

    public void off() {
        System.out.println("Tv is OFF.");
    }

    public String getType() {
        return type;
    }

    public String getChannel() {
        return channel;
    }

    public double getSize() {
        return size;
    }
}
