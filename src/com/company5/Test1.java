package com.company5;

enum Color1
{
    RED, GREEN, BLUE;

    // 构造函数
    private Color1()
    {
        System.out.println("Constructor called for : " + this.toString());
    }

    public void colorInfo()
    {
        System.out.println("Universal Color");
    }
}

public class Test1
{
    // 输出
    public static void main(String[] args)
    {
        Color1 c1 = Color1.RED;
        System.out.println(c1);
        c1.colorInfo();
    }
}
