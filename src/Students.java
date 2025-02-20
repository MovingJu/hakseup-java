import java.util.ArrayList;
import java.util.Scanner;

public class Students {
    public static void main(String[] args){

        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> score = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("학생 수: ");
        int size = scanner.nextInt();

        for(int i=0; i<size; i++){
            System.out.println("학생 #" + i + 1 + " 이름: ");
            names.add(scanner.nextLine());
            System.out.println("학생 #" + i + 1 + " 성적: ");
            score.add(scanner.nextInt());
        }
        
        double avg = 0;

        for(int i=0; i<size; i++){
            avg += score.get(i);
        }
        avg /= size;

    }
}
