import java.util.*;

class Account{
    
    private Integer accNumber;
    private Integer pinNumber;
    private Double amount;
    Amount(){
        System.out.print("Enter Account Nmmber :");
        Scanner sc = new Scanner(System.in);
        accNumber = sc.nextInt();
        System.out.print("Enter the Pin Number :");
        pinNumber = sc.nextInt();
        System.out.print("Enter the Amount :");
        amount = sc.nextDouble();
    }

}