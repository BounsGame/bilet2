public class Main {
    public static void main (String[] args){

        StringBuilder palyndrom = new StringBuilder("дед");
        if (palyndrom.toString().equals(palyndrom.reverse().toString())){
            System.out.println("слово палиндром");
        }else System.out.println("слово не палиндром");

        if (palyndrom.toString().contentEquals(palyndrom.reverse()))
        {System.out.println("слово палиндром");
        }else System.out.println("слово не палиндром");}
}

