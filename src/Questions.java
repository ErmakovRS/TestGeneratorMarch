import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Questions extends Answers {
    double percentCorrectAnswers;

    public void question() {
        String[] randomQuestion = new String[]{
                "Какой цвет у яблока?",
                "Сколько будет 2 + 2?",
                "Что такое Java?",
                "Когда началась вторая мировая война?",
                "Лучший преподаватель в мире?",
                "Кто такой Дима Золдик?",
                "Что такое АТТ?",
                "У меня есть пламя, ты сгораешь тише...",
                "Висит груша, нельзя скушать. Что это ?",
                "1000-7????????"
        };
        int randomIndex = (int) (Math.random() * randomQuestion.length);
        String question = randomQuestion[randomIndex];

        String[] possibleAnswers = randomAnswers[randomIndex];

        System.out.println(question);
        for (int i = 0; i < possibleAnswers.length; i++) {
            System.out.println((i + 1) + ". " + possibleAnswers[i]);
        }


        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите номер ответа");
        String answer = scanner.nextLine();
        try (FileWriter writer = new FileWriter("answers.txt", true)) {
            writer.append("\n");
            writer.write(question + "");
            writer.append("\n");
            writer.write(answer);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());

        }
    }
}
