class Hello{
void m1() {
System.out.println("I am m1() ");
int a=10;
System.out.println(a);
}
void m2(){
System.out.println("I am m2()");
System.out.println(a);
}
}
class Lab279{
public static void main(String args[]){
Hello h=new Hello();
h.m1();
h.m2();
}
} 
