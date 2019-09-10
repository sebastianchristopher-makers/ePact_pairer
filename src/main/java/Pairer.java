import java.util.Arrays;
import java.util.Collections;

public class Pairer {

    public static void main(String[] args){
        if(args.length == 0) {
            twoThreePair();
        }

        for(int i = 0; i < args.length; i++){
            System.out.println(args[i]);
            if(args[i].equals("-crunch")){
                crunchPair();
            } else {
                throw new IllegalArgumentException("Not a valid argument: " + args[i]);
            }
        }
    }

    public static void twoThreePair(){
        String[] names = {"Chris", "Eloise", "Paris", "Tuyet", "Alex"};
        Collections.shuffle(Arrays.asList(names));
        System.out.println(names[0] + ", " + names[1]);
        System.out.println(names[2] + ", " + names[3] + ", " + names[4]);
    }

    public static void crunchPair(){
        String[] names = {"Chris", "Eloise", "Paris", "Tuyet", "Alex", "Captain Crunch"};
        Collections.shuffle(Arrays.asList(names));
        for(int i = 0; i < names.length; i+=2){
            System.out.println(names[i] + ", " + names[i+1]);
        }
    }

}
