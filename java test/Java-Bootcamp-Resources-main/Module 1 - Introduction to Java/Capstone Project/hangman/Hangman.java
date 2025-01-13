import java.util.Scanner;

public class Hangman {

    public static String[] words = { "ant", "baboon", "badger", "bat", "bear", "beaver", "camel",
            "cat", "clam", "cobra", "cougar", "coyote", "crow", "deer",
            "dog", "donkey", "duck", "eagle", "ferret", "fox", "frog", "goat",
            "goose", "hawk", "lion", "lizard", "llama", "mole", "monkey", "moose",
            "mouse", "mule", "newt", "otter", "owl", "panda", "parrot", "pigeon",
            "python", "rabbit", "ram", "rat", "raven", "rhino", "salmon", "seal",
            "shark", "sheep", "skunk", "sloth", "snake", "spider", "stork", "swan",
            "tiger", "toad", "trout", "turkey", "turtle", "weasel", "whale", "wolf",
            "wombat", "zebra" };

    public static String[] gallows = { "+---+\n" +
            "|   |\n" +
            "    |\n" +
            "    |\n" +
            "    |\n" +
            "    |\n" +
            "=========\n",

            "+---+\n" +
                    "|   |\n" +
                    "O   |\n" +
                    "    |\n" +
                    "    |\n" +
                    "    |\n" +
                    "=========\n",

            "+---+\n" +
                    "|   |\n" +
                    "O   |\n" +
                    "|   |\n" +
                    "    |\n" +
                    "    |\n" +
                    "=========\n",

            " +---+\n" +
                    " |   |\n" +
                    " O   |\n" +
                    "/|   |\n" +
                    "     |\n" +
                    "     |\n" +
                    " =========\n",

            " +---+\n" +
                    " |   |\n" +
                    " O   |\n" +
                    "/|\\  |\n" + // if you were wondering, the only way to print '\' is with a trailing escape
                                  // character, which also happens to be '\'
                    "     |\n" +
                    "     |\n" +
                    " =========\n",

            " +---+\n" +
                    " |   |\n" +
                    " O   |\n" +
                    "/|\\  |\n" +
                    "/    |\n" +
                    "     |\n" +
                    " =========\n",

            " +---+\n" +
                    " |   |\n" +
                    " O   |\n" +
                    "/|\\  |\n" +
                    "/ \\  |\n" +
                    "     |\n" +
                    " =========\n" };

    public static void main(String[] args) {
        String word = words[randomIndex(words)];
        String hiddenWord = hiddenWord(word);
        String missedChar = "";
        int mistakes = 0;
        while (mistakes < 6) {
            System.out.println(gallows[mistakes]);
            printHiddenWord(hiddenWord);
            if (!hiddenWord.contains("_")) {
                System.out.println("GOOD WORK!");
                System.exit(0);
            }
            System.out.println("Misses:\t" + missedChar + "\n");
            char guess = guessChar();
            if (guessCorrect(guess, word)) {
                hiddenWord = updateHiddenWord(guess, word, hiddenWord);
            } else {
                missedChar += guess;
                mistakes++;
            }

        }
        System.out.println(gallows[mistakes]);
        System.out.println("RIP!\n");
        System.out.println("The word was: " + word);
    }

    public static int randomIndex(String[] words) {
        int len = words.length;
        return (int) (Math.random() * len);
    }

    public static String hiddenWord(String word) {
        String hiddenWord = "";
        for (int i = 0; i < word.length(); i++) {
            hiddenWord += '_';
        }
        return hiddenWord;
    }

    public static void printHiddenWord(String hiddenWord) {
        System.out.print("Word:\t");
        for (char c : hiddenWord.toCharArray()) {
            System.out.print(c + " ");
        }
        System.out.println("\n");
    }

    public static char guessChar() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Guess:\t");
        char guess = sc.nextLine().charAt(0);
        System.out.println();
        sc.close();
        return guess;
    }

    public static boolean guessCorrect(char guess, String word) {
        return word.contains(guess + "");
    }

    public static String updateHiddenWord(char guess, String word, String hiddenWord) {
        char[] hiddenArr = hiddenWord.toCharArray();
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == guess) {
                hiddenArr[i] = guess;
            }
        }
        hiddenWord = String.valueOf(hiddenArr);
        return hiddenWord;
    }
}
