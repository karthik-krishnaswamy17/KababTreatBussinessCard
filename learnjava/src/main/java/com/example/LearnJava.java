package com.example;



public abstract class LearnJava {


    public static void main(String[] args) {

    parent p=new child();
        ((child)p).m1();




    }


}

class parent
{
    int x=10;
    void m1(int x)
    {
        System.out.println("Hello"+x);
    }
}

class child extends parent
{
    void m1()
    {
        System.out.println("You got access to child");
    }
}

