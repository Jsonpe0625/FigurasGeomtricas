import java.util.Scanner;
import co.com.bancolombia.modelo.Rectangulo;

class Main {
  public static void main(String[] args) {
    System.out.println("fIGURAS GEOMETRICAS!");
    System.out.println("Elige el tipo de figura!");
    System.out.println("1 - figura Rectangulo");
    System.out.println("2 - figura Triagulo");
    System.out.println("3 - figura circulo");
    System.out.println("4 - figura Cuadrado");
    Scanner entrada = new Scanner(System.in);
    
    String opcion = entrada.next();
    
    if(opcion.equals("1")){
      System.out.print("Escojio Rectangulo");
      System.out.print("Ingrese la base");
      Scanner baseScanner =new Scanner(System.in);
      int base=baseScanner.nextInt();
      System.out.print("Ingrese la Altura");
      Scanner alturaScanner =new Scanner(System.in);
      int altura=alturaScanner.nextInt();
      Rectangulo rectangulo = new Rectangulo(base,altura);
      System.out.print("Area del Rectagulo es: "
      +rectangulo.getArea());
      System.out.print("Area del Perimetro es: "
      +Perimetro.getPerimetro());
    }else if (opcion.equals("1")){
      System.out.print("Escojio Triagulo");
    }else if (opcion.equals("1")){
      System.out.print("Escojio circulo");
    }else if (opcion.equals("1")){
      System.out.print("Escojio cuadrado");
    }


  }
}