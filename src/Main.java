import java.util.*;
// Napisz program, który pozwoli zsumować dowolną ilość liczb od użytkownika.
// Aplikacja powinna przerwać wczytywanie liczb, gdy użytkownik wprowadzi polecenie "exit".


 class SumNumber {
    private static Scanner sc= new Scanner(System.in);
    private static final String EXIT="exit";

    public static void main(String[] args) {


        List<Double> numbers= new ArrayList<>();
        fillList(numbers);
        printDAta(numbers);



    }

     private static void printDAta(List<Double> list) {
         if(!list.isEmpty()) {              //Jeżeli lista nie jest pusta
             StringBuilder sb = new StringBuilder();
             double sum = 0;  // zmienna pomocnicza
             for (Double d : list) {
                 sb.append(d);
                 sb.append("+");
                 sum +=d;
             }
             //5.0+10.0+15.0=
             sb.replace(sb.length()-1, sb.length(), "=");
             sb.append(sum);
             System.out.println(sb.toString());  //zamiana StringBuildera na Stringa
             }
             
         }


     private static void fillList(List<Double> numbers) {
        System.out.println("Podaj liczbę lub wpisz exit");
        String input = sc.nextLine();

        if (input.equals(EXIT))
            return;

        try{
            Double num = Double.valueOf(input);     //Zamiana tekstu na liczbę
            numbers.add(num);   //dodawanie do listy
        } catch (NumberFormatException e){
            System.err.println("Liczba w nieprawidłowym formacjie)");
        }
        fillList(numbers);   //rekurencyjne wywołanie
    }

    private static void printList(List<Double> list){
        for (Double element: list){
            System.out.println(element);
        }

    }

    }