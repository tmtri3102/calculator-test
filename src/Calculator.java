public class Calculator {
//    public int add(int x, int y) {
//        return x + y;
//    }
//    public int add(int x, int y) {
//        if (x / 2 + y / 2 >= Integer.MAX_VALUE / 2) {
//            throw new RuntimeException("out of range exception");
//        }
//        return x + y;
//    }
//
//    public int add(int x, int y) {
//        throw new UnsupportedOperationException("not support operator");
//    }
//    public int add(int x, int y) {
//        if (x / 2 + y / 2 >= Integer.MAX_VALUE / 2) {
//            throw new RuntimeException("out of range exception");
//        }
//
//        if (x / 2 + y / 2 <= Integer.MIN_VALUE / 2) {
//            throw new RuntimeException("out of range exception");
//        }
//
//        return x + y;
//    }

    public static int add(int first, int second) {
//        throw new UnsupportedOperationException();
        return first + second;
    }


    public static int sub(int first, int second) {
        return first - second;
    }
}