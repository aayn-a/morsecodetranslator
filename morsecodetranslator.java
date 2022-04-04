import java.util.HashMap;
import java.util.Scanner;

public class morsecodetranslator{
    public static void main(String args[]){
    Scanner in = new Scanner(System.in);
    HashMap<String, String> key = new HashMap<String, String>();
    key.put(".-" , "a");
    key.put("-...", "b");
    key.put("-.-.", "c");
    key.put("-..", "d");
    key.put(".", "e");
    key.put("..-.", "f");
    key.put("--.", "g");
    key.put("....", "h");
    key.put("..", "i");
    key.put(".---", "j"); 
    key.put("-.-", "k");
    key.put(".-..", "l");
    key.put("--", "m");
    key.put("-.", "n");
    key.put("---", "o");
    key.put(".--.", "p");
    key.put("--.-", "q");
    key.put(".-.", "r");
    key.put("...", "s");
    key.put("-", "t");
    key.put("..-", "u");
    key.put("...-", "v");
    key.put(".--", "w");
    key.put("-..-", "x");
    key.put("-.--", "y");
    key.put("--..", "z");
    key.put(".----", "1");
    key.put("..---", "2");
    key.put("...--", "3");
    key.put("....-", "4");
    key.put(".....", "5");
    key.put("-....", "6");
    key.put("--...", "7");
    key.put("---..", "8");
    key.put("----.", "9");
    key.put("-----", "0");

    System.out.println("Write something in morse code, seperate each letter by a space \n");
    String line = in.nextLine(); 
    line = line + " ";
    String currentLetter = ""; 
    for(int x = 0; x < line.length(); x++){
        if(line.charAt(x) == '-' || line.charAt(x) == '.'){
            currentLetter = currentLetter + line.charAt(x);
        }
        if(line.charAt(x) == ' ' || x == line.length()){
            if(key.containsKey(currentLetter)){
                  System.out.print(key.get(currentLetter));
            }
            currentLetter = ""; 

            
        }
        if(line.charAt(x) == '/'){
            currentLetter = ""; 
            System.out.print(" ");

        }


    }
    
    }
}