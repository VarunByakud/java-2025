public class Projector {
    static String brand = "Epson";
    static String model = "X123HD";
    static int brightnessLumens = 3200;
    static String resolution = "1920x1080";
    static String isPortable = "YEs";
    static int hdmiPorts = 2;
    static String lampType ;
    static int lampLifeHours ;
    static String wirelessSupport ;
    static double weightKg ;
    static String throwRatio ;
    static String keystoneCorrection ;
    static String speakerBuiltIn ;
    static String supportedFormats;
    static String aspectRatio;

    public static void main(String[] args) {
	 String lampType = "LED";
     int lampLifeHours = 10000;
     String wirelessSupport = "Yes it will support";
     double weightKg = 2.5;
     String throwRatio = "1.3:1";
     String keystoneCorrection = "No";
     String speakerBuiltIn = "Yes";
     String supportedFormats = "MP4, AVI, MKV";
     String aspectRatio = "16:9";
		int price = 5000;
		System.out.println("the price is " + price);
		
		int price = 3999;
		System.out.println("the offer price is" + price);
		
		
		
		
		System.out.println("main started");
        System.out.println("Projector Properties:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Brightness (Lumens): " + brightnessLumens);
        System.out.println("Resolution: " + resolution);
        System.out.println("Is Portable: " + isPortable);
        System.out.println("HDMI Ports: " + hdmiPorts);
        System.out.println("Lamp Type: " + lampType);
        System.out.println("Lamp Life (Hours): " + lampLifeHours);
        System.out.println("Wireless Support: " + wirelessSupport);
        System.out.println("Weight (Kg): " + weightKg);
        System.out.println("Throw Ratio: " + throwRatio);
        System.out.println("Keystone Correction: " + keystoneCorrection);
        System.out.println("Built-in Speaker: " + speakerBuiltIn);
        System.out.println("Supported Formats: " + supportedFormats);
        System.out.println("Aspect Ratio: " + aspectRatio);
		System.out.println("main Ended");
    }
}
