public class Vowels {
    public static void main(String[] args) {
        String str = "hello mani! how are you";
        //str = str.toLowerCase();
        int vowelcount = 0;
        for(int i=0 ; i< str.length() ; i++){
            char ch =str.charAt(i);
            if(ch == 'a' ||ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vowelcount++;
            }
        }
        System.out.println("NUMBER OF VOWELS : " + vowelcount);
    }
    
    
}
