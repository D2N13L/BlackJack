package project;

import java.util.Scanner;
import java.util.Random;

public class Project_Random_v2 {

    /*                                                                                                                                             
     *This was mostly made by Daniel , With assistence from Nir and along with almog and edi 
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int add, PTotal = 0, DTotal = 0, another, DealerShape = 0, DramaticPause = 2000, money = 50, bet;
        int[] Player = new int[8];
        int[] Shape = new int[8];
        String anotherCard = "y", playAgain = "y";
        while ("y".equals(playAgain)) {
            if (money != 0) {
                for (int i = 0; i < 8; i++) { // Reset
                    Player[i] = 0;
                    Shape[i] = 0;
                }
                add = 2;
                DealerShape = 0;
                DramaticPause = 2000;
                anotherCard = "y";
                PTotal = 0;
                DTotal = 0;
                System.out.println("You have " + money + " $");
                System.out.println("how much money would you like to bet?");
                bet = input.nextInt();
                while (bet <= 0 || bet > money) {
                    System.err.println("Please enter the correct amount");
                    bet = input.nextInt();
                }
                money = money - bet;
                if (money == 0) {
                    System.out.println("You're a bold one, aren't you?");
                }
                Player[0] = random.nextInt(10) + 1;
                Shape[0] = random.nextInt(4) + 1;
                Player[1] = random.nextInt(10) + 1;
                Shape[1] = random.nextInt(4) + 1;
                for (int repeat = 0; repeat < 2; repeat++) {
                    PTotal = PTotal + Player[repeat];
                }
                System.out.println("---------------------------------------------------------");
                System.out.println("Your Cards: ");

                switch (Player[0]) {
                    case 1:
                        if (Player[0] == 1) {
                            if (Shape[0] == 3) // 3 is diamonds
                            {
                                System.out.println("*---------*" + "\n"
                                        + "|A        |" + "\n"
                                        + "|    .    |" + "\n"
                                        + "|   < >   |" + "\n"
                                        + "|    .    |" + "\n"
                                        + "|        V|" + "\n"
                                        + "*---------*");

                            }
                            if (Shape[0] == 2) // 2 is hearts
                            {
                                System.out.println("*--------*" + "\n"
                                        + "|A       |" + "\n"
                                        + "| **  ** |" + "\n"
                                        + "|*   *  *|" + "\n"
                                        + "| *    * |" + "\n"
                                        + "|    *  V|" + "\n"
                                        + "*--------*");

                            }
                            if (Shape[0] == 1) // 1 is clover
                            {
                                System.out.println(" *---------*" + "\n"
                                        + "|A        |" + "\n"
                                        + "|    .    |" + "\n"
                                        + "|   ( )   |" + "\n"
                                        + "|  (_|_)  |" + "\n"
                                        + "|    |   V|" + "\n"
                                        + "*---------*");

                            }
                            if (Shape[0] == 4) // 4 is spades
                            {
                                System.out.println(" *---------*" + "\n"
                                        + "|A        |" + "\n"
                                        + "|    .    |" + "\n"
                                        + "|   /. |  |" + "\n"
                                        + "|  <_._>  |" + "\n"
                                        + "|    |   V|" + "\n"
                                        + "*---------*");

                            }
                        }
                        break;
                    default:
                        if (Player[0] != 1) {
                            if (Shape[0] == 3) // 3 is diamonds
                            {
                                System.out.println("*---------*" + "\n"
                                        + "|" + Player[0] + "        |" + "\n"
                                        + "|    .    |" + "\n"
                                        + "|   < >   |" + "\n"
                                        + "|    .    |" + "\n"
                                        + "|        " + Player[0] + "|" + "\n"
                                        + "*---------*");

                            }
                            if (Shape[0] == 2) // 2 is hearts
                            {
                                System.out.println("*--------*" + "\n"
                                        + "|" + Player[0] + "       |" + "\n"
                                        + "| **  ** |" + "\n"
                                        + "|*   *  *|" + "\n"
                                        + "| *    * |" + "\n"
                                        + "|    *  " + Player[0] + "|" + "\n"
                                        + "*--------*");

                            }
                            if (Shape[0] == 1) // 1 is clover
                            {
                                System.out.println(" *---------*" + "\n"
                                        + "|" + Player[0] + "        |" + "\n"
                                        + "|    .    |" + "\n"
                                        + "|   ( )   |" + "\n"
                                        + "|  (_|_)  |" + "\n"
                                        + "|    |   " + Player[0] + "|" + "\n"
                                        + "*---------*");

                            }
                            if (Shape[0] == 4) // 4 is spades
                            {
                                System.out.println(" *---------*" + "\n"
                                        + "|" + Player[0] + "        |" + "\n"
                                        + "|    .    |" + "\n"
                                        + "|   /. |  |" + "\n"
                                        + "|  <_._>  |" + "\n"
                                        + "|    |   " + Player[0] + "|" + "\n"
                                        + "*---------*");

                            }
                        }
                        break;
                }
                switch (Player[1]) {
                    case 1:
                        if (Player[1] == 1) {
                            if (Shape[1] == 3) // 3 is diamonds
                            {
                                System.out.println("*---------*" + "\n"
                                        + "|A        |" + "\n"
                                        + "|    .    |" + "\n"
                                        + "|   < >   |" + "\n"
                                        + "|    .    |" + "\n"
                                        + "|        V|" + "\n"
                                        + "*---------*");

                            }
                            if (Shape[1] == 2) // 2 is hearts
                            {
                                System.out.println("*--------*" + "\n"
                                        + "|A       |" + "\n"
                                        + "| **  ** |" + "\n"
                                        + "|*   *  *|" + "\n"
                                        + "| *    * |" + "\n"
                                        + "|    *  V|" + "\n"
                                        + "*--------*");

                            }
                            if (Shape[1] == 1) // 1 is clover
                            {
                                System.out.println(" *---------*" + "\n"
                                        + "|A        |" + "\n"
                                        + "|    .    |" + "\n"
                                        + "|   ( )   |" + "\n"
                                        + "|  (_|_)  |" + "\n"
                                        + "|    |   V|" + "\n"
                                        + "*---------*");

                            }
                            if (Shape[1] == 4) // 4 is spades
                            {
                                System.out.println(" *---------*" + "\n"
                                        + "|A        |" + "\n"
                                        + "|    .    |" + "\n"
                                        + "|   /..   |" + "\n"
                                        + "|  <_._>  |" + "\n"
                                        + "|    |   V|" + "\n"
                                        + "*---------*");

                            }
                        }
                        break;
                    default:
                        if (Player[1] != 1) {
                            if (Shape[1] == 3) // 3 is diamonds
                            {
                                System.out.println("*---------*" + "\n"
                                        + "|" + Player[1] + "        |" + "\n"
                                        + "|    .    |" + "\n"
                                        + "|   < >   |" + "\n"
                                        + "|    .    |" + "\n"
                                        + "|        " + Player[1] + "|" + "\n"
                                        + "*---------*");

                            }
                            if (Shape[1] == 2) // 2 is hearts
                            {
                                System.out.println("*--------*" + "\n"
                                        + "|" + Player[1] + "       |" + "\n"
                                        + "| **  ** |" + "\n"
                                        + "|*   *  *|" + "\n"
                                        + "| *    * |" + "\n"
                                        + "|    *  " + Player[1] + "|" + "\n"
                                        + "*--------*");

                            }
                            if (Shape[1] == 1) // 1 is clover
                            {
                                System.out.println(" *---------*" + "\n"
                                        + "|" + Player[1] + "        |" + "\n"
                                        + "|    .    |" + "\n"
                                        + "|   ( )   |" + "\n"
                                        + "|  (_|_)  |" + "\n"
                                        + "|    |   " + Player[1] + "|" + "\n"
                                        + "*---------*");

                            }
                            if (Shape[1] == 4) // 4 is spades
                            {
                                System.out.println(" *---------*" + "\n"
                                        + "|" + Player[1] + "        |" + "\n"
                                        + "|    .    |" + "\n"
                                        + "|   /..   |" + "\n"
                                        + "|  <_._>  |" + "\n"
                                        + "|    |   " + Player[1] + "|" + "\n"
                                        + "*---------*");

                            }
                        }
                        break;
                }
                System.out.println("Total:  " + Player[0] + "+" + Player[1] + " = " + PTotal);
                System.out.println("----------------------------------------------");
                switch (Player[0]) {
                    case 1: {
                        if (Player[1] == 10) {
                            System.out.println("  ____  _            _    _            _    _ \n"
                                    + " |  _ \\| |          | |  (_)          | |  | |\n"
                                    + " | |_) | | __ _  ___| | ___  __ _  ___| | _| |\n"
                                    + " |  _ <| |/ _` |/ __| |/ / |/ _` |/ __| |/ / |\n"
                                    + " | |_) | | (_| | (__|   <| | (_| | (__|   <|_|\n"
                                    + " |____/|_|\\__,_|\\___|_|\\_\\ |\\__,_|\\___|_|\\_(_)\n"
                                    + "                        _/ |                  \n"
                                    + "                       |__/                   ");
                            anotherCard = "h";
                        }
                        break;
                    }
                    case 10: {
                        if (Player[1] == 1) {
                            System.out.println("  ____  _            _    _            _    _ \n"
                                    + " |  _ \\| |          | |  (_)          | |  | |\n"
                                    + " | |_) | | __ _  ___| | ___  __ _  ___| | _| |\n"
                                    + " |  _ <| |/ _` |/ __| |/ / |/ _` |/ __| |/ / |\n"
                                    + " | |_) | | (_| | (__|   <| | (_| | (__|   <|_|\n"
                                    + " |____/|_|\\__,_|\\___|_|\\_\\ |\\__,_|\\___|_|\\_(_)\n"
                                    + "                        _/ |                  \n"
                                    + "                       |__/                   ");
                            anotherCard = "h";
                        }
                        break;
                    }
                    default:
                        anotherCard.equals("y");
                }
                if (PTotal < 21 && PTotal != 3 && !anotherCard.equals("h")) {
                    System.out.println("Would you like to draw an additional card? y/n:");
                    anotherCard = input.next();
                }
                while (!anotherCard.equals("y") && !anotherCard.equals("n") && !anotherCard.equals("h")) {
                    System.err.println("Error: You have entered the wrong command, please retry");
                    anotherCard = input.next();
                }
                while (anotherCard.equals("y") && PTotal < 21) {
                    Player[add] = random.nextInt(10) + 1;
                    Shape[add] = random.nextInt(4) + 1;
                    System.out.println("Drawing card. Please wait....");
                    PTotal = PTotal + Player[add];
                    add++;
                    System.out.println("Card: ");
                    switch (Player[add - 1]) {
                        case 1:
                            if (Player[add - 1] == 1) {
                                if (Shape[add - 1] == 3) // 3 is diamonds
                                {
                                    System.out.println("*---------*" + "\n"
                                            + "|A        |" + "\n"
                                            + "|    .    |" + "\n"
                                            + "|   < >   |" + "\n"
                                            + "|    .    |" + "\n"
                                            + "|        V|" + "\n"
                                            + "*---------*");

                                }
                                if (Shape[add - 1] == 2) // 2 is hearts
                                {
                                    System.out.println("*--------*" + "\n"
                                            + "|A       |" + "\n"
                                            + "| **  ** |" + "\n"
                                            + "|*   *  *|" + "\n"
                                            + "| *    * |" + "\n"
                                            + "|    *  V|" + "\n"
                                            + "*--------*");

                                }
                                if (Shape[add - 1] == 1) // 1 is clover
                                {
                                    System.out.println(" *---------*" + "\n"
                                            + "|A        |" + "\n"
                                            + "|    .    |" + "\n"
                                            + "|   ( )   |" + "\n"
                                            + "|  (_|_)  |" + "\n"
                                            + "|    |   V|" + "\n"
                                            + "*---------*");

                                }
                                if (Shape[add - 1] == 4) // 4 is spades
                                {
                                    System.out.println(" *---------*" + "\n"
                                            + "|A        |" + "\n"
                                            + "|    .    |" + "\n"
                                            + "|   /..   |" + "\n"
                                            + "|  <_._>  |" + "\n"
                                            + "|    |   V|" + "\n"
                                            + "*---------*");

                                }
                            }
                            break;
                        default:
                            if (Player[add - 1] != 1) {
                                if (Shape[add - 1] == 3) // 3 is diamonds
                                {
                                    System.out.println("*---------*" + "\n"
                                            + "|" + Player[add - 1] + "        |" + "\n"
                                            + "|    .    |" + "\n"
                                            + "|   < >   |" + "\n"
                                            + "|    .    |" + "\n"
                                            + "|        " + Player[add - 1] + "|" + "\n"
                                            + "*---------*");

                                }
                                if (Shape[add - 1] == 2) // 2 is hearts
                                {
                                    System.out.println("*--------*" + "\n"
                                            + "|" + Player[add - 1] + "       |" + "\n"
                                            + "| **  ** |" + "\n"
                                            + "|*   *  *|" + "\n"
                                            + "| *    * |" + "\n"
                                            + "|    *  " + Player[add - 1] + "|" + "\n"
                                            + "*--------*");

                                }
                                if (Shape[add - 1] == 1) // 1 is clover
                                {
                                    System.out.println(" *---------*" + "\n"
                                            + "|" + Player[add - 1] + "        |" + "\n"
                                            + "|    .    |" + "\n"
                                            + "|   ( )   |" + "\n"
                                            + "|  (_|_)  |" + "\n"
                                            + "|    |   " + Player[add - 1] + "|" + "\n"
                                            + "*---------*");

                                }
                                if (Shape[add - 1] == 4) // 4 is spades
                                {
                                    System.out.println(" *---------*" + "\n"
                                            + "|" + Player[add - 1] + "        |" + "\n"
                                            + "|    .    |" + "\n"
                                            + "|   /..   |" + "\n"
                                            + "|  <_._>  |" + "\n"
                                            + "|    |   " + Player[add - 1] + "|" + "\n"
                                            + "*---------*");

                                }
                            }
                    }
                    System.out.println("Total: " + (PTotal - Player[add - 1]) + " + " + Player[add - 1] + " = " + PTotal);
                    anotherCard = "n";
                    if (PTotal < 21 && PTotal != 3 && !anotherCard.equals("h")) {
                        System.out.println("---------------------");
                        System.out.println("Another Card (y/n)?: ");
                        anotherCard = input.next();
                    }
                    if (Player[0] == 1 && Player[1] == 1 && Player[2] == 1) {
                        System.out.println(" __     __                    _       _ \n"
                                + " \\ \\   / /                   (_)     | |\n"
                                + "  \\ \\_/ /__  _   _  __      ___ _ __ | |\n"
                                + "   \\   / _ \\| | | | \\ \\ /\\ / / | '_ \\| |\n"
                                + "    | | (_) | |_| |  \\ V  V /| | | | |_|\n"
                                + "    |_|\\___/ \\__,_|   \\_/\\_/ |_|_| |_(_)\n"
                                + "                                        \n"
                                + "                                        ");
                        System.out.println("You win! Triple Ace!");
                        anotherCard = "h";
                    }
                }
                if (PTotal == 21) {
                    System.out.println("  ____  _            _    _            _    _ \n"
                            + " |  _ \\| |          | |  (_)          | |  | |\n"
                            + " | |_) | | __ _  ___| | ___  __ _  ___| | _| |\n"
                            + " |  _ <| |/ _` |/ __| |/ / |/ _` |/ __| |/ / |\n"
                            + " | |_) | | (_| | (__|   <| | (_| | (__|   <|_|\n"
                            + " |____/|_|\\__,_|\\___|_|\\_\\ |\\__,_|\\___|_|\\_(_)\n"
                            + "                        _/ |                  \n"
                            + "                       |__/                   ");
                }
                while (DTotal < 17 && PTotal <= 21 && anotherCard != "h") {
                    another = random.nextInt(10) + 1;
                    Shape[DealerShape] = random.nextInt(4) + 1;
                    if (DealerShape >= 2) {
                        try {
                            Thread.sleep(DramaticPause);
                        } catch (InterruptedException ex) {
                        }
                    }
                    System.out.println("Dealer drew- " + another);
                    switch (another) {
                        case 1:
                            if (another == 1) {
                                if (Shape[DealerShape] == 3) // 3 is diamonds
                                {
                                    System.out.println("*---------*" + "\n"
                                            + "|A        |" + "\n"
                                            + "|    .    |" + "\n"
                                            + "|   < >   |" + "\n"
                                            + "|    .    |" + "\n"
                                            + "|        V|" + "\n"
                                            + "*---------*");
                                }
                                if (Shape[DealerShape] == 2) // 2 is hearts
                                {
                                    System.out.println("*--------*" + "\n"
                                            + "|A       |" + "\n"
                                            + "| **  ** |" + "\n"
                                            + "|*   *  *|" + "\n"
                                            + "| *    * |" + "\n"
                                            + "|    *  V|" + "\n"
                                            + "*--------*");
                                }
                                if (Shape[DealerShape] == 1) // 1 is clover
                                {
                                    System.out.println(" *---------*" + "\n"
                                            + "|A        |" + "\n"
                                            + "|    .    |" + "\n"
                                            + "|   ( )   |" + "\n"
                                            + "|  (_|_)  |" + "\n"
                                            + "|    |   V|" + "\n"
                                            + "*---------*");
                                }
                                if (Shape[DealerShape] == 4) // 4 is spades
                                {
                                    System.out.println(" *---------*" + "\n"
                                            + "|A        |" + "\n"
                                            + "|    .    |" + "\n"
                                            + "|   /..   |" + "\n"
                                            + "|  <_._>  |" + "\n"
                                            + "|    |   V|" + "\n"
                                            + "*---------*");
                                }
                            }
                            break;
                        default:
                            if (another != 1) {
                                if (Shape[DealerShape] == 3) // 3 is diamonds
                                {
                                    System.out.println("*---------*" + "\n"
                                            + "|" + another + "        |" + "\n"
                                            + "|    .    |" + "\n"
                                            + "|   < >   |" + "\n"
                                            + "|    .    |" + "\n"
                                            + "|        " + another + "|" + "\n"
                                            + "*---------*");
                                }
                                if (Shape[DealerShape] == 2) // 2 is hearts
                                {
                                    System.out.println("*--------*" + "\n"
                                            + "|" + another + "       |" + "\n"
                                            + "| **  ** |" + "\n"
                                            + "|*   *  *|" + "\n"
                                            + "| *    * |" + "\n"
                                            + "|    *  " + another + "|" + "\n"
                                            + "*--------*");
                                }
                                if (Shape[DealerShape] == 1) // 1 is clover
                                {
                                    System.out.println(" *---------*" + "\n"
                                            + "|" + another + "        |" + "\n"
                                            + "|    .    |" + "\n"
                                            + "|   ( )   |" + "\n"
                                            + "|  (_|_)  |" + "\n"
                                            + "|    |   " + another + "|" + "\n"
                                            + "*---------*");
                                }
                                if (Shape[DealerShape] == 4) // 4 is spades
                                {
                                    System.out.println(" *---------*" + "\n"
                                            + "|" + another + "        |" + "\n"
                                            + "|    .    |" + "\n"
                                            + "|   /..   |" + "\n"
                                            + "|  <_._>  |" + "\n"
                                            + "|    |   " + another + "|" + "\n"
                                            + "*---------*");
                                }
                            }
                    }
                    DealerShape++;
                    DTotal = DTotal + another;
                }

                if (PTotal > 21 && anotherCard != "h") {
                    System.out.println("You: " + PTotal + " Dealer: " + DTotal);
                    System.out.println(" __     __           _                _ \n"
                            + " \\ \\   / /          | |              | |\n"
                            + "  \\ \\_/ /__  _   _  | | ___  ___  ___| |\n"
                            + "   \\   / _ \\| | | | | |/ _ \\/ __|/ _ \\ |\n"
                            + "    | | (_) | |_| | | | (_) \\__ \\  __/_|\n"
                            + "    |_|\\___/ \\__,_| |_|\\___/|___/\\___(_)\n"
                            + "                                        \n"
                            + "                                        ");
                    System.out.println("You lost, Dealer won! You have overdrew!");
                    System.out.println("You lost" + bet + " $");
                }
                if (anotherCard.equals("n") && PTotal <= 21) {
                    if (DTotal < PTotal && PTotal <= 21) {
                        System.out.println("You: " + PTotal + " Dealer: " + DTotal);
                        System.out.println(" __     __                    _       _ \n"
                                + " \\ \\   / /                   (_)     | |\n"
                                + "  \\ \\_/ /__  _   _  __      ___ _ __ | |\n"
                                + "   \\   / _ \\| | | | \\ \\ /\\ / / | '_ \\| |\n"
                                + "    | | (_) | |_| |  \\ V  V /| | | | |_|\n"
                                + "    |_|\\___/ \\__,_|   \\_/\\_/ |_|_| |_(_)\n"
                                + "                                        \n"
                                + "                                        ");
                        System.out.println("You win! You have more points!");
                        System.out.println("You won" + bet + " $");
                        money = money + bet * 2;
                    }
                    if (DTotal > PTotal && DTotal <= 21) {
                        System.out.println("You: " + PTotal + " Dealer: " + DTotal);
                        System.out.println(" __     __           _                _ \n"
                                + " \\ \\   / /          | |              | |\n"
                                + "  \\ \\_/ /__  _   _  | | ___  ___  ___| |\n"
                                + "   \\   / _ \\| | | | | |/ _ \\/ __|/ _ \\ |\n"
                                + "    | | (_) | |_| | | | (_) \\__ \\  __/_|\n"
                                + "    |_|\\___/ \\__,_| |_|\\___/|___/\\___(_)\n"
                                + "                                        \n"
                                + "                                        ");
                        System.out.println("You lost! Dealer has more points!");
                        System.out.println("You lost " + bet + " $");
                    }
                    if (DTotal > 21) {
                        System.out.println("You:" + PTotal + " Dealer: " + DTotal);
                        System.out.println(" __     __                    _       _ \n"
                                + " \\ \\   / /                   (_)     | |\n"
                                + "  \\ \\_/ /__  _   _  __      ___ _ __ | |\n"
                                + "   \\   / _ \\| | | | \\ \\ /\\ / / | '_ \\| |\n"
                                + "    | | (_) | |_| |  \\ V  V /| | | | |_|\n"
                                + "    |_|\\___/ \\__,_|   \\_/\\_/ |_|_| |_(_)\n"
                                + "                                        \n"
                                + "                                        ");
                        System.out.println("You win! Dealer Overdrewed!");
                        System.out.println("You won " + bet + " $");
                        money = money + bet * 2;
                    }
                    if (DTotal == PTotal) {
                        System.out.println("You: " + PTotal + " Dealer: " + DTotal);
                        System.out.println("  _____                     \n"
                                + " |  __ \\                    \n"
                                + " | |  | |_ __ __ ___      __\n"
                                + " | |  | | '__/ _` \\ \\ /\\ / /\n"
                                + " | |__| | | | (_| |\\ V  V / \n"
                                + " |_____/|_|  \\__,_| \\_/\\_/  \n"
                                + "                            \n"
                                + "                            ");
                        System.out.println("It's a draw!, You got your money back!");
                        money = +bet;
                    }
                }
                System.out.println("Would you like to play again?");
                playAgain = input.next();
                while (!playAgain.equals("y") && !playAgain.equals("n")) {
                    System.err.println("Error: You have entered the wrong command, please retry");
                    playAgain = input.next();
                }
                if (playAgain.equals("n")) {
                    System.out.println("Your final amount of money is " + money + " $");
                    System.out.println("   _____                 _ _                \n"
                            + "  / ____|               | | |               \n"
                            + " | |  __  ___   ___   __| | |__  _   _  ___ \n"
                            + " | | |_ |/ _ \\ / _ \\ / _` | '_ \\| | | |/ _ \\\n"
                            + " | |__| | (_) | (_) | (_| | |_) | |_| |  __/\n"
                            + "  \\_____|\\___/ \\___/ \\__,_|_.__/ \\__, |\\___|\n"
                            + "                                  __/ |     \n"
                            + "                                 |___/      \n"
                            + "");
                }
            } else {
                System.out.println("You don't have any money to bet with...");
                playAgain = "n";
            }
        }
    }
}
