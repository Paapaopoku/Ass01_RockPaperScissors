import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String move = "R - Rock\tP - Paper\tS - Scissors\nPlayer A choose a move: ";
        String moveI = "R - Rock\tP - Paper\tS - Scissors\nPlayer B choose a move: ";
        String answerYN = "y";




        while (answerYN.equalsIgnoreCase("y")) {
            String A = "";
            String B = "";
            String choices = "RPSrps";
            boolean checkA = false;
            boolean checkB = false;
            while (!checkA) {
                System.out.print(move);
                A = in.nextLine();
                for (int i = 0; i < choices.length(); i++) {
                    String equalA = Character.toString((choices.charAt(i)));
                    if (A.equals(equalA)) {
                        checkA = true;
                    }
                }
                if (!checkA) {
                    System.out.println("Please enter a valid move:");
                }
            }
            while (!checkB) {
                System.out.print(moveI);
                B = in.nextLine();
                for (int i = 0; i < choices.length(); i++) {
                    String equalB = Character.toString((choices.charAt(i)));
                    if (B.equals(equalB)) {
                        checkB = true;
                    }
                }
                if (!checkB) {
                    System.out.println("Please enter a valid move:");
                }
            }

            if(A.equalsIgnoreCase("R"))
            {
                if(B.equalsIgnoreCase("R"))
                {
                    System.out.println("Rock vs Rock. It's a Tie!");
                }
                else if(B.equalsIgnoreCase("P"))
                {
                    System.out.println("Paper beats Rock. Player B wins!");
                }
                else if(B.equalsIgnoreCase("S"))
                {
                    System.out.println("Rock beats Scissors. Player A wins!");
                }
                else
                {
                    System.out.println("Please enter a given move");
                }
            }
            else if(A.equalsIgnoreCase("P"))
            {
                if(B.equalsIgnoreCase("R"))
                {
                    System.out.println("Paper beats Rock. Player A wins!");
                }
                else if(B.equalsIgnoreCase("P"))
                {
                    System.out.println("Paper vs Paper. It's a Tie!");
                }
                else if(B.equalsIgnoreCase("S"))
                {
                    System.out.println("Scissors beats Paper. Player B wins!");
                }
                else
                {
                    System.out.println("Please enter a given move");
                }

            }
            else if(A.equalsIgnoreCase("S"))
            {
                if(B.equalsIgnoreCase("R"))
                {
                    System.out.println("Rock beats Scissors. Player B wins!");
                }
                else if(B.equalsIgnoreCase("P"))
                {
                    System.out.println("Scissors beats Paper. Player A wins!");
                }
                else if(B.equalsIgnoreCase("S"))
                {
                    System.out.println("Scissors vs Scissors. It's a Tie!");
                }
                else
                {
                    System.out.println("Please enter a given move");
                }
            }
            else
            {
                System.out.println("Please enter a given move");
            }





            System.out.print("Do you want to play again {Y or N}: ");
            answerYN = in.nextLine();
            if(answerYN.equalsIgnoreCase("N"))
            {

                System.out.println("Thank you for playing");
            }





        }
    }
}