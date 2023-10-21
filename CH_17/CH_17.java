package CH_17;
class car {
    protected String owner;
    protected String id;
    public car(String own, String s) { //(a)
        owner = own;
        id = s;
    }
    public void show(){
        System.out.println("車主姓名" + owner);
        System.out.println("車牌號碼" + id); 
    }
}
class Ccolor extends car { //(b)
    private String color;
    public Ccolor(String own, String s, String c) {
        super(own, s); //(c)
        color = c;
    }
    public void show() { //(d)
        super.show();
        System.out.println("車身顏色" + color);
    }
}
public class CH_17 {
    public static void main(String[] args) {
        Ccolor c = new Ccolor("Riaan", "A1-2345", "Black");
        c.show();        
    }
}
