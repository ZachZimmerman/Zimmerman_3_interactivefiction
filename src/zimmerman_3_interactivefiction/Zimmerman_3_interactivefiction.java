package zimmerman_3_interactivefiction;

import java.util.Scanner;

public class Zimmerman_3_interactivefiction { //Start of Program

    static Scanner sc = new Scanner(System.in);
    static String username;
    static int answer;
    static boolean play=true;
    public static void main(String[] args) {
        System.out.println("Whats your name?");
        username = sc.nextLine();
        System.out.println("Hello " + username + " Lets start the game!\n\n");
        start();

    }

    public static void tryagain() {
        System.out.println("You died try again!!!");
    }

    public static void death() {
        System.out.println("You died try again!!!");
    }

    public static void start() {
        System.out.println("You have began your journey home, after 10 years away from home. \nYou're on your merry way and run into a fork in the road\n");
        System.out.println("1. Turn Right \n\n2.Turn Left ");
        answer = sc.nextInt();
        if (answer == 1) {
            turnedright();

        }
        else if (answer == 2) {
            //System.out.println("You turned left and fell off some invisible revine.LOL GG M8 UNINSTALL");  
            death();
        }
    }

    public static void turnedright() {
        System.out.println("You see a vilage in the distance that is on fire!");
        System.out.println("You can run to the vilage in an attempt to help.");
        System.out.println("Or you can continue down your path towards home\n");
        System.out.println("1.Run to the Vilage \n\n2.Go home");
        answer = sc.nextInt();

        if (answer == 1) {
            System.out.println("You were able to save a young boy whos family died in the fire. He now follows you helping you find food and other cool resources\n");
            savedboy();
        }
        else if (answer == 2) {
            System.out.println("A few minutes down the path you hear a explosin and lots of screams. You won't sleep well tonight\n\n");
            System.out.println("You wake up sleepless and acidently turn around. Before you relize your mistake you slip and fall into a raging river and get swept away.");
            tryagain();
        }

    }

    public static void savedboy() {
        System.out.println("You wake up early and hear a rustling in a nere by bush.");
        System.out.println("You can ignore it and find clean water and something to eat\n\n");
        System.out.println("Or you can go and investigate");
        System.out.println("1.Ignore\n2.Investigate");
        answer = sc.nextInt();

        if (answer == 1) {
            ignore();
        }

        else if (answer == 2) {
            investigate();
        }

    }

    public static void investigate() {
        System.out.println("You walk behind the bush and there was nothing, so you continue to find something to eat");
        System.out.println("While you were gone the boy disappeared.It looks like there was a altercation, but you didn't hear anything...");
        theboyisgone();
    }

    public static void ignore() {
        System.out.println("You got breakfast, but when you returned he was GONE!");
        theboyisgone();
    }

    public static void theboyisgone() {
        System.out.println("YOU NEED TO FIND HIM!!!\n\n");
        System.out.println("Or do you...");
        System.out.println("1.Go and Find Him\n2.Leave and go home.");
        answer = sc.nextInt();
        if (answer == 1) {
            findboy();
        } else if (answer == 2) {
            leaveboy();
        }
    }

    public static void findboy() {
        System.out.println("you take a breath and notice some footprints\nThe prints lead to a cliff face with a small cave in it.");
        System.out.println("The boy is tied up to a wall and the kidnapper is at his desk. He looks to be passed out with a bottle of something next to him.");
        System.out.println("The kidnapper jumps up as you near him! He smacks you with the bottle. You see stars but you come back to your senses quickly.");
        System.out.println("He hits you again this time drawing blood. The boy kicks a dagger to you, you stab the kidnapper and he falls with a scream");
        System.out.println("You untie him and camp there for the night.");
        System.out.println("When you wake up you continue home");
        System.out.println("You finally make it home with the boy as a part of the family. Everybody is happy to see you and welcomes the boy with open arms");
        theend();
    }

    public static void leaveboy() {
        System.out.println("You head to the nearest tavern to drink n' stuff.\n");
        System.out.println("You decided to finish your journey home with the boy in your thoughts, but you make it home safe n' sound\n\n");
        theend();
    }

    public static void theend() {
        System.out.println("THE END");
    }
} //End of Program
