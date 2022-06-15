import java.util.Random;
import java.util.Scanner;

public class DogGenetics {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int percent=100;
        int dogPercent;

        System.out.println("what is the name of your dog");
        String DogName = input.nextLine();
        System.out.println("Well then, I have this highly reliable report on " + DogName+ " Esquire's prestigious background right here.");
        System.out.println(DogName + " Esquire is:");

        for (int i =0; i <5 ; i++){
            switch(i){
                case 0:
                    dogPercent = rand.nextInt(percent);
                    System.out.println(dogPercent + "% St. Bernard");
                    //used to make user total percent is 100%
                    percent -= dogPercent;
                    break;
                case 1:
                    dogPercent = rand.nextInt(percent);
                    System.out.println(dogPercent + "% Chihuahua");
                    percent -= dogPercent;
                    break;
                case 2:
                    dogPercent = rand.nextInt(percent);
                    System.out.println(dogPercent + "% Dramatic RedNosed Asian Pug");
                    percent -= dogPercent;
                    break;
                case 3:
                    dogPercent = rand.nextInt(percent);
                    System.out.println(dogPercent + "% Common Cur");
                    percent -= dogPercent;
                    break;
                default:
                    System.out.println(percent + "% King Doberman");
                    break;
            }
            System.out.println("Wow, that's QUITE the dog!");
        }
    }
}
