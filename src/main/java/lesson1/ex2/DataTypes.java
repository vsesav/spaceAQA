package lesson1.ex2;

public class DataTypes {

    //Primitive
    private byte byteType = 127;
    private short shortType = 32_767;
    private int intType = 2_147_483_647;
    private long longType = 9_223_372_036_854_775_807L;

    private float  floatType = 3.4E+8f;
    private double doubleType = 1.7E+38;

    private char charType = '$';

    private boolean booleanType = true;

    //Reference
    String referenceType = "Reference types hold references to objects and provide a means to access those objects stored somewhere in memory";
    @Override
    public  String toString() {
        return  "byte: " + byteType + "\n" +
                "short: " + shortType + "\n" +
                "int: " + intType + "\n" +
                "long: " + longType + "\n" +
                "float: " + floatType + "\n" +
                "double: " + doubleType + "\n" +
                "char: " + charType + "\n" +
                "boolean: " + booleanType + "\n\n" +
                "String (Reference Data Type): " + referenceType;

    }
}
