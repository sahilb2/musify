package musify;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Scanner;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

/**
 *
 * @author Sahil and Brian
 */

public class Musify {

    private String name;
    private int tempoNum, phraseLengthNum;
    
    public Musify (String nm, int tempo, int pLength){
        name = nm;
        tempoNum = tempo;
        phraseLengthNum = pLength;
    }
    
    public int[] meat () {
        int[] chords = new int[phraseLengthNum];
        chords [0] = 1;
        chords [1] = (int) (Math.random() * 7) + 1;
        for (int i = 2; i<phraseLengthNum; i++){
            if (chords [i-1] == 1)
                chords [i] = (int) (Math.random() * 7) + 1;
            if (chords [i-1] == 2){
                int var = (int) (Math.random() * 2) + 1;
                if (var == 1)
                    chords [i] = 5;
                if (var == 2)
                    chords [i] = 7;
            }    
            if (chords [i-1] == 3){
                int var = (int) (Math.random() * 2) + 1;
                if (var == 1)
                    chords [i] = 4;
                if (var == 2)
                    chords [i] = 6;
            }    
            if (chords [i-1] == 4){
                int var = (int) (Math.random() * 4) + 1;
                if (var == 1)
                    chords [i] = 1;
                if (var == 2)
                    chords [i] = 2;
                if (var == 3)
                    chords [i] = 5;
                if (var == 4)
                    chords [i] = 7;
            }   
            if (chords [i-1] == 5){
                int var = (int) (Math.random() * 2) + 1;
                if (var == 1)
                    chords [i] = 1;
                if (var == 2)
                    chords [i] = 6;
            }    
            if (chords [i-1] == 6){
                int var = (int) (Math.random() * 2) + 1;
                if (var == 1)
                    chords [i] = 2;
                if (var == 2)
                    chords [i] = 4;
            }
            if (chords [i-1] == 7){
                int var = (int) (Math.random() * 2) + 1;
                if (var == 1)
                    chords [i] = 1;
                if (var == 2)
                    chords [i] = 3;
            }
        }
        return chords;
    }
    
    public void chordsNames (int[] x) throws Exception{
        for (int y: x){
            if (y == 1){
                System.out.println("C Major");
                String C = "C:\\Users\\Sahil\\Documents\\NetBeansProjects\\Musify\\src\\Audio Files\\C" + tempoNum + ".wav";
                InputStream in = new FileInputStream(C);
                AudioStream audioStream = new AudioStream(in);
                AudioPlayer.player.start(audioStream);
                try {
                Thread.sleep(tempoNum*1000);
                } catch(InterruptedException ex) {
                Thread.currentThread().interrupt();
                }
            }
            if (y == 2){
                System.out.println("D Minor");
                String D = "C:\\Users\\Sahil\\Documents\\NetBeansProjects\\Musify\\src\\Audio Files\\D" + tempoNum + ".wav";
                InputStream in = new FileInputStream(D);
                AudioStream audioStream = new AudioStream(in);
                AudioPlayer.player.start(audioStream);
                try {
                Thread.sleep(tempoNum*1000);
                } catch(InterruptedException ex) {
                Thread.currentThread().interrupt();
                }
            }
            if (y == 3){
                System.out.println("E Minor");
                String E = "C:\\Users\\Sahil\\Documents\\NetBeansProjects\\Musify\\src\\Audio Files\\E" + tempoNum + ".wav";
                InputStream in = new FileInputStream(E);
                AudioStream audioStream = new AudioStream(in);
                AudioPlayer.player.start(audioStream);
                try {
                Thread.sleep(tempoNum*1000);
                } catch(InterruptedException ex) {
                Thread.currentThread().interrupt();
                }
            }
            if (y == 4){
                System.out.println("F Major");
                String F = "C:\\Users\\Sahil\\Documents\\NetBeansProjects\\Musify\\src\\Audio Files\\F" + tempoNum + ".wav";
                InputStream in = new FileInputStream(F);
                AudioStream audioStream = new AudioStream(in);
                AudioPlayer.player.start(audioStream);
                try {
                Thread.sleep(tempoNum*1000);
                } catch(InterruptedException ex) {
                Thread.currentThread().interrupt();
                }
            }
            if (y == 5){
                System.out.println("G Major");
                String G = "C:\\Users\\Sahil\\Documents\\NetBeansProjects\\Musify\\src\\Audio Files\\G" + tempoNum + ".wav";
                InputStream in = new FileInputStream(G);
                AudioStream audioStream = new AudioStream(in);
                AudioPlayer.player.start(audioStream);
                try {
                Thread.sleep(tempoNum*1000);
                } catch(InterruptedException ex) {
                Thread.currentThread().interrupt();
                }
            }
            if (y == 6){
                System.out.println("A Minor");
                String A = "C:\\Users\\Sahil\\Documents\\NetBeansProjects\\Musify\\src\\Audio Files\\A" + tempoNum + ".wav";
                InputStream in = new FileInputStream(A);
                AudioStream audioStream = new AudioStream(in);
                AudioPlayer.player.start(audioStream);
                try {
                Thread.sleep(tempoNum*1000);
                } catch(InterruptedException ex) {
                Thread.currentThread().interrupt();
                }
            }
            if (y == 7){
                System.out.println("B Diminished");
                String B = "C:\\Users\\Sahil\\Documents\\NetBeansProjects\\Musify\\src\\Audio Files\\B" + tempoNum + ".wav";
                InputStream in = new FileInputStream(B);
                AudioStream audioStream = new AudioStream(in);
                AudioPlayer.player.start(audioStream);
                try {
                Thread.sleep(tempoNum*1000);
                } catch(InterruptedException ex) {
                Thread.currentThread().interrupt();
                }
                }
        }            
    } 
    
    public static int setTempoNum (String tempo) {
        // returns 1 for fast and 2 for slow;
        if (tempo.equalsIgnoreCase("f")){ 
            return 1;
        }    
        else if (tempo.equalsIgnoreCase ("s")){
            return 2;
        }
        else{ 
            System.out.println("Please input your tempo preference: (f) for fast or (s) for slow. "
                    + "Answer correctly or you will be bombarded with more spam!");
            return -1;
        }    
    }
    
    public int getTempoNum () {
        return tempoNum;
    }
    
    public static int setPhraseLengthNum (String pLen) {
        // returns 4 for short and 8 for long;
        if (pLen.equalsIgnoreCase("s")){
            return 4;
        }    
        else if (pLen.equalsIgnoreCase("l")){
            return 8;
        }
        else{ 
        System.out.println("Please input your tempo preference: (l) for long or (s) for short. "
            + "Answer correctly or you will be bombarded with more spam!");
        return -1;
        }
    }
    
    public int getPhraseLengthNum () {
        return phraseLengthNum;
    }
    
    public String getName () {
        return name;
    }
    
    public static void main(String[] args) throws Exception{         
        System.out.println("Welcome to Jurassic Park!");
        {
            String JP = "C:\\Users\\Sahil\\Documents\\NetBeansProjects\\Musify\\src\\Audio Files\\JP.wav";
            InputStream in = new FileInputStream(JP);
            AudioStream audioStream = new AudioStream(in);
            AudioPlayer.player.start(audioStream);
        }
            try {
            Thread.sleep(8000);
            } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
            }
        System.out.println("...");
            try {
            Thread.sleep(1000);
            } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
            }
        System.out.println("Whoops");
            try {
            Thread.sleep(1000);
            } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
            }
        System.out.println("I meant...");
            try {
            Thread.sleep(1000);
            } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
            }
        System.out.println("Welcome to Musify!!!");
            try {
            Thread.sleep(2000);
            } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
            }
        System.out.println("(Trademark, B&S Productions)");
            try {
            Thread.sleep(1500);
            } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
            }
        Scanner reader = new Scanner (System.in);
        System.out.println("What is your name?");
        String name = reader.nextLine();
        if (name.equalsIgnoreCase("Scott")){
            System.out.print(name + "?");
                try {
                Thread.sleep(3000);
                } catch(InterruptedException ex) {
                Thread.currentThread().interrupt();
                }
            System.out.println(" That's a cool name!");
                try {
                Thread.sleep(1738);
                } catch(InterruptedException ex) {
                Thread.currentThread().interrupt();
                }
        }
        else { 
            System.out.print(name + "?");
                try {
                Thread.sleep(3000);
                } catch(InterruptedException ex) {
                Thread.currentThread().interrupt();
                }
            System.out.println(" That's a stupid name! Ha ha ha!");
                try {
                Thread.sleep(2000);
                } catch(InterruptedException ex) {
                Thread.currentThread().interrupt();
                }
        }
        System.out.println("Alright let's do business.");
            try {
            Thread.sleep(1500);
            } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
            }
        System.out.println("Do you want your song to be FAST(f) or SLOW(s)? Input your tempo preference (f or s).");
        String speed = reader.nextLine();
            if (Musify.setTempoNum(speed) == -1){
                while(Musify.setTempoNum(speed) == -1){
                    String speed2 = reader.nextLine();
                    Musify.setTempoNum(speed2);
                        if (Musify.setTempoNum(speed2) != -1){
                             speed = speed2;
                        }                          
                } 
            }
            
        System.out.println("Ok great! Now do you want your song to be SHORT(s) or LONG(l)? "
                + "Input your phrase length preference (s or l).");
            
        String phraseLength = reader.nextLine();
            if (Musify.setPhraseLengthNum(phraseLength) == -1){
                while(Musify.setPhraseLengthNum(phraseLength) == -1){
                    String phraseLength2 = reader.nextLine();
                    Musify.setPhraseLengthNum(phraseLength2);
                        if (Musify.setPhraseLengthNum(phraseLength2) != -1){
                             phraseLength = phraseLength2;
                        }                          
                } 
            }
        Musify x = new Musify (name, Musify.setTempoNum(speed), Musify.setPhraseLengthNum(phraseLength)); 
        System.out.println("Please wait!");
        int[] chordsNum = x.meat();
        x.chordsNames(chordsNum);
        
        try {
        Thread.sleep(1500);
        } catch(InterruptedException ex) {
        Thread.currentThread().interrupt();
        }
        
        String tempoStr, phraseLengthStr;
        
        if (x.getTempoNum()==1)
            tempoStr = "FAST";
        else 
            tempoStr = "SLOW";
        
        if (x.getPhraseLengthNum()==4)
            phraseLengthStr = "SHORT";
        else
            phraseLengthStr = "LONG";
        
        System.out.println("So " + x.getName() + ", did you enjoy your " + tempoStr + " and " + phraseLengthStr + 
                " 'Musified' chord progession? Yes (Y) or No (N)?");
        String response = reader.nextLine();
        if (response.equalsIgnoreCase("Y"))
            System.out.println("Great, see you l8r!");
        else if (response.equalsIgnoreCase("N")){
            System.out.println("I'm sorry!");
            try {
            Thread.sleep(1500);
            } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
            }
            System.out.println("Too bad, see you l8r!");
            
        }
        else {
            for (int i = 0; i < 69; i++){
                System.out.println("SYSTEM ERROR 69.420.1738.2121");
                try {
                Thread.sleep(100);
                } catch(InterruptedException ex) {
                Thread.currentThread().interrupt();
        }
            }
            System.out.println(".........,....................,......,.............,......,........................");
            System.out.println("...,,..,...........................,......:,,::,,:,.,,,,:,.,,.........,...,..,,....");
            System.out.println("..,..,,.....,......2illl▓▓███████████▓▓▓▓▓▓██▓ .........,..,,..");
            System.out.println(",...,..,...,.k▓█▓▓▓▓lBEnjjBllllllBjzv░1JTHtq8tL;..,...nll█▓.......,...,,");
            System.out.println("..,......v▓█M:..,::,,:;1JBt;,...,....q:......:vFll▓▓llEL.....█▓,......,...");
            System.out.println(",...,.....█,,,...░;........;x,.......,:,,..,,:,,........,░,,,.....█lM.......,,");
            System.out.println(".....,:n█▓...,..Lii███▓B1........tj▓▓▓█████lM.,,........j█�� �;......");
            System.out.println("...W██▓w,,..,Y▓▓█████M...k██▓▓▓█▓lll▓▓v▓▓▓▓� ��;.▓█▓...");
            System.out.println("..#ll█::vn▓▓▓▓g;J:..,.t█▓................,n▓▓glll▓▓▓▓Wl▓▓.wl l█..");
            System.out.println("...zi█;:..,..,t▓7▓▓░2ll█▓:......,.X▓Bq..,.........Bll▓▓█▓.El█3.F █lll");
            System.out.println(".....▓█1t;3█▓.,...Wl██,..,..f▓▓Mi█W,rB▓▓▓█lB;..▓█lBt█lK.:; █..");
            System.out.println("....,.f█▓W███▓▓7:..▒▓█M..tjBl▓██▓Bjzr▒█▓Bj██jY.,..,h █▓2..");
            System.out.println(".....,..j█.jll█Bl▓▒ll█fjllllll█llBIjj█6;:..▒▓▓▓████,l█▓. .....Bl█▓..,..");
            System.out.println(",......U█.;r█████▓▓▓█▓▓█▓▓█████Bj..C██W.....yi █;:.......");
            System.out.println("........j█...█████████████▓lM:.k▓M..f▓█W,...,..lll█8 :.....,...");
            System.out.println(",......N▓,..B██▓▓.█M1▓▓.,..j█....,;8l██▓W,.....░ll██r:....., ,..,,");
            System.out.println("......r▓▓.....▒ll▓▓▓██▓█▓▓██▓▓▓▓881xtll▓▓██▓ I....,..,,..,...");
            System.out.println("......I█▓.6;,.░;,,,..,..;r░::v7::,..;YTn;xtll▓▓█▓▓n..........,,..,.....");
            System.out.println(".....w█▓..,JjlgglllBjkT:,..,.........,,.,W▓▓▓▓H...............,,..,..,,..");
            System.out.println(",......U█▓r....,......,......,;rll▓l█▓▓▓▓t,..,..........,..,,..,..,,.,,... .");
            System.out.println(".........▒ll███▓▓▓▓███▓▓▓BBj::....,......,.....,,..,..,,..,.., ,.,,...");
            System.out.println(",...,..,.............,...,......,......,..,...,..,......,......,...,......,........");
            
        }
    }
}