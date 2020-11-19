import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int points;
        points = 10;
        boolean run = true;

        ArrayList<String> movies = new ArrayList<>();
        File file = new File("movies.txt");

        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                movies.add(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("file does not exist");
        }

        int randomMovie;
        randomMovie = (int) (Math.random() * movies.size());
        String secretRandom = movies.get(randomMovie);
        secretRandom = secretRandom.replaceAll("[a-zA-Z]", "_");

        System.out.println(secretRandom);
        //System.out.println(movies.get(randomMovie));


        while (run){
            System.out.println("Pick a letter");
            Scanner scanner = new Scanner(System.in);
            if (scanner.equals(secretRandom)) {
                
                break;
            }
        }


        /*
        {
            while (run) {
                System.out.println("Pick letter");
                Scanner scanner = new Scanner(System.in);
                for(int i = 0; i > secretRandom.length(); i++ ) {
                    if (scanner == secretRandom[i]) {

                    }
                }
            }
        }

        String letter = scanner.nextLine();

        if (letter.matches("[a-zA-Z]")) {

        }
        */

    }


}
