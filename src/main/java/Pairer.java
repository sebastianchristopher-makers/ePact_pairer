import java.util.Arrays;
import java.util.Collections;

public class Pairer {

    private String pairs;

    public Pairer(){
        pairs = "";
    }

    public static void main(String[] args){
        if(args.length == 0) {
            System.out.println(twoThreePair());
        }

        for(int i = 0; i < args.length; i++){
            if(args[i].equals("-crunch")){
                System.out.println(crunchPair());
            } else {
                throw new IllegalArgumentException("Not a valid argument: " + args[i]);
            }
        }
    }

    public static String twoThreePair(){
        String[] names = {"Chris", "Eloise", "Paris", "Tuyet", "Alex"};
        Collections.shuffle(Arrays.asList(names));
        return names[0] + ", " + names[1] + "\n" + names[2] + ", " + names[3] + ", " + names[4];
    }

    public static String crunchPair(){
        String[] names = {"Chris", "Eloise", "Paris", "Tuyet", "Alex", "Captain Crunch"};
        Collections.shuffle(Arrays.asList(names));

        StringBuilder tmpPairs = new StringBuilder();
        for(int i = 0; i < names.length; i+=2){
            tmpPairs.append(names[i] + ", " + names[i+1] + "\n");
        }
        return tmpPairs.toString();
    }

    public void setPairs(String value){
        pairs = value;
    }

    public String getPairs(){
        return pairs;
    }

}
