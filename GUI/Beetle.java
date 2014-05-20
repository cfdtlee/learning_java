

class Beetle extends Insect {
    /*private int k = print("Beetle.k initialized");
    public Beetle() {
        System.out.println("k = " + k);
        System.out.println("j = " + j);
    }
    private static int x2 = print("static Beetle.x2 initialized");
    private int x22 = print("not_static Beetle.x2 initialized");
    static int print(String s) {
        System.out.println(s);
        return 47;
    }*/
    public static void main(String[] args){
        //System.out.println("Beetle constructor");
        Beetle b; //= new Beetle();
        //System.out.println("bbbb" == "bbbb");
        //String a = new String("aaa");
        //String b = new String("aaa");
        //System.out.println(a == b);
        //System.out.println(a.equals(b));
        b.j = 0;
        System.out.println(b.j);
        
    }
    
}

class Insect {
    int i = 9;
    int j;
    Insect() {
        print("i = " + i + ", j = " + j);
        j = 39;
        
    }
    //static int x1 = print("static Insect.x1 initialized");
    int x11 = print("not_static Insect.x11 initialized");
    static int print(String s) {
        System.out.println(s);
        return 47;
    }
}
//public class Beetle_main {

//}