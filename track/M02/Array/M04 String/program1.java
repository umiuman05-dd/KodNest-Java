class program1{
    static int a;
    static int b;
    int p;
    int q;
    static{
        System.out.println("inside static block");
        a=10;
        b=20;
    }
    {
        System.out.println("inside non - static method");
        p = 100;
        q = 200;
    }
    static void disp1(){
        System.out.println("inside static method");
         System.out.println(a);
          System.out.println(b);

    }
    void disp2(){
    System.out.println("inside non - static method");
    System.out.println(p);
          System.out.println(q);
    }
    public static void main(String[] args){
        program1 pg1 = new program1();
        pg1.disp1();
        pg1.disp2();
    }
}