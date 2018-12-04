public class StringsIntroduction {

    public static void main(String[] args) {

        String a = "hello";
        String b = "java";
        System.out.println(a.length()+b.length());


        char f =  a.charAt(0);
        if(a.charAt(0) > b.charAt(0)) System.out.println("yes");
        else System.out.println("no");
        String n =  a.substring(0,1).toUpperCase() + a.substring(1,a.length()) +" " + b.substring(0,1).toUpperCase() + b.substring(1,b.length());
        System.out.println(n);

    }

}
