public class CountTime {
    public static void main(String[] args) {
        long startTime1 =  System.currentTimeMillis();
        StringBuffer buffer = new StringBuffer("Hello Mother Father");
        for (int i = 0; i < 200000; i++) {
            buffer.append(" World is mine");
        }
        System.out.println("Time of String Buffer: " + (System.currentTimeMillis() - startTime1) + "ms" );

        long startTime2 = System.currentTimeMillis();
        StringBuilder builder = new StringBuilder("Hello Mother Father");
        for (int i = 0; i < 200000; i++) {
            builder.append(" World is mine");
        }
        System.out.println("Time of String Builder: " + (System.currentTimeMillis() - startTime2) + "ms");
    }
}
