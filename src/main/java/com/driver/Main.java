package com.driver;

public class Main {
    public static void main(){

        B b = new B();
        String ans = b.meth();
        System.out.println(ans);
    }
  
}

class A{
    String meth(){
        return "Invoking method from class A";
    }
}

class B extends A {

    @Override
    String meth(){
        return "Method is overridden in Extendend class B";
    }
}