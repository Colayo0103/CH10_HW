package CH_03;
class caaa{
    public int num1, num2;
    public caaa(){ //父類別 (a)
        num1 = 1;
        num2 = 1;
    }
    public caaa(int a, int b){ // (b)
        num1 = a;
        num2 = b;
    }    
}
class cbbb extends caaa{ //子類別
    public cbbb(int a, int b){ //(c)
        super(a, b);
    }
    public void show(){
        System.out.println(num1);
        System.out.println(num2);
    }
}
public class CH_03 {
    public static void main(String[] args) {//(d)
        caaa a1 = new caaa();
        System.out.println(a1.num1);
        System.out.println(a1.num2);
        caaa a2 = new caaa(5, 10);
        System.out.println(a2.num1);
        System.out.println(a2.num2);
        cbbb b = new cbbb(3, 7);
        System.out.println(b.num1);
        System.out.println(b.num2);
    }
}