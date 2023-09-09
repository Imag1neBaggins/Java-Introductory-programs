package paragraph;
import java.util.*;
public class Paragraph {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your text: ");
        String str = in.nextLine();
        System.out.println("Press 1 for replace, 2 for word counter, 3 for sentences, 4 for articles, 5 for spaces: ");
        int x = in.nextInt();
        if (x>=1 && x<6){
            switch (x){
                case 1: {
                    System.out.println("enter 1 for replacing one by one, enter 2 for all");
                    int z = in.nextInt();
                    if (z == 1){
                        System.out.println("Which word do you want to replace? ");
                        String replaced = in.next();
                        System.out.println("Which word do you want to replace with? ");
                        String replace = in.next();
                        char cont;
                        String str2 = str;
                        do {
                            str2 = str2.replaceFirst(replaced, replace);
                            System.out.println(str2);
                            System.out.println("Do you want to replace more? Y or N ");
                            cont = in.next().toUpperCase().charAt(0);
                        }while( cont == 'Y');
                    }
                    else {
                        System.out.println("Which word do you want to replace? ");
                        String replaced2 = in.next();
                        System.out.println("Which word do you want to replace with? ");
                        String replace2 = in.next();
                        String str3 = str.replaceAll(replaced2, replace2);
                        System.out.println(str3);
                    }
                    break;
                }
                case 2:{
                    String [] words = str.split(" .");
                    System.out.println("The number of words in your text are: " + words.length);
                    break;
                }
                case 3: {
                    String [] sentence = str.split("\\.");
                    System.out.println("The number of sentences in your text are: " + sentence.length);
                    break;
                }
                case 4: {
                    int articles = 0;
                    String [] words = str.split(" ");
                    for (int i = 0; i < words.length; i++) {
                        String word = words[i].toLowerCase();
                        if ( word.equals("a") || word.equals("an") || word.equals("the")){
                            articles++;
                        }    
                    }
                    System.out.println("The number of articles in your text are: " + articles);
                    break;
                }
                case 5: {
                    String [] sentence = str.split(" ");
                    System.out.println("The number of spaces in your text are: " + sentence.length);
                    break;
                }
        }
        }
    }
    
}
