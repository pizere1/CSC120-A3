import java.util.ArrayList;
import java.util.Scanner;
public class WordCheckers {
        public static String replace(String sen, String Word1, String Word2) {
            return sen.replaceAll("\\b" + Word1 + "\\b", Word2);
        }
    public static void main(String[] arguments) {
        ArrayList<String> Output=new ArrayList<>();
        Scanner input2 = new Scanner(System.in);
        String array1[] = { " ","Hi, How have you been", "What do you think?"," That's interesting" ,"Tell me more", "Why?", "Oh!!Sure.", " What do you want?","Really","I see","Okay.."};
        System.out.println("Please enter the number of rounds you would like to have");
        int Number = input2.nextInt();
        int i;
        String sentence;
        String array3[] = {"i","am","i'm", "you're", "my", "your", "We"};
        String array4[] = {"you","are","you're", "i'm", "your", "my", "you"};
        int mod=Number%9;
        int rounds= (Number-mod)/9;
        if (Number<array1.length){
            for (int k = 0; k <= Number; k++) {
                System.out.println(array1[k]);
                Output.add(array1[k]);
                sentence=input2.nextLine();
                Output.add(sentence);
                for(int j=0;j<array3.length;j++){
                if (sentence.contains(array3[j])) {
                    String newSentence = replace(sentence, array3[j], array4[j]);
                    System.out.println(newSentence+"?");
                    sentence=input2.nextLine();
                    Output.add(sentence);
                    k++;}
                }
            }}
        else {
            for (int k = 0; k < array1.length; k++) {
                System.out.println(array1[k]);
                Output.add(array1[k]);
                sentence=input2.nextLine();
                Output.add(sentence);
                for(int j=0;j<array3.length;j++){
                    if (sentence.contains(array3[j])) {
                        String newSentence = replace(sentence, array3[j], array4[j]);
                        System.out.println(newSentence+"?");
                        sentence=input2.nextLine();
                        Output.add(sentence);
                        k++;}
                }
            }
            for (i = 1; i < rounds; i++) {
                for (int j = 2; j < array1.length; j++) {
                    Output.add(array1[j]);
                    System.out.println(array1[j]);
                    sentence=input2.nextLine();
                    Output.add(sentence);
                    for(int k=0;k<array3.length;k++){
                        if (sentence.contains(array3[k])) {
                            String newSentence = replace(sentence, array3[k], array4[k]);
                            System.out.println(newSentence+"?");
                            sentence=input2.nextLine();
                            Output.add(sentence);
                            j++;}
                    }
                }
            }
            if (mod != 0) {
                for (int j = 1; j < mod; j++) {
                    Output.add(array1[j + 1]);
                    System.out.println(array1[j + 1]);
                    sentence=input2.nextLine();
                    Output.add(sentence);
                    for(int k=0;k<array3.length;k++){
                        if (sentence.contains(array3[j])) {
                            String newSentence = replace(sentence, array3[k], array4[k]);
                            System.out.println(newSentence+"?");
                            sentence=input2.nextLine();
                            Output.add(sentence);
                            j++;}
                    }
                }
            }
        }
        System.out.println(Output);
    }
}
