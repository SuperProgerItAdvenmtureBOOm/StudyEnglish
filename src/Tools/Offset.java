package Tools;

public class Offset {
    static final int RUSSIAN_LOWER_RANGE = 1072;
    static final int RUSSIAN_UPPER_RANGE = 1103;
    static final int ENGLISH_LOWER_RANGE = 97;
    static final int ENGLISH_UPPER_RANGE = 122;
    static final int OFFSET_LOWER_RANGE = 1;
    static final int OFFSET_UPPER_RANGE = 9;
    public static String moveLine(String str,int offset){
        StringBuilder stringBuilder = new StringBuilder();
        int counter = 0;
        for (char c:str.toCharArray()) {
            stringBuilder.append(offset(c,offset));
        }
        return stringBuilder.toString();
    }

    //make Private further!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    public static char offset(char c,int offset){
        char newC = (char) (c+offset);
        int UpperRange = 0;
        int LowerRange = 0;
        if(c >= RUSSIAN_LOWER_RANGE && c <= RUSSIAN_UPPER_RANGE)
        {//russian
            UpperRange = RUSSIAN_UPPER_RANGE;
            LowerRange = RUSSIAN_LOWER_RANGE;
        }
        if(c >= ENGLISH_LOWER_RANGE && c <= ENGLISH_UPPER_RANGE)
        {//english
            UpperRange = ENGLISH_UPPER_RANGE;
            LowerRange = ENGLISH_LOWER_RANGE;
        }
        //if its offset
        if(c >= OFFSET_LOWER_RANGE && c <= OFFSET_UPPER_RANGE)
        {//english
            return incryptOffset(c);
        }

            if(!(newC >= LowerRange && newC <= UpperRange)){
                newC = (char)(LowerRange + newC-UpperRange-1);
            }
            return newC;
    }

    private static char incryptOffset(char c){
        return (char)(c+32);
    }
    private static char decryptOffset(char c){
        return (char)(c-32);
    }
}
