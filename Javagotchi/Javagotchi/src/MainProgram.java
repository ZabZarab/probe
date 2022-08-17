import java.util.Timer;
import java.util.TimerTask;

public class MainProgram {
    private static Timer timer;
    private static int timeSinceStart = 0;
    public static void main(String[] args) {
        Javagotchi myJavagotchi = new Javagotchi();
        timer = new Timer();
        System.out.println(" name : " + myJavagotchi.getName());
        System.out.println(" Geschlecht : " + myJavagotchi.getGender());
        System.out.println(" alter : " + myJavagotchi.getAge());
        System.out.println(" hunger : " + myJavagotchi.getHunger());
        System.out.println(" energie : " + myJavagotchi.getEnergy());
        System.out.println(" laune : " + myJavagotchi.getMood());
        System.out.println(" status : "  );

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                //what you want to do
                timeSinceStart +=5;
                zyklus(myJavagotchi);
            }
        }, 0, 5000);//wait 0 ms before doing the action and do it evrey 5000ms (5seconds)

        timer.cancel();//stop the timer
    }
    public static void zyklus(Javagotchi myJavagotchi) {
        myJavagotchi.setAge();
        myJavagotchi.setHunger();
        myJavagotchi.setEnergy();
        myJavagotchi.setMood();
    }
}
