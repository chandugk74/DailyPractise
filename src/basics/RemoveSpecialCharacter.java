package basics;

public class RemoveSpecialCharacter {
    public static void main(String[] args) {
        String s= "Chand$#@&^%a G K*&^";
        System.out.println(s.replaceAll("[^0-9,a-z,A-Z]", ""));
    }
}
