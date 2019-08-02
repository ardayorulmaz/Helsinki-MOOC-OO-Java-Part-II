
public class Main {

    public static void main(String[] args) {
        int[] t = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(build(t));
    }

    public static String build(int[] t) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < t.length; i++) {
            if ((i + 1) % 4 == 0 && i != (t.length - 1)) {
                builder.append(" ");
                builder.append(t[i]);
                builder.append(",");
                builder.append("\n");
            } else if (i == t.length - 1) {
                builder.append(" ");
                builder.append(t[i]);
                builder.append("\n");
            } else {

                builder.append(" ");
                builder.append(t[i]);
                builder.append(",");
            }

        }

        return " {\n" + builder + " }";
    }
}
