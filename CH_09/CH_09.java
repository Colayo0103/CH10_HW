package CH_09;
class caaa {
    private int num; 
    public caaa(int n) { 
        num = n;
    }
    public int get() {
        return num;
    }
    public void display() { //(a)
        System.out.println("printed from caaa class"); 
    }
}
class cbbb extends caaa {
    public cbbb(int n) { 
        super(n); 
    }
    public void show() {
        System.out.println("num=" + get());
    }
    public void display() { //(b)
        System.out.println("printed from cbbb class"); 
    }
}
public class CH_09 {
    public static void main(String[] args) {
        cbbb b = new cbbb(2);
        b.show();
        caaa a = new caaa(3); //(c) 父類別會被呼叫
        a.display();
    }
}