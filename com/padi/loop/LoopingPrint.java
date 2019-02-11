package com.padi.loop;
import java.util.Scanner;

class LoopingPrint {
    private int loop;

    LoopingPrint(int loop){
        this.loop = loop;
    }

    void loopPrint(){
        for (int i=1;i<=this.loop;i++){
            for (int j=1;j<=i;j++) System.out.print(j);
            for (int k=i;k<loop;k++) System.out.print("*");
            System.out.println();
        }
    }
}

class TestLoopPrint{
    public static void main(String []args){
        System.out.print("Input a number: ");
        Scanner inNum = new Scanner(System.in);
        int loop = inNum.nextInt();
        LoopingPrint print = new LoopingPrint(loop);
        print.loopPrint();
    }
}
