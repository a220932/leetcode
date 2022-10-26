class Solution {
    public String getHint(String secret, String guess) {
        int a = 0, b = 0;
        for (int i = 0; i < secret.length(); i++) {
            if (secret.charAt(i) == guess.charAt(i)) {
                secret = remove(secret, i);
                guess = remove(guess, i--);
                a++;
            }
        }
        for (int i = 0; i < secret.length(); i++) {
            for (int j = 0; j < guess.length(); j++) {
                if (secret.charAt(i) == guess.charAt(j)) {
                    secret = remove(secret, i--);
                    guess = remove(guess, j--);
                    b++;
                    break;
                }
            }
        }
        return a + "A" + b + "B";
    }
    public String remove(String s, int j){
        s = s.substring(0, j) + s.substring(j + 1);
        return s;
    }
}
