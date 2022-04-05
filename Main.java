import java.util.Random;

class Main {
  public static void main(String[] args) {
    Random generator = new Random();
    int[] tab = new int[10];
    int pom;
    double wynik=0;

    for(int i=0;i<10;i++){
      pom=generator.nextInt(50);
      tab[i]=pom;
    }

    for(int j=0;j<10;j++){
      wynik=wynik+tab[j];
    }

    wynik=wynik/10;

    System.out.println("Srednia wynosi: "+wynik);
    
  }
}