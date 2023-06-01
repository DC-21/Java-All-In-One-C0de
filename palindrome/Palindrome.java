class Palindrome{
    public static void main(String[] args){
        String input = "radar";

        boolean isPalindrome = true;

        for(int i = 0; i < input.length()/2; i++){
            if(input.charAt(i) != input.charAt(input.length()-i-1)){
                isPalindrome = false;
                break;
            }
        }
    }
}