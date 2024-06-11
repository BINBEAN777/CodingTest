package src.programmers;

public class pro7 {
    public String solution(String s) {
        StringBuilder answerfake = new StringBuilder();
        char[] charList = s.toCharArray();
        boolean upper = true;
        for (int i = 0; i < charList.length; i++) {
            if (!Character.isAlphabetic(charList[i])) {
                upper = true;
            } else {
                if (upper) {
                    charList[i] = Character.toUpperCase(charList[i]);
                    upper = false;
                } else {
                    charList[i] = Character.toLowerCase(charList[i]);
                    upper = true;
                }
            }
            answerfake.append(charList[i]);
        }
        String answer = answerfake.toString();
        return answer;
    }
}
