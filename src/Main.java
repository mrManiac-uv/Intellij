public class Main
{
    public static void main(String[] args) {

        Wall front = new Wall(5.5, 5.0, "white", "matt");
        Wall back = new Wall(5.5, 5.0, "white", "matt");
        Wall left = new Wall(7.0, 5.0, "white", "matt");
        Wall right = new Wall(7.0, 5.0, "white", "matt");
        Wall ceiling = new Wall(7.0, 5.5, "white", "false ceiling");
        Bed bed = new Bed(2, 1, 2, "Modern", "King", "Blue");
        Light lamp = new Light("yellow", 10);
        TV tv = new TV("Smart", "505", 55);
        Bedroom room=new Bedroom(front, left, right, back, ceiling, bed, lamp, tv);
        room.read();
        room.sleep();
        room.wakeUp();
        System.out.println("The Tv is on channel "+room.getTv().getChannel());
    }
}
