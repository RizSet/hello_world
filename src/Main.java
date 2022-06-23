import javax.security.auth.login.CredentialNotFoundException;
import java.util.Random;

public class Main {

    public static void main (String[] args) {
        {
       /* boolean randomBoolean = getRandomBoolean();
        System.out.println(randomBoolean);

        if (randomBoolean) {
            System.out.println("truuuuuu");
            System.out.println("news is 18 + add");
        }
        System.out.println("news displayaed");
    */}

        int randomInt = getRandomInt();
        int result;
        /* if(randomInt > 10){
            result = 1;
        } else {
            result = 2;
        }

         */
        System.out.println(randomInt);

       /* switch (randomInt){
            case 1:
                System.out.println("One");
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Tree");
                break;
            default:
                System.out.println("Wrong number");
        }

        */







    }



    public static boolean getRandomBoolean() {
        Random random = new Random();
        return random.nextBoolean();
    }

    public static int getRandomInt(){
        Random random = new Random();
        return random.nextInt(2);
    }
}

