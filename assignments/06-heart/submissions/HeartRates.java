import java.util.Scanner;

public class HeartRates {
    private String firstName;
    private String lastName;
    private int dayOfBirth;
    private int monthOfBirth;
    private int yearOfBirth;


    public HeartRates(String firstName, String lastName, int day, int month, int year) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dayOfBirth = day;
        this.monthOfBirth = month;
        this.yearOfBirth = year;
    }

  
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public int calculateAge(int currentYear) {
        return currentYear - yearOfBirth;
    }

    public int calculateMaxHeartRate(int currentYear) {
        return 220 - calculateAge(currentYear);
    }

    public String calculateTargetHeartRate(int currentYear) {
        int maxRate = calculateMaxHeartRate(currentYear);
        double minTarget = maxRate * 0.50;
        double maxTarget = maxRate * 0.85;
        return String.format("%.0f bpm - %.0f bpm", minTarget, maxTarget);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite seu primeiro nome: ");
        String firstName = input.nextLine();

        System.out.print("Digite seu sobrenome: ");
        String lastName = input.nextLine();

        System.out.print("Digite sua data de nascimento (dia mês ano separados por espaço): ");
        int day = input.nextInt();
        int month = input.nextInt();
        int year = input.nextInt();

        HeartRates person = new HeartRates(firstName, lastName, day, month, year);

        System.out.println("\nNome: " + person.getFirstName() + " " + person.getLastName());
        System.out.println("Data de nascimento: " + day + "/" + month + "/" + year);
        System.out.println("Idade: " + person.calculateAge(2025) + " anos");
        System.out.println("Frequência cardíaca máxima: " + person.calculateMaxHeartRate(2025) + " bpm");
        System.out.println("Faixa de frequência cardíaca alvo: " + person.calculateTargetHeartRate(2025));

        input.close();
    }
}
