import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReturnsDuplicates {
    public static void main(String[] args) throws Exception {
        List<String> arr1 = new ArrayList<>();
        List<String> arr2 = new ArrayList<>();
        List<String> arrDuplicates = new ArrayList<>();

        System.out.println("Adicione os elementos do primeiro array");
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        arr1.add(word);

        while (!word.equals("")) {
            System.out.println("Adicione o próximo elemento ou aperte enter para encerrar");
            word = input.nextLine();
            if (word.equals(""))
                continue;
            arr1.add(word);
        }

        System.out.println("--------------");
        System.out.println("Adicione os elementos do segundo array");
        word = input.nextLine();
        arr2.add(word);

        while (!word.equals("")) {
            System.out.println("Adicione o próximo elemento ou aperte enter para encerrar");
            word = input.nextLine();
            if (word.equals(""))
                continue;
            arr2.add(word);
        }

        input.close();

        arr1.stream().forEach(el -> {
            if (arr2.contains(el)) {
                arrDuplicates.add(el);
            }
            ;
        });

        System.out.println(arr1);
        System.out.println(arr2);
        System.out.println("Os elementos duplicados são:");
        System.out.println(arrDuplicates);
    }
}