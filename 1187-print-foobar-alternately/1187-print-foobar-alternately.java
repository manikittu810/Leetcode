class FooBar {
    private int n;
    boolean turn ;

    public FooBar(int n) {
        this.n = n;
        turn = true;

    }

    public  void foo(Runnable printFoo) throws InterruptedException {
        synchronized(this){
            for (int i = 0; i < n; i++) {
                while(!turn){
                    wait();
                }
        	printFoo.run();
            turn = false;
            notifyAll();
        }
        }
        
    }

    public  void bar(Runnable printBar) throws InterruptedException {
        synchronized(this){
for (int i = 0; i < n; i++) {
    while(turn){
        wait();
    }
            
            // printBar.run() outputs "bar". Do not change or remove this line.
        	printBar.run();
            turn = true;
            notifyAll();
        }
        }
        
    }
}