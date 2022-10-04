import java.util.Scanner;
class TipCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("How much is the bill: ");
        double bill = scan.nextDouble();//the bill

        System.out.print("Percentage of tip per person?: ");
        double tip1 =scan.nextDouble();//the tip amount

        System.out.print("How many people?=");
        int people =scan.nextInt();//people at the table

        double tip =(bill*(tip1/100));//find tip

        double tipper=(tip/people);//amount of tip per person

        double total=(tip+bill);//complete total

        double total2=(total/people);//total amount per person

        System.out.println("-------------------------------");
        System.out.println("Total bill without tip: "+bill);
        System.out.println("Total amount of tip: "+tip);
        System.out.println("Total amount with tip: "+total);
        System.out.println("Tip per persons: "+tipper);
        System.out.println("Total payed per persons: "+total2);
        System.out.println("-------------------------------");
    }
}


