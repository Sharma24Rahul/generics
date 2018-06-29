import java.util.Scanner;

public class multithreading  {
    static int n ;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        n = sc.nextInt();
        //for(int i =0;i<n;i++)
        //{
          //  System.out.println("enter num");
            //sc.nextInt(i);
        //}

        A obj1 = new A();

        B obj2 = new B();
        //obj2.run();
        obj2.start();
        obj1.start();
    }
}
class A extends Thread
{
     public void run() {
        for (int j = 1; j <= multithreading.n; j++)
            if(j%2==0)
            {
                System.out.println("even"+j);
               try{Thread.sleep(1000);} catch( Exception e){}
            }
    }
}
class B extends Thread
{
    public void run()
    {
        for (int k = 1; k <=multithreading.n; k++)
            if(k%2!=0)
            {
                System.out.println("odd"+k);
               try{Thread.sleep(1000);} catch( Exception e){}
            }
    }
}
