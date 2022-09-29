import java.util.*;
class p3thread extends Thread
{
    int p;
    p3thread(int p)
    {
        this.p = p;
    }
    public void increment()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println(++p);
            try
            {
                sleep(1000);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }

        }
    }
    public void run()
    {
        increment();
    }
}
public class p3
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :-");
        int p = sc.nextInt();
        p3thread m = new p3thread(p);
        m.start();
    }
}
