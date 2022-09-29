class p4thread1 extends Thread
{
    public void run()
    {
        for(int i=0;i<50;i++)
            System.out.println("Priority of Thread ia :- "+this.getPriority());

    }
}
public class p4
{
    public static void main(String[] args) {
        p4thread1 m1 = new p4thread1();
        p4thread1 m2 = new p4thread1();
        p4thread1 m3 = new p4thread1();
        m1.setPriority(3);
        m2.setPriority(5);
        m3.setPriority(7);
        m1.start();
        m2.start();
        m3.start();
    }
}
