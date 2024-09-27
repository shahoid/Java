class tthreads extends Thread{
    String threadName;
    public tthreads(String name){
        threadName=name;
    }
    public void run(){
        for(int i=1;i<6;i++){
            System.out.println(threadName +": "+i);
            try{
                Thread.sleep(500);
            }
            catch(InterruptedException e){
                System.out.println("Inturrupted !");
            }
        }
    }
}


class ttthreads extends Thread{
    String threadName;
    public ttthreads(String name){
        threadName=name;
    }
    public void run(){
        for(int i=1;i<6;i++){
            System.out.println(threadName +": "+i);
            try{
                Thread.sleep(500);
            }
            catch(InterruptedException e){
                System.out.println("Inturrupted !");
            }
        }
    }
}


public class Threads{
    public static void main(String[] args) {
        tthreads t1=new tthreads("Thread A");
        ttthreads t2=new ttthreads("Thread B");

        t1.start();
        t2.start();
    }
}
