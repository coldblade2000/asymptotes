import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean bContinue = true;
        boolean a,b,c,d;
        while(bContinue){
            System.out.println("What values do you have? Type them in like '-5 12 0 4':    \n");

            String input = scan.nextLine();
            if(input.equalsIgnoreCase("quit")){
                bContinue = false;
                System.out.println("Goodbye!");
            }else{
                ArrayList<Integer> terms = new ArrayList<Integer>();
                char[] chars = input.toCharArray();
                //ArrayList<String> terms = new ArrayList<String>();
                StringBuilder currentTerm = new StringBuilder();
                for (int i = 0; i < chars.length; i++) {
                    //System.out.println("i = "+i);
                    if (chars[i] == ' ') {
                        if(!currentTerm.toString().equals("")){
                            terms.add(Integer.parseInt(currentTerm.toString()));
                            System.out.println(""+terms.toString());
                            //System.out.println("New Term: "+currentTerm.toString());
                        }
                        currentTerm = new StringBuilder();
                    }else{
                        currentTerm.append(chars[i]);
                    }

                }
                terms.add(Integer.parseInt(currentTerm.toString()));
                System.out.println(""+terms.toString());
                deliverResults(terms);
                /*terms.push(currentTerm.toString());
                for(String a: terms){15 7 1 1 + - / 3 * 2 1 1 + + -
                    System.out.println(a+" ");
                }*/
            }
        }
    }
    private static void deliverResults(ArrayList<Integer> terms) {
        double a = terms.get(0);
        double b = terms.get(1);
        double c = terms.get(2);
        double d = terms.get(3);
        System.out.println("Vertical Asymptote: x = " + (d / c) * -1);
        System.out.println("Horizontal Asymptote: y = " + (a / c));
        System.out.println("X-intercept : " + (b/a)*-1);
        System.out.println("Y-intercept : " + (b/d));
    }
}
