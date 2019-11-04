
class A implements Runnable {

    public void run() {
        for(int i =0; i < 5; i++) {
            System.out.println("Hi A");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {

            }
        }
    }
}

class B implements Runnable {
    public void run() {
        for(int i =0; i < 5; i++) {
            System.out.println("Hi B");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {

            }
        }
    }
}



class ThreadDemo
{
    public static void main(String[] args) {

        Runnable a = new A();
        Runnable b = new B();
        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);

        t1.start();
        t2.start();

    }

}
