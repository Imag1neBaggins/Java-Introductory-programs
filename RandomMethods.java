package quizmethods;
import java.util.*;
import java.io.*;
public class RandomMethods{
    public static void main(String[] args) {
    }
    
    
    public static int triangle(int rows) {  //calculating no. of blocks in a triangle
        if (rows == 0) return 0;
        return rows + triangle(rows-1);
    }

    public static int sumDigits(int n) {  //calculates sum of digits
        if (n < 10) return n;
        return (n % 10) + sumDigits(n/10);
    }

    public static int count7(int n) {  //counting how many times 7 appears in a num
        if (n < 1) return 0;
        if (n % 10 == 7) return 1 + count7(n/10);
        else return count7(n/10);
    }

    public static int count8(int n) {  //counts how many times 8 appears but if two 8s together, it counts double eg. 8818 gives 4
        if (n < 1) return 0;
        if (n % 10 == 8 && (n / 10) % 10 == 8) return 2 + count8(n/10);
        else if (n % 10 == 8) return 1 + count8(n/10);
        else return count8(n/10);
    }

    public static int countX(String str) {  //counts occurence of a char (x here) in string
        if (str.equals("")) return 0;
        if (str.charAt(0) == 'x')return 1 + countX(str.substring(1));
        else return countX(str.substring(1));
    }

    public static int countHi(String str) {  //counts occurence of a substring in the string
        if (str.length() < 2) return 0;
        if (str.substring(0, 2).equals("hi")) return 1 + countHi(str.substring(1));
        else return countHi(str.substring(1));
    }

    public static String changeXY(String str) {  //changes all occurence of a char(x) to another char(y)
        if (str.equals(""))  return str;
        if (str.charAt(0) == 'x') return "y" + changeXY(str.substring(1));
        return str.charAt(0) + changeXY(str.substring(1));
    }

    public static int array11(int[] nums, int index) {  //counts how many times a value(11) appears in an array
        if (index >= nums.length) return 0;
        if (nums[index] == 11) return 1 + array11(nums, index + 1);
            else return array11(nums, index + 1);
    }

    public static boolean array220(int[] nums, int index) {  //counts if a num is followed by num*10
        if (index >= nums.length - 1) return false;
        if (nums[index + 1] == nums[index] * 10) return true;
        return array220(nums, index + 1);
    }

    public static String pairStar(String str) {  //adds a * in between every pair of same chars
        if (str.equals("") || str.length() == 1) return str;
        if (str.charAt(0) == str.charAt(1)) return str.charAt(0) + "*" + pairStar(str.substring(1));
        else return str.charAt(0) + pairStar(str.substring(1));
    }

    public static String endX(String str) {  //moves all occurences of a char(x) to the end of the string
        if (str.equals("")) return str;
        if (str.charAt(0) == 'x')  return endX(str.substring(1)) + 'x';
        else return str.charAt(0) + endX(str.substring(1));
    }

    public static int countPairs(String str) {  //returns the number of same letters seperated by one eg. AxA returns 1 pair while AxAxA returns 3
        if (str.equals("") || str.length() < 3) return 0;
        if (str.charAt(0) == str.charAt(2)) return 1 + countPairs(str.substring(1));
        else return countPairs(str.substring(1));
    }

    public static int countAbc(String str) { //counts hoiw many times a string(abc and aba) appear in the string
        if (str.length() < 3) return 0;
        if (str.substring(0,3).equals("abc") || str.substring(0,3).equals("aba"))
        return 1 + countAbc(str.substring(1));
        else return countAbc(str.substring(1));
    }
    
    public static int count11(String str) {  //counts how many times a substring appears in a string without overlap
        if (str.length() < 2) return 0;
        if (str.substring(0,2).equals("11"))
            return 1 + count11(str.substring(2));
        else return count11(str.substring(1));
    }

    public static String stringClean(String str) {  //makes all adjacent letters into one occurence eg xxabb becomes xab
        if (str.length() < 2) return str;
        if (str.charAt(0) == str.charAt(1))
            return stringClean(str.substring(1));
        else return str.charAt(0) + stringClean(str.substring(1));
    }

    public static int countHi2(String str) { //counts occurence of a substring(hi) except where thay have a char(x) before it
        int len = str.length();
        if (len < 2) return 0;
        if (str.substring(len-2, len).equals("hi")) {
            if ((len > 2 && str.charAt(len-3) != 'x') || len == 2 ) return 1 + countHi2(str.substring(0, len-1));
        }   
        return countHi2(str.substring(0, len-1));
    }
    
    public static String parenBit(String str) {  //returns substring in paranthesis
        if (str.equals("")) return str;
        if (str.charAt(0) == '(') {
            if (str.charAt(str.length()-1) == ')')
                return str;
            else return parenBit(str.substring(0, str.length()-1));
        } 
        else return parenBit(str.substring(1));
    }

    public static boolean strCopies(String str, String sub, int n) {  //checks if a substring appears at least n time sin a string
        return (func1(str, sub) == n) ;
    }
    public static int func1(String str, String sub) {
        int strlen = str.length();
        int sublen = sub.length();
        if (strlen < sublen) return 0;
        if (str.substring(0, sublen).equals(sub)) return 1 + func1(str.substring(1), sub);
        else return func1(str.substring(1), sub);
    }

    public static int strDist(String str, String sub) {
        return func(str, sub).length(); 
    }
    public static String func(String str, String sub) {
        int strlen = str.length();
        int sublen = sub.length();
        if (str.equals("")) return str;
        if (str.startsWith(sub)) {
            if (str.substring(strlen-sublen, strlen).equals(sub)) return str;
            else return func(str.substring(0, strlen-1), sub);
        }
        else return func(str.substring(1), sub);
    }

    public boolean groupSum(int start, int[] nums, int target) { //calculates if there is a group of ints in array that total upto the target
        if(start >= nums.length) return target == 0;
        if (groupSum(start+1, nums, target - nums[start])) return true;
        if (groupSum(start+1, nums, target )) return true;
        return false;
    }
    
    public static boolean groupSum6(int start, int[] nums, int target) {  // same problem but all cerain ints(6) must be chosen
        if (start >= nums.length) return (target == 0);
        if (nums[start] == 6)return groupSum6(start+1, nums, target - 6);
        if (groupSum6(start+1, nums, target - nums[start])) return true;
        if (groupSum6(start+1, nums, target)) return true;
        return false;
    }
    
    public static boolean groupNoAdj(int start, int[] nums, int target) {  //same problem but no adjacent digits can be chosen
        if (start >= nums.length) return target==0;
        if (groupNoAdj(start+2, nums, target - nums[start])) return true;
        if (groupNoAdj(start+1, nums, target)) return true;
        return false;
    }
    
    public static boolean groupSum5(int start, int[] nums, int target) {  //same but all 5s chosen and if num following 5 is 1, it mus not be chasen
        if (start >= nums.length) return target == 0;
        if (nums[start]%5 == 0 ){
            if (start < nums.length-1 ){
                if (nums[start+1] == 1) {
                    if (groupSum5(start+2, nums, target - nums[start])) return true;
                    return false;
                }
                return (groupSum5(start+1, nums, target- nums[start]));
            }
            return (groupSum5(start+1, nums, target- nums[start]));
        }
        if (groupSum5(start+1, nums, target - nums[start])) return true;
        if (groupSum5(start+1, nums, target)) return true;
        return false;
    }
    
    public static boolean groupSumClump(int start, int[] nums, int target) {  //same but if adjacent nums are same, they should all be chosen or none
        if (start >= nums.length) return target == 0;
        int j = 1;
        for (int i = start + 1; i< nums.length; i++){
            if ( nums[i] == nums[i-1]) j++;
            else break;
        }
        if (groupSumClump(start + j, nums, target - (nums[start] * j))) return true;
        return groupSumClump(start+j, nums, target);
    }
    
    public static boolean splitArray(int[] nums) {  //takes an array and makes two groups of nums that have the exact same sum
        int index = 0;
        int sum1 = 0;
        int sum2 = 0;
        return recArray(nums, index, sum1, sum2);
    }
    public static boolean recArray ( int[] nums, int index, int sum1, int sum2 ) {
        if ( index >= nums.length )  return sum1 == sum2;
        int value = nums[index];
        return (recArray(nums, index + 1, sum1 + value, sum2) || recArray(nums, index + 1, sum1, sum2 + value));
    }
    
    public static boolean splitOdd10(int[] nums) {  //divide the nums such that sum of one group is a multiple of 10 and the other sum is odd
        return recmethod(nums, 0, 0, 0);
    }
    public static boolean recmethod(int[] nums, int index, int sum1, int sum2){
        if (index >= nums.length) return (sum1%2 != 0 && sum2%10 == 0);
        return (recmethod(nums, index+1, sum1+nums[index], sum2) || recmethod(nums, index+1, sum1, sum2+nums[index]));
    } 
    
    public static boolean split53(int[] nums) {  //sum of two groups, one group is multiples of 5, other is multiple of 3s
        return rec(nums, 0, 0, 0);
    }
    public static boolean rec(int[] nums, int index, int sum3, int sum5){
        if (index>=nums.length) return sum3 == sum5;
        if (nums[index]%5 == 0) return rec(nums, index+1, sum3, sum5 + nums[index]);
        if (nums[index]%3 == 0) return rec(nums, index+1, sum3 + nums[index], sum5);
        return (rec(nums, index+1, sum3 + nums[index], sum5) || rec(nums, index+1, sum3 , sum5+ nums[index]));
    }
    
    // - - - - - - - -- - - - - -- - - -- - - -- - - -- - -- - - - - -- - - -- - - - -- - - - -- - - - -- - - -- - - - -- - - -- - - - - -
    
    
    // 2D ARRAY METHODS
    
    /* 
    boolean contInput = true;
            do{  //Input and exception handling loop
                try{
                    System.out.println("Please enter a number");
                    num = in.nextInt(); 
                    else System.out.println("This number is not valid");
                }
                catch(Exception e){
                    System.out.println("This column is not valid");
                    in.nextLine();  //Clearing buffer
                }
            }while(contInput); 
    */
    
    public static int[][] copy(int[][] arr){ // 2D array copy method
        int[][] arr2 = new int[9][9];
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                arr2[i][j] = arr[i][j];
            }
        }
        return arr2;
    }
    
    public static void print(int[][] array){                //printing method
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                System.out.print(array[row][column] + " ");
        }
            System.out.println();
        }
    }
    
    /*
    for (int row = 0; row < array.length; row++) {
        for (int column = 0; column < array[row].length; column++) {
    
        }
    }
    */
    
    // - -- - - - -- - - -- - - - - -- - - - - - - - -- - - - - - - - - -- - - - - - - -
    
    // FILE PROCESSING METHODS
    
    public static void purpleGold(Scanner input) {  //takes a text file that has alternate names and scores from diff teams and gives diff and no. of players
        int purple = 0, gold = 0, pSum = 0, gSum = 0, i = 0;
        while (input.hasNext()){
            String name = input.next();
            if (i % 2 == 0){ purple++; pSum += input.nextInt(); }
            else{ gold++; gSum += input.nextInt(); }
            i++;
        }
        System.out.println(purple + " purple, " + gold + " gold ");
        System.out.print("Difference between purple team and gold team sums: " );
        if (pSum >= gSum) System.out.print(pSum - gSum) ;
        else System.out.print(gSum - pSum); 
    }
    
    public static void evenNumbers(Scanner input) {  //countsd the number of evens and percentage in a text file of ints
	int   sum = 0, even = 0, num1 = 0;
        double nums = 0,evenPer = 0;
        while (input.hasNext()){
            nums++;
            num1++;
            int num = input.nextInt();
            sum += num;
            if (num%2 == 0) even++;
        }
        System.out.println(num1 + " numbers, sum = " + sum);
        evenPer += (even/nums) * 100;
        System.out.printf("%d evens (%4.2f%%)", even, evenPer);
    }
    
    public static boolean negativeSum(Scanner input) {  //returns true if sum becomes negative at some point throughout the file
        int sum = 0, steps = 0;
        while (input.hasNext() ){
            steps++;
            sum += input.nextInt();
            if (sum < 0) break;
        }
        if (sum < 0) {
            System.out.println(sum + " after " + steps + " steps");
            return true;
        }
        System.out.println("no negative sum");
        return false;
    }
    
    public static void countCoins(Scanner input) {  //calculates money through the file
	double money = 0;
    while(input.hasNext()){
        int num = input.nextInt();
        String coinType = input.next().toLowerCase();
        if (coinType.equals("dimes")) money += 0.1 * num;
        else if (coinType.equals("quarters")) money += 0.25 * num;
        else if (coinType.equals("pennies")) money += 0.01 * num;
        else if (coinType.equals("nickels")) money += 0.05 * num;
    }
    System.out.printf("Total money: $%.2f", money);
}
    
    public static void collapseSpaces(Scanner file){  //removes spaces between words
    while(file.hasNextLine()){
        Scanner lineScanner = new Scanner(file.nextLine());
            String result = "";
            while(lineScanner.hasNext()){
                result += lineScanner.next() + " ";
            }
        System.out.println(result);
    }
}
    
    public static String readEntireFile(Scanner input) {  //reads an input file and returns all the text as a string
	String str = "";
    while (input.hasNext()){
        str = str + input.nextLine() + "\n";
    }
    return str;
}
    
    public static void flipLines(Scanner input) {  //takes a file as input and prints it with every 2 lines flipped
	while (input.hasNextLine()){
        String str1 = input.nextLine();
        if (input.hasNextLine()){
            String str2 = input.nextLine();
            System.out.println(str2);
        }
        System.out.println(str1);
    }
}
    
    public static void doubleSpace(Scanner in, PrintStream out) {  //outputs the text from one file into another with double the line spaces
	while (in.hasNext()){
        out.println(in.nextLine());
        out.println();
    }
}
    
    public static void wordWrap(Scanner input) {  //prints out only 60 characters per line
    final int Charsperline = 60;
    while (input.hasNextLine()){
        String str = input.nextLine();
        int len = str.length(), start = 0, end = Charsperline;
        while (len > Charsperline){
            System.out.println(str.substring(start, end));  //for outputting into another file, just remove system.out and add the output name of that file
            len -= Charsperline;
            start += Charsperline;
            end += Charsperline;
        }
        System.out.println(str.substring(start, str.length()));
    }
}
    
    public static void wordWrap3(Scanner input) throws FileNotFoundException { //same problem but now no sentence starts with white space and no word gets cut
    final int charsForLine = 60;
    while(input.hasNextLine()){
        String line = input.nextLine();
        while(line.length() > charsForLine){
            if(line.charAt(charsForLine) == ' '){
                System.out.println(line.substring(0, charsForLine));
                line = line.substring(charsForLine + 1);                         
            }else{
                int newIndex = line.substring(0, charsForLine).lastIndexOf(" ");
                System.out.println(line.substring(0, newIndex));
                line = line.substring(newIndex + 1);                                   
            }
        }
        System.out.println(line);
    }
}
    
    public static void stripHtmlTags(Scanner input) throws FileNotFoundException {  //reads an html file and removes all tings inside <>
    while (input.hasNextLine()){
        String str = input.nextLine();
        boolean print = true;
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == '<') print = false;
            else if (str.charAt(i) == '>') print = true;
            if (print && str.charAt(i) != '>') System.out.print(str.charAt(i));
        }
        System.out.println();
    }
}
    
    public void stripComments(Scanner sc) {  //method that removes all comments
    boolean multiLineComment = false;
    while(sc.hasNextLine()) {
        String line = sc.nextLine();
        boolean singleLineComment = false;
        int i = 0;
        while(i < line.length()) {
            if(multiLineComment && i <= line.length() - 2 && 
                line.charAt(i) == '*' && line.charAt(i+1) == '/') {
                multiLineComment = false;
                i += 2;
            } else if(!singleLineComment && i <= line.length() - 2 && 
                line.charAt(i) == '/' && line.charAt(i+1) == '*') {
                multiLineComment = true;
                i += 2;
            } else if(!multiLineComment && i <= line.length() - 2 && 
                line.charAt(i) == '/' && line.charAt(i+1) == '/') {
                singleLineComment = true;
                i += 2;
            } else if(singleLineComment || multiLineComment) i++;
            else {
                System.out.print(line.charAt(i));
                i++;
            }
        }
        if(!multiLineComment) System.out.println();
    }
}
    
    public void printDuplicates(Scanner sc) {  //method that prints all duplicates and how many occurences there are
    while(sc.hasNextLine()) {
        Scanner line = new Scanner(sc.nextLine());
        String current = "";
        int count = 0;
        while(line.hasNext()) {
            String next = line.next();
            if(next.equals(current))   count++; 
            else {
                if(count > 1) System.out.print(current + "*" + count + " ");
                current = next;
                count = 1;
            }
        }
        if(count > 1) System.out.print(current + "*" + count);
        System.out.println();
    }
}
    
    public void coinFlip(Scanner sc) {  //heads or tails for each line
    while(sc.hasNextLine()) {
        Scanner line = new Scanner(sc.nextLine());
        int h = 0, t = 0;
        while(line.hasNext()) {
            String c = line.next().toLowerCase();
            if(c.equals("h")) h++;
            else t++;
        }
        double percent = (double) (h * 100) / (h + t);
        System.out.println(h + " heads (" + String.format("%.1f", percent) + 
            "%)");
        if(h > t) System.out.println("You win!");
        System.out.println();
    }
}
    
    public int mostCommonNames(Scanner sc) {  //returns num of unique names and most common name in each line
    int unique = 0;
    while(sc.hasNextLine()) {
        Scanner line = new Scanner(sc.nextLine());
        unique++;
        int maxCount = 1,count = 1;
        String maxName = line.next();
        String prevName = maxName;
        while(line.hasNext()) {
            String currentName = line.next();
            if(currentName.equals(prevName)) count++;
            else {
                if(count > maxCount) {
                    maxCount = count;
                    maxName = prevName;
                }
                unique++;
                count = 1;
                prevName = currentName;
            }
        }
        if(count > maxCount) maxName = prevName;
        System.out.println("Most common: " + maxName);
    }
    return unique;
}
    
    public void inputStats(Scanner sc) {  //returns num of tokens in each line, longest word and longest line
    String longestLine = "";
    int lineNum = 0;
    while(sc.hasNextLine()) {
        lineNum++;
        String line = sc.nextLine();
        Scanner lineSc = new Scanner(line);
        int count = 0;
        int longestToken = 0;
        while(lineSc.hasNext()) {
            String token = lineSc.next();
            count++;
            if(token.length() > longestToken) longestToken = token.length();
        }
        System.out.println("Line " + lineNum + " has " + count + 
            " tokens (longest = " + longestToken + ")");
        if(line.length() > longestLine.length()) longestLine = line;
    }
    System.out.println("Longest line: " + longestLine);
}
    
    public void plusScores(Scanner sc) {  //prints each students name and percent
    while(sc.hasNextLine()) {
        String name = sc.nextLine();
        String scores = sc.nextLine();
        int plus = 0, minus = 0;
        for(int i = 0; i < scores.length(); i++) {
            if(scores.charAt(i) == '+') plus++;
            else  minus++;
        }
        double percent = (double) (plus * 100) / (plus + minus);
        System.out.println(name + ": " + String.format("%.1f", percent) + 
            "% plus");
    }
}
    
    
}