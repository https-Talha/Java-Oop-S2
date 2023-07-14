class X{
    int i;
    int j;
}
class B extends X{
    int k;
    B(int x){
        k=x;
    }
    void show(){
        System.out.println(i+" "+j+" "+k+" " );
    }
}

class A{
    public static void main(String[] args) {    
        B obj = new B(100);
        obj.show();
    }
}