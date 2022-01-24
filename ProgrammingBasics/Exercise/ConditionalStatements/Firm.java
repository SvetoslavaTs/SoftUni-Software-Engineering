import java.util.Scanner;

public class Firm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int neededHours = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());
        int employeesOvertime = Integer.parseInt(scanner.nextLine());
        //•	Ако времето е достатъчно:
        //o	“Yes!{оставащите часове} hours left.”
        //•	Ако  времето НЕ Е достатъчно:
        //o	“Not enough time!{недостигащите часове} hours needed.“

        double workingDays = days * 0.9;
        double workingHours = workingDays * 8;
        double overTime = employeesOvertime * 2 * days;
        double totalHours = Math.floor(workingHours + overTime);

        if (totalHours >= neededHours) {
            totalHours -= Math.abs(neededHours);
            System.out.printf("Yes!%.0f hours left.", Math.floor(totalHours));
        } else {
            totalHours = neededHours - totalHours;
            System.out.printf("Not enough time!%.0f hours needed.", Math.floor(totalHours));
        }


    }
}



