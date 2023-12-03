 class countDownTimer implements Runnable{
    public int numSessions;

    public countDownTimer(int numSessions){
        this.numSessions = numSessions;
    }

    public static int reset(int numSessions){
        return numSessions = 0;
    }
    @Override
    public void run(){
        for(int i =  numSessions; i >= 0; i--){
            System.out.println(i);
            try {
                Thread.sleep(1000);  // Sleep for 1 second (1000 milliseconds)
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
