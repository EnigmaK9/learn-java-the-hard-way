public class EscapeSequencesComments {
    public static void main( String[] args ) {
        System.out.println( "Learn\tJava\n\tThe\nHard\tWay\n\n" );
        System.out.println( "\tLearn Java The \"Hard\" Way\n" );
        System.out.println( "Hello\n" );
        System.out.println( "Jello\by\n" );
        System.out/* testing */.println( "Hard to believe, eh?");
        System.out.println( "Surprised? /* abcde */ Or what did you expect?" );
        System.out.println( "\\ // -=- \\ //" );
        System.out.println( " \\\\ \\\\\\ \\\\\\\\ ");
        System.out.println( "I hope you understand \"escape sequences\" now. \n");
    }
}

