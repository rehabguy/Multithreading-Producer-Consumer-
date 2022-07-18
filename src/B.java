class A implements Runnable{
    public void run(){
        System.out.print("run");
    }
}

class B {
    public static void main(String[] args){
        A ob=new A();
        Thread th=new Thread(ob);
        th.start();
    }
}

