package labi_java.laba4;

public class Task2 {
    public static void main(String[] args) {
        String[] surnames = new String[] {
            "АГЛУШЕВИЧ", "БАЙКИН", "БЕЛОГУР", "БУКАТКА", "ВАЛЯВКО", "ВАСЮК", 
            "ЛИХОБАБИН", "МАСАЛЬСКИЙ", "ОЖЕРЕЛЬЕВ", "ПАНЬКОВ", "ПЕТРОВСКИЙ",
            "ГРИШКЕВИЧ", "ЗАЙЦЕВ", "ЗГУРСКИЙ", "КИБКАЛО", "КОЗАРЬ", "КОНЫЧЕВ", 
            "СУЛИМОВ", "ШАТИЛО", "ШЕБАЛОВ",
            "ПОНАМАРЕВ", "ПОЯСНЮК", "ПРИТУЖАЛОВ", "ПЧЁЛКИН", "СКОВОРОДИН"
        };
        
        // Сортировка пузырьком
        for (int i = 0; i < surnames.length - 1; i++) {
            for (int j = 0; j < surnames.length - i - 1; j++) {
                if (surnames[j].compareTo(surnames[j + 1]) > 0) {
                    String temp = surnames[j];
                    surnames[j] = surnames[j + 1];
                    surnames[j + 1] = temp;
                }
            }
        }
        
        System.out.println("Отсортированный массив:");
        for (String name : surnames) {
            System.out.println(name);
        }
    }
}