package com.company;

class Examle{
    static int n=5; // спользуется всеми в классе, не создается при инициализации
    int j=0; // для каждого создается свой
    static void method(int... i) {//массив int
        for (int k:i){
        System.out.println(k);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Examle.method(2, 3, 4);
        System.out.println("--------------");
        Examle e1=new Examle(), e2=new Examle();
        e1.n=7;
        e1.j=3;
        e2.j=2;
        e2.method(e1.n, e2.n, e1.j, e2.j);

	// write your code here
    }
}
