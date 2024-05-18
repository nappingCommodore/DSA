public class Example {

    public static void main(String a[]){
      printPattern();
    }

    public static void printPattern(){
      int i=0;
      int j=0;
      while(i<6) {
        // j = 0;
        while(j<6) {
          System.out.print(" * ");
          j++;
        }
        System.out.println();
        i++;
      }
    }
  }
