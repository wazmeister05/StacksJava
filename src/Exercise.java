
import java.util.Stack;

public class Exercise {


    /** Tests if delimiters in the given expression are properly matched. */
    public static boolean isMatched(String expression) {
        final String opening  = "({[";                // opening delimiters
        final String closing  = ")}]";                // respective closing delimiters
        StackADT<Character> buffer = new LinkedListStack<>();
        for (char c : expression.toCharArray()) {
            if (opening.indexOf(c) != -1)               // this is a left delimiter
                buffer.push(c);
            else if (closing.indexOf(c) != -1) {        // this is a right delimiter
                if (buffer.isEmpty())                     // nothing to match with
                    return false;
                if (closing.indexOf(c) != opening.indexOf(buffer.pop()))
                    return false;                           // mismatched delimiter
            }
        }
        return buffer.isEmpty();                      // were all opening delimiters matched?
    }

//    final static String[] valid = {
//            "()(()){([()])}",
//            "( ) ( ( ) ) {( [ ( )  ] ) } ",
//            "(3) (3 + (4 - 5) ) {( [ ( )  ] ) } ",
//            "((()(()){([()])}))",
//            "[(5+x)-(y+z)]"
//    };
//
//    final static String[] invalid = {
//            ")(()){([()])}",
//            "({[])}",
//            "("
//    };

    final static String[] valid = {
        "(((()))){}{{{}}}[()]",
            "The quick brown fox jumped over the lazy dog",
            "{{(({{[[]]}}))}}",
            "{{(([[]]))}}",
        "(55+2){public static void main(String[] args)}"
    };

    final static String[] invalid = {
            "{}{))()()(){}{}{}{}}{}}}{{{{}}{}{[][}{]{][[[[}{][}{}[0()))",
            "egpiengoebgaoienfgqpiegbwonwe{jpqiwegbnoqienpqojeoquhfoiJwqegjo",
            "{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{)"
    };


    public static void main(String[] args) {

        for (String s : valid)
            if (!isMatched(s))
                System.out.println("Error evaluating valid: " + s);

        for (String s : invalid)
            if (isMatched(s))
                System.out.println("Error evaluating invalid: " + s);

    }
}
