package part1;


public class myTest {
@org.junit.Test
    public static void main(String[] args) {
        String inputText = "The quick brown fox jumps over the lazy dog";
        String expectedOutputText = "The quick cat brown fox jumps cat the lazy dog";
        String replacement = "cat";
        int length = 3;

        String actualOutputText = Main.operationsOnStrings(inputText, replacement, length);

        if (actualOutputText.equals(expectedOutputText)) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed. Expected output: \"" + expectedOutputText + "\", but actual output: \"" + actualOutputText + "\"");
        }
    }



}
