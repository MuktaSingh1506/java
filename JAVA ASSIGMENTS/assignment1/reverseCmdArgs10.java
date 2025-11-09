package assignment1;

public class reverseCmdArgs10 {
    public static void main(String[] args) {
        System.out.println("Number of Command Line Argument = " + args.length);
        for (int i = args.length -1; i >=0 ; i--) {
            System.out.printf("Command Line Argument %d is %s\n", i, args[i]);
        }
    }
}
