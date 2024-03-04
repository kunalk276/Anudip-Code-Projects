package kunal;

public class BoxingUnboxingAllObjects {

	public static void main(String[] args) {

        // Boxing

        byte b = 11;               // primitive data type
        Byte B = new Byte(b);      // wrapping primitive type data into Byte object

        short s = 50;              // primitive data type
        Short S = new Short(s);    // wrapping primitive type data into Short object

        int i = 30;                // primitive data type
        Integer I = new Integer(i);// wrapping primitive type data into Integer object

        long l = 70L;              // primitive data type
        Long L = new Long(l);      // wrapping primitive type data into Long object

        float f = 90.0f;           // primitive data type
        Float F = new Float(f);    // wrapping primitive type data into Float object

        double d = 67.6;           // primitive data type
        Double D = new Double(d);  // wrapping primitive type data into Double object

        char c = 'K';              // primitive data type
        Character C = new Character(c); // wrapping primitive type data into Character object


        // Auto-Boxing

        byte b1 = 10;              // primitive data type
        Byte B1 = b1;              // auto-boxing - wrapping primitive type data into Byte object

        short s1 = 50;             // primitive data type
        Short S1 = s1;             // auto-boxing - wrapping primitive type data into Short object

        int i1 = 30;               // primitive data type
        Integer I1 = i1;           // auto-boxing - wrapping primitive type data into Integer object

        long l1 = 70L;             // primitive data type
        Long L1 = l1;              // auto-boxing - wrapping primitive type data into Long object

        float f1 = 90.0f;          // primitive data type
        Float F1 = f1;             // auto-boxing - wrapping primitive type data into Float object

        double d1 = 67.6;          // primitive data type
        Double D1 = d1;            // auto-boxing - wrapping primitive type data into Double object

        char c1 = 'K';             // primitive data type
        Character C1 = c1;         // auto-boxing - wrapping primitive type data into Character object


        // Unboxing

        Byte B2 = new Byte((byte) 11);  // Object type
        byte b2 = B2.byteValue();        // Unwrapped Byte object to byte data

        Short S2 = new Short((short) 50);    // Object type
        short s2 = S2.shortValue();          // Unwrapped Short object to short data

        Integer I2 = new Integer(30);    // Object type
        int i2 = I2.intValue();           // Unwrapped Integer object to int data

        Long L2 = new Long(70L);         // Object type
        long l2 = L2.longValue();        // Unwrapped Long object to long data

        Float F2 = new Float(90.0f);     // Object type
        float f2 = F2.floatValue();      // Unwrapped Float object to float data

        Double D2 = new Double(67.6);    // Object type
        double d2 = D2.doubleValue();    // Unwrapped Double object to double data

        Character C2 = new Character('K');  // Object type
        char c2 = C2.charValue();            // Unwrapped Character object to char data


        // Auto-Unboxing

        Byte B3 = new Byte((byte) 11);  // Object type
        byte b3 = B3;                    // auto-unboxing

        Short S3 = new Short((short) 50);    // Object type
        short s3 = S3;                        // auto-unboxing

        Integer I3 = new Integer(30);    // Object type
        int i3 = I3;                      // auto-unboxing

        Long L3 = new Long(70L);         // Object type
        long l3 = L3;                    // auto-unboxing

        Float F3 = new Float(90.0f);     // Object type
        float f3 = F3;                    // auto-unboxing

        Double D3 = new Double(67.6);    // Object type
        double d3 = D3;                   // auto-unboxing

        Character C3 = new Character('K');  // Object type
        char c3 = C3;                        // auto-unboxing

       
        // Print all statements 

        System.out.println("Byte value: " + b);
        System.out.println("Short value: " + s);
        System.out.println("Integer value: " + i);
        System.out.println("Long value: " + l);
        System.out.println("Float value: " + f);
        System.out.println("Double value: " + d);
        System.out.println("Character value: " + c);
    }
}

