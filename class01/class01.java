package CH_01;
//hw10_1, 繼承的練習
class caaa{
    public int num1, num2;
    public caaa(){ //父類別
        num1 = 0;
        num2 = 0;
    }
}
class cbbb extends caaa{ //子類別
    public void set_num(int n1, int n2) {
        num1 = n1;
        num2 = n2;
    }
    public void show(){
        System.out.println(num1);
        System.out.println(num2);
    }
}
public class CH_01 {
    public static void main(String[] args) {
        cbbb bb = new cbbb();
        bb.set_num(5, 10);
        bb.show();
    }
}