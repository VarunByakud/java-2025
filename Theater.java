public class Theater {
    static int seatingCapacity = 200;
    static String screenSize = "Large";
    static String stageType = "Proscenium";
    static String acoustic = "High-grade";
    static String lighting = "LED Panels";
    static String soundSystem = "Dolby Surround";
    static String seatComfort = "Plush";
    static String bookingSystem = "Online + Offline";
    static int showsPerDay = 5;
    static int entryPoints = 3;
    static boolean acAvailable = true;
    static boolean concessionStand = true;
    static int emergencyExits = 4;
    static String type = "Multiplex";
    static String location = "Delhi";

    public static void main(String[] args) {
        System.out.println("Theater Properties:");
        System.out.println("Seating Capacity: " + seatingCapacity);
        System.out.println("Screen Size: " + screenSize);
        System.out.println("Stage Type: " + stageType);
        System.out.println("Acoustic Design: " + acoustic);
        System.out.println("Lighting System: " + lighting);
        System.out.println("Sound System: " + soundSystem);
        System.out.println("Seat Comfort: " + seatComfort);
        System.out.println("Booking System: " + bookingSystem);
        System.out.println("Shows Per Day: " + showsPerDay);
        System.out.println("Entry Points: " + entryPoints);
        System.out.println("AC Available: " + acAvailable);
        System.out.println("Concession Stand: " + concessionStand);
        System.out.println("Emergency Exits: " + emergencyExits);
        System.out.println("Type: " + type);
        System.out.println("Location: " + location);
    }
}
