import java.util.Scanner;

 class calculatorN {
    public static void main(String[] args)  {
        System.out.println("!!!   WELCOME   !!!\n");
        System.out.printf("Press 1 for addition...........\n");
        System.out.printf("Press 2 for subtraction........\n");
        System.out.printf("Press 3 for multiplication.....\n");
        System.out.printf("Press 4 for division...........\n\n");
        System.out.println("Which operation do you want\n???????????????????????????");
        System.out.printf("Please select an operation.........\n\n");
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number for operation(1,2,3,4): ");
        int OpN  = scanner.nextInt();

        System.out.print("Enter number1: ");
        double n1  = scanner.nextDouble();
        
        System.out.print("Enter number2: ");
        double n2  = scanner.nextDouble();
      
          switch(OpN){
        
          case 1:
            add(n1,n2);
            break;
          case 2:
            difference(n1,n2);
            break;
          case 3:
            product(n1,n2);
            break;
          case 4:
            division(n1,n2);
            break;
          default:
            System.out.println("Please choose correct operation!!!\n");
           }
    }

    public static void add(double n1,double n2){
        System.out.printf("\nYour Result ... "+(n1+n2)+"\n---------------------");
    }

    public static void difference(double n1,double n2){
        System.out.printf("\nYour Result ... "+(n1-n2)+"\n---------------------");
    }

    public static void product(double n1,double n2){
        System.out.printf("\nYour Result ... "+(n1*n2)+"\n---------------------");
    }

    public static void division(double n1,double n2){
        System.out.printf("\nYour Result ... "+(n1/n2)+"\n---------------------");
    }
}