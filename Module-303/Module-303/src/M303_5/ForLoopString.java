package M303_5;

public class ForLoopString {
    public static void main(String[] args) {

        String characters = "abcdefg";

        for( int pos = 0; pos < characters.length(); pos++ ) {
            //using method charAt
            char value = characters.charAt(pos);
            System.out.println("character at position " + pos + " = " + value);
        }

        char one = '1';
        Character c = Character.valueOf(one);
        int x = Integer.parseInt(c.toString());
    }
}
