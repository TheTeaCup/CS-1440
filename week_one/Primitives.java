public class Primitives {
    public static void main(String[] args) {
        // Integer data types
        byte bt;    // 1 byte  = 2^8 = 256 = -128 to 127
        short s;    // 2 bytes = 2^16 = -32,000 to 32,000
        int i;      // 4 bytes = 2^32 
        long l;     // 8 bytes = 2^64 

        // bt = 200;
        bt = 5;
        s = 2;
        i = 10000; // also can do 10_000
        l = 40000000;

        System.out.println(bt + s);
        System.out.println(bt - s);
        System.out.println(bt * s);
        System.out.println(bt / s);
        System.out.println(bt % s);


        // Floating-point data types
        float f;    // 4 bytes, 7-digit precision
        double db;  // 8 bytes, 15-digit precision

        f = 1.5f;  // f is needed to refer to as float
        db = 5.0;

        double sci = 1e9; // 1 billion
        System.out.println(sci);


        boolean bl = true;
        bl = false;
        // bl = 0;

        char c; // 2 bytes
        c = 'a';
        char c2 = 97;

        System.out.println(c);
        System.out.println(c2);

        char c3 = '\n';
        System.out.println("Hello" + c + c3);
        System.out.println("Goodbye");

    }
}