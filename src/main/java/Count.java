public class Count {

    /*
         a program that counts letters,numbers, space etc and other character in an string;
     */

    public static void main(String[] args) {
       // count("Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33");
        count(" aproko don show 1323?:>?");
    }



    public static void count (String word){

        char [] ch = word.toCharArray();
        int letter = 0;
        int space = 0;
        int num = 0;
        int other = 0;
        for(int i = 0; i < word.length(); i++) {

            if (Character.isDigit(ch[i])) {
                num++;
            } else if (Character.isLetter(ch[i])) {
                letter++;
            } else if (Character.isSpaceChar(ch[i])) {
                space++;
            } else {
                other++;
            }

            System.out.println("letter is :" + letter);
            System.out.println("other is :" + other);
            System.out.println("space is :" + space);
            System.out.println("num is :" + num);
            System.out.println("total is :" + letter + other + space + num);

        }



    }










}
