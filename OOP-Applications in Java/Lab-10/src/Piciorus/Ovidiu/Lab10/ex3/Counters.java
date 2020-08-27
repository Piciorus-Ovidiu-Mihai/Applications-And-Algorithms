package Piciorus.Ovidiu.Lab10.ex3;



public class Counters extends Thread {
    String n;
    Thread t;
    int first;

    public Counters (String n, Thread t, int first) {
        this.n = n;
        this.t = t;
        this.first = first;
    }
    public void run(){
        System.out.printf (n+" a intrat in metoda run\n");
        try{
            if(t!=null)t.join ();
            System.out.println (n+" executa operatie.");
            for(int i=first;i<first+100;i++)
                System.out.println (i+1);
            Thread.sleep (2000);
            System.out.println (n+" a terminat operatia.");
        }catch (Exception e){
            e.printStackTrace ();
        }
    }

    public static void main (String[] args) {
        Counters w1 = new Counters ("Proces 1",null,0);
        Counters w2 = new Counters ("Proces 2",w1,100);
        w1.start ();
        w2.start ();
    }
}
