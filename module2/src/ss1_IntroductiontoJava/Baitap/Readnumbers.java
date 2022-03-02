package ss1_IntroductiontoJava.Baitap;

import java.lang.invoke.SwitchPoint;
import java.util.Enumeration;
import java.util.Scanner;


class ReadNumbers {
    static String from1To9(int number) {
        String string = " ";
        switch (number) {
            case 0:
                string= "Zero";
                break;
            case 1:
                string = "One";
                break;
            case 2:
               string = "Two";
                break;
            case 3:
                string = "There";
                break;
            case 4:
                string = "Four";
                break;
            case 5:
                string = "Five";
                break;
            case 6:
               string = "Six";
                break;
            case 7:
                string= "Seven";
                break;
            case 8:
                string = "Eigth";
                break;
            case 9:
                string = "Nine";
                break;
            case 10:
                string = "Ten";
              break;
        }
        return string;
    }
    static String from11To19(int number){
        String  string = " ";
        switch (number){

            case 11:
                string = "Eleven";
                break;
            case 12:
                string = "Twelve";
                break;
            case 13:
                string = "Thirteen";
                break;
            case 14:
                string = "Fourteen";
                break;
            case 15:
                string = "Fifteen";
                break;
            case 16:
            case 17:
            case 18:
            case 19:
            int hdv = number % 10;
            string = from1To9(hdv) +"teen";
            break;
        }
        return string;
    }
    static String from20To99(int number){
        String string = " ";
        switch (number){
            case 20:
                string = "Twenty";
                break;
            case 30:
                string = "Thirty";
                break;
            case 40:
                string = " Fourty";
                break;
            case 50:
                string = "Fifty";
                break;
            case 60:
            case 70:
            case 80:
            case 90:
                int hc = number / 10;
                string = from1To9(hc) + "ty";
                break;
        }
        return string;

    }
    static String from100To1000(int number){
        String string = " ";
        switch (number){
            case 100:
                string = "One hundred";
                break;
            case 200:
                string = "Two hundred";
                break;
            case 300:
                string = "There hundred";
                break;
            case 400:
                string = "Four hundred";
                break;
            case 500:
                string = "Fif hundred";
                break;
            case 600:
            case 700:
            case 800:
            case 900:
                int htr = number / 100;
                string = from1To9(htr) +"hunderd";
                break;
        }
        return string;

    }

    public static void main(String[] args) {
        ReadNumbers num = new ReadNumbers();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        if (number > 0 && number <= 10){
            String result = num.from1To9(number);
            System.out.println(result);
        }else if (number > 10 && number < 20){
            String result = num.from11To19(number);
            System.out.println(result);
        }else if (number >= 20 && number < 100){
            int hc =(number / 10) *10;
            int hdv = number % 10;
            String result = num.from20To99(hc) + " " + num.from1To9(hdv);
            System.out.println(result);
        }else {
            int htr = (number / 100) * 100;
            int hc = ((number % 100) / 10) * 10;
            int hdv = (number % 100) % 10;
            if(hc > 19 ){
                String result = num.from100To1000(htr)+" " +num.from20To99(hc)+" "+num.from1To9(hdv);
                System.out.println(result);
            }else {
                String result = num.from100To1000(htr)+" " +num.from11To19(hc+hdv);
                System.out.println(result);
            }


        }





    }
}
