import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Wybierz działanie: ");
    System.out.println("1-Suma");
    System.out.println("2-Róznica");
    System.out.println("3-Iloczyn ");
    System.out.println("4-Iloraz ");
    System.out.println("Twój wybór:");
    int wyb = scanner.nextInt();
    
    System.out.print("Podaj pierwsza liczbę (a): ");
    double a = scanner.nextDouble();

    System.out.print("Podaj pierwsza liczbę (b): ");
    double b = scanner.nextDouble();
  
    switch(wyb){
      case 1:
        System.out.println("Suma wynosi: " + (a + b));
        break;
        case 2:
        System.out.println("Różnica wynosi: " + (a - b));
        break;
        case 3:
        System.out.println("Iloczyn wynosi: " + (a * b));
        break;
        case 4:
        if (b==0){
          System.out.println("Błąd: Nie można dzielić przez zero!");
        }else{
          System.out.println("Iloraz wynosi: " + (a / b));
        }
        break;
      default:
        System.out.println("Błąd: Wybrano nieprawidłowe działanie.");
        break;
    }
      
   scanner.close();
  }


}