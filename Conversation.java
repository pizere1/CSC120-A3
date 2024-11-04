import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;
public class Conversation {
    Random rand=new Random();
    ArrayList<String> Output=new ArrayList<>();
    Scanner input2 = new Scanner(System.in);
    int Number;
    String array1[] = {"Interesting","Tell me","Sure.","What is it","Really","Okay.","Oh"};
    String array3[] = {"i","you","i am","you are", "i'm","me", "me's","you're", "my", "your", "We"};
    public static String replace(String sen, String old, String New) {
        return sen.replaceAll("\\b" + old + "\\b", New);
    }
    public Conversation(){
        System.out.println("Please enter the number of rounds you would like to have");
        Number= input2.nextInt();
        converse();
    }
    public void converse() {
        String sentence, sentence1;
        for (int k = 0; k <= Number; k++) {
            if(k==0){
                String randomoutput="";
                System.out.println(randomoutput);
                Output.add(randomoutput);
                sentence=input2.nextLine();
                sentence=sentence.toLowerCase();
                Output.add(sentence);
                for(int l=0;l<array3.length;l++){
                    if (sentence.contains(array3[l])) {
                        String[] words = sentence.split(" ");
                        for (int j = 0; j < words.length; j++) {
                            if (words[j].equals("i")) {
                                words[j] = "you";
                            } else if (words[j].equals("you")) {
                                words[j] = "i";
                            } else{}
                            if (words[j].equals("me")) {
                                words[j] = "you";
                            }
                            if (words[j].equals("my")) {
                                words[j] = "your";
                            } else if (words[j].equals("your")) {
                                words[j] = "my";
                            } else{}
                            if (words[j].equals("i'm")) {
                                words[j] = "you're";
                            } else if (words[j].equals("you're")) {
                                words[j] = "i'm'";
                            } else{}
                            if (words[j].equals("am")) {
                                words[j] = "are";
                            }
                            if (words[j].equals("me's")) {
                                words[j] = "you're";
                            }
                            if (words[j].equals("we")) {
                                words[j] = "you'";
                            }
                            if (words[j].equals("our")) {
                                words[j] = "your";
                            }
                        }
                        String sentence2 = String.join(" ", words);
                        sentence=sentence2+"?";
                        if(sentence.contains("you am")){
                            sentence=replace(sentence,"you am","you are");
                        }
                        if(sentence.contains("are i")){
                            sentence=replace(sentence,"are i","am i");
                        }
                        System.out.println(sentence);
                        Output.add(sentence);
                        sentence=input2.nextLine();
                        Output.add(sentence);
                        k=k+1;
                    }
                }
            } else {
                int random = rand.nextInt(array1.length);
                String randomoutput = array1[random];
                System.out.println(randomoutput);
                Output.add(randomoutput);
                sentence=input2.nextLine();
                sentence=sentence.toLowerCase();
                Output.add(sentence);
                for(int l=0;l<array3.length;l++){
                    if (sentence.contains(array3[l])) {
                        String[] words = sentence.split(" ");
                        for (int j = 0; j < words.length; j++) {
                            if (words[j].equals("i")) {
                                words[j] = "you";
                            } else if (words[j].equals("you")) {
                                words[j] = "i";
                            } else{}
                            if (words[j].equals("me")) {
                                words[j] = "you";
                            }
                            if (words[j].equals("my")) {
                                words[j] = "your";
                            } else if (words[j].equals("your")) {
                                words[j] = "my";
                            } else{}
                            if (words[j].equals("i'm")) {
                                words[j] = "you're";
                            } else if (words[j].equals("you're")) {
                                words[j] = "i'm'";
                            } else{}
                            if (words[j].equals("am")) {
                                words[j] = "are";
                            }
                            if (words[j].equals("me's")) {
                                words[j] = "you're";
                            }
                            if (words[j].equals("we")) {
                                words[j] = "you'";
                            }
                            if (words[j].equals("our")) {
                                words[j] = "your";
                            }
                        }
                        String sentence2 = String.join(" ", words);
                        sentence=sentence2+"?";
                        if(sentence.contains("you am")){
                            sentence=replace(sentence,"you am","you are");
                        }
                        if(sentence.contains("are i")){
                            sentence=replace(sentence,"are i","am i");
                        }
                        System.out.println(sentence);
                        Output.add(sentence);
                        sentence=input2.nextLine();
                        Output.add(sentence);
                        k=k+1;
                    }
                }
            }
        }
        for(String element:Output){
            System.out.println(element);
        }
    }
}
