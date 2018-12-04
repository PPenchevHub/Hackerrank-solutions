import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Anagrams {

    static boolean isAnagram(String a, String b) {
        if(a.length() != b.length())return false;

            a = a.toLowerCase();

            Map<Character, Integer> map = new HashMap<>();

        for(int i= 0; i < b.length();i++){

                char temp = b.charAt(i);
                if(!map.containsKey(temp)){
                    map.put(temp,1);
                }else {
                    Integer often = map.get(temp);
                    map.put(temp,++often);

                }
            }

            for(int i= 0; i < a.length();i++){

                char temp = a.charAt(i);
                if(!map.containsKey(temp)) return false;

                    Integer often = map.get(temp);

                    if(often == 0) return false;
                    else
                        map.put(temp,--often);
                }
            return true;

        }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }




}
