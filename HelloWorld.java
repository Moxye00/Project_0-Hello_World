 passublic class HelloWorld{
    public static void main(String[] args){
        System.out.println("Hello World");
        int x=3;
        System.out.println(x);
        double y=3.12;
        System.out.println(y);
        int z=9;
        System.out.println(z);
        double w=z;
        System.out.println(w);
        int k=(int)3.14;
        System.out.println(k);
        //System.out.println(String.valueOf(x)+"\n"+String.valueOfé(y))
        //x=true;
        int t=27;
        System.out.println(t);
        int r=x+t;
        System.out.println(r);
        final int b=3;
        boolean h=true;
        byte b1=8;     //8 bit signed
        short s1=200;  //16 bit signed
        int i1=1_000_000_000;   //32 bit signed
        long l1=10_000_000_000L;  //64 bit signed
        char c1='a';  //16 bit unsigned
        float f1=3.14F;  //32 bit
        double d1=3.14;  //64 bit
        boolean b2=false; 

        boolean isBalanceNegative=false;
        if(isBalanceNegative) {
            System.out.println("sei un barbone");
            System.out.println("sei un grosso barbone");
    
        }

        double height=200;
        boolean isVeryTall=height>=200;
        double weight=91.5;
        if (height>=200) { 
           System.out.println("sei altissimo"); 
           if (weight>110) {
             System.out.println("potresti giocare a basket ma sei troppo grasso");
           } else {
              System.out.println("vai a giocare a basket");
           }
        } else if (height>=180 && weight>90) {
            System.out.println("sei alto ma anche cicciottello");
        } else if (height>=180 && weight<=90) {
            System.out.println("sei alto e magro");
        } else if (height>=170) {
            System.out.println("sei in altezza media");
        } else {
            System.out.println("sei basso");
        }
        boolean isSunny=false;
        double temperature=26;
        if (isSunny || temperature>25) {
            System.out.println("andiamo a mare");
        }
        int z1=0;
        int r3=10;
        if (z1 != 0 && r3/z1>3) {
        }
        for (int i=0; i<4; i++) {
            System.out.println("siamo i campioni del mondo");
        }
        
        
    }
}