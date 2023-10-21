package CH_06;
class CTriangle{
    protected int base;
    protected int height;

    protected void show(){
        System.out.println(base + " " + height);
    }
}
class cdata extends CTriangle{ //(a)
    public cdata(int base, int height){
        this.base = base;
        this.height = height;
    }
    public void area(){ //(b)
        super.show();
        double area1 = base * height * 0.5;
        System.out.println(area1);
    }
}
public class CH_06 {
    public static void main(String[] args) { //(c)
        cdata obj = new cdata(3, 8);
        obj.area();
    }
}
