import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;
public class Conversation {
    /**
     * Attributes
     */
    Random rand=new Random();
    ArrayList<String> Output=new ArrayList<>();
    Scanner input2 = new Scanner(System.in);
    int number;
    String array1[] = {"Interesting","Tell me","Sure.","What is it?","Really","Okay.","Oh"};
    String array3[] = {"i","you","i am","you are", "i'm","me", "me's","you're", "my", "your", "We"};

    /**
     * method to replace words in a phrase
     * @param sen takes in the sentence
     * @param old takes in the word to be replaced
     * @param New takkes in the new word to insert in
     * @return a changed sentence
     */
    public static String replace(String sen, String old, String New) {
        return sen.replaceAll("\\b" + old + "\\b", New);
    }

    /**
     * consutructor to request for the number of rounds to be run
     * calls the converse methdd and pass in the number
     */
    public Conversation(){
        System.out.println("Please enter the number of rounds you would like to have");
        number= input2.nextInt();
        converse(number);
    }

    /***
     * method for the actual conversation input, words change and replies by the chatbot
     * @param number takes in the number of rounds as a parameter
     */
    public void converse(int number) {
        String sentence, sentence1;
        for (int k = 0; k <= number; k++) {
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
