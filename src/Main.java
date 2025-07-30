
public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String[] a = new String[]{"a", "bb", "ccc"};

        for(String s : a) {
            sb.append(s).append(",");
        }

        sb.insert(0, "33333");
        sb.setCharAt(1, 'g');
        System.out.println(sb.toString());
        System.out.println(2);
    }
}
