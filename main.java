 class main{
    

    int instanceBinary = 0b101101;
    int instanceOctal = 072;
    double instanceDouble = 1234.95;

    static int staticHex = 0x1A2B;    
    static byte staticByte = 1;
    static String staticString = "Progress, not perfection.";

    public static void main(String[] args) {
        
        int localDemal = 100;
        int localHex = 0xFF;
        int localBinary = 0b1101;
        int localOctal = 014;
        long localLong = 10000000L;
        String localString = "Every step I take gets me closer to my goal.";
        
        System.out.println("\nLocal Variables:");
        System.out.println("localDecimal: " + localDemal);
        System.out.println("localHex: " + localHex);
        System.out.println("localBinary: " + localBinary);
        System.out.println("localOctal: " + localOctal);
        System.out.println("localLong: " + localLong);
        System.out.println("localString: " + localString);

        main instance = new main();
        System.out.println("\nInstance Variables:");
        System.out.println("instanceBinary: " + instance.instanceBinary);
        System.out.println("instanceOctal: " +  instance.instanceOctal);
        System.out.println("instanceDouble: " + instance.instanceDouble);

        System.out.println("\nStatic Variables:");
        System.out.println("staticHex: " + staticHex);
        System.out.println("staticByte: " + staticByte);
        System.out.println("staticString: " + staticString);
    }
 }