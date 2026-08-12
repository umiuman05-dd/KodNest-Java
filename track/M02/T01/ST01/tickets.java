import java.util.Scanner;

class SupportTicket {
    int id;
    int priority;
    int waitingMinutes;
}

public class tickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        SupportTicket t1 = new SupportTicket();
        t1.id = scanner.nextInt();
        t1.priority = scanner.nextInt();
        t1.waitingMinutes = scanner.nextInt();

        SupportTicket t2 = new SupportTicket();
        t2.id = scanner.nextInt();
        t2.priority = scanner.nextInt();
        t2.waitingMinutes = scanner.nextInt();

        SupportTicket t3 = new SupportTicket();
        t3.id = scanner.nextInt();
        t3.priority = scanner.nextInt();
        t3.waitingMinutes = scanner.nextInt();

        SupportTicket selected = t1;

        if (isBetter(t2, selected)) {
            selected = t2;
        }

        if (isBetter(t3, selected)) {
            selected = t3;
        }

        System.out.println("Selected Ticket: " + selected.id);
        System.out.println("Priority: " + selected.priority);
        System.out.println("Waiting Minutes: " + selected.waitingMinutes);

        scanner.close();
    }

    public static boolean isBetter(SupportTicket a, SupportTicket b) {
        if (a.priority != b.priority) {
            return a.priority > b.priority;
        }

        if (a.waitingMinutes != b.waitingMinutes) {
            return a.waitingMinutes > b.waitingMinutes;
        }

        return a.id < b.id;
    }
}