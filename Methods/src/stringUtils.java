public class stringUtils {

    public String findMiddleCharacters(String text) {
        if (text.length() % 2 == 0) {
            int index = (text.length() / 2);
            int index1 = index - 1;
            int index2 = index;
            return String.valueOf(text.charAt(index1)) + String.valueOf(text.charAt(index2));
        } else {
            int index = (text.length() - 1) / 2;
            return String.valueOf(text.charAt(index));
        }
    }

    public int countWords(String sentence) {
        int counting = 0;
        for (int i = 0; i < sentence.length(); i++) {
            char symbol = sentence.charAt(i);
            if (symbol == ' ') {
                counting++;
            }
        }
        return counting + 1;
    }

}
