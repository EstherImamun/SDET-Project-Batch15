package class15;

public class MethodPractice2 {

    String reverseStr(String word) {
        String newStr = "";
        for (int i = word.length(); i >= 0; i++) {
            newStr += word.charAt(i);
        }
        return newStr;
    }

    String reverseStr1(String word){
        return new StringBuilder(word).reverse().toString();
    }
    String reverseStr2(String word){
        StringBuilder stringBuilder=new StringBuilder(word);
        stringBuilder.reverse();
        return stringBuilder.toString();
    }


}





