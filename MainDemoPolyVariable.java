class A{
    int i;
    int j;

}
class B extends A{
    int k;
    int sum(){
        return i+j+k;

    }
}



public class MainDemoPolyVariable {
    public static void main(String[] args) {
        A a;
        B b = new B();
        
        b.i=10;
		b.j=20;
		b.k=30;
        System.out.println("b.i:"+b.i+"b.j:"+b.j+"b.k:"+b.k);
        System.out.println(b.sum());
        System.out.println(a.sum());  
  
    }  


}
