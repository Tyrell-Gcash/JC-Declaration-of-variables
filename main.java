 class main{
    public class InstanceVariables {
        
        int instanceBinary = 0b101101;
        int instanceOctal = 072;
        double instanceDouble = 1234.95;
        
    }
    public static void main(String[] args) {
        
        int localDemal = 100;
        int localHex = 0xFF;
        int localBinary = 0b1101;
        int localOctal = 014;
        long localLong = 10000000L;
        String localString = "Every step I take gets me closer to my goal.";
        
        System.out.println("Local Variables:");
        System.out.println("localDecimal: " + localDemal);
        System.out.println("localHex: " + localHex);
        System.out.println("localBinary: " + localBinary);
        System.out.println("localOctal: " + localOctal);
        System.out.println("localLong: " + localLong);
        System.out.println("localString: " + localString);

        InstanceVariables instance = new main().new InstanceVariables();
        System.out.println("Instance Variables:");
        System.out.println("instanceBinary: " + instance.instanceBinary);
        System.out.println("instanceOctal: " + instance.instanceOctal);
        System.out.println("instanceDouble: " + instance.instanceDouble);
    }
 }