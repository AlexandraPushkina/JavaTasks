package Homework1.src;
public class task_1 {

    public byte byteVar = 10;
    public short shortVar = 2000;
    public int intVar = 1000000;
    public long longVar = 9223372036854775807L;
    public float floatVar = 3.14f;
    public double doubleVar = 3.14159265359;
    public char charVar = 'A';
    public boolean booleanVar = true;
    public String stringVar = "Hello, world!";

    public void printDataTypes() {
        System.out.printf("byte = %d, short = %d, int = %d, long = %d, " +
                        "float = %.2f, double = %.10f, char = %c, " +
                        "boolean = %b, String = %s%n",
                byteVar, shortVar, intVar, longVar, floatVar, doubleVar, charVar, booleanVar, stringVar);
    }
}

