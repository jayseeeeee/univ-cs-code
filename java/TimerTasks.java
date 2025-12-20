void main() {

    String[] lyrics = {"Five!", "자 때가 됐어, Four!", "딱 숨을 멈춰 Three!", "난 너를 겨눠 Two, one, here we go!"};

    // Timer - Class that schedules tasks at specific times or periodically
    // Useful for sending notifications, scheduled updates, repetitive actions
    Timer timer = new Timer();

    // TimerTask - Represents the task that will be executed by the Timer
    // Requires to be extended to define the method of task
    // Create subclass of TimerTask and @Override run()

    TimerTask task = new TimerTask(){
        int count = 0;

        @Override
        public void run(){
            if (count == lyrics.length) {
                timer.cancel(); // Stops  timer and discards scheduled tasks
                return; // Return since loop still runs after cancel
            }
            for (int i = 0; i < lyrics[count].length(); i++) {
                System.out.print(lyrics[count].charAt(i));
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    IO.println(e);
                }
            }
            System.out.println();
            count++;
        }
    };

    // 'schedule' method - Waits for task to finish before starting delay countdown
    timer.schedule(task, 0, 2500); // (task, delay, period)

    // 'scheduleAtFixedRate' method - Starts next task and delay countdown, regardless of previous task
    // timer.scheduleAtFixedRate(task, 3, 30); // .(task, delay, period in ms)
}