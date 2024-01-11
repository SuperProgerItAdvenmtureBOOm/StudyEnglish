package Checks;
//\n code is - 10

public class TranslationCheck {
    public static boolean EnglishWordCheck(String english){
        for(char element :english.toCharArray()){
            if(((int)element < 65 || (int)element > 90 )&&((int)element < 97 || (int)element > 122)) {
                if(element != ' ')
                    return false;
            }
        }
        return true;
    }
    public static boolean RussianWordCheck(String russian) {
        for (char element : russian.toCharArray()) {
            if (((int) element < 1040 || (int) element > 1103)) {
                if(element != ' ')
                    return false;
            }
        }
        return true;
    }

}
