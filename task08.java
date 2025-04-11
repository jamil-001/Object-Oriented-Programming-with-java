
import java.util.Scanner;

abstract class Question {
    private String question;
    private String difficultyLevel;

    public Question(String question, String difficultyLevel) {
        this.question = question;
        this.difficultyLevel = difficultyLevel;
    }

    public String getQuestion() {
        return question;
    }

    public String getDifficultyLevel() {
        return difficultyLevel;
    }

    public abstract void displayQuestion();
    public abstract int scoreQuestion(String userAnswer);
}
class MultipleChoice extends Question {
    private String[] options;
    private String correctAnswer;

    public MultipleChoice(String question, String difficultyLevel, String[] options, String correctAnswer) {
        super(question, difficultyLevel);
        this.options = options;
        this.correctAnswer = correctAnswer;
    }
    public void displayQuestion() {
        System.out.println("Question (Multiple Choice): " + getQuestion());
        System.out.println("Difficulty: " + getDifficultyLevel());
        char optionLabel = 'A';
        for (String option : options) {
            System.out.println(optionLabel + ") " + option);
            optionLabel++;
        }
    }
    public int scoreQuestion(String userAnswer) {
        return userAnswer.equalsIgnoreCase(correctAnswer) ? 1 : 0;
    }
}

class TrueFalse extends Question {
    private boolean correctAnswer;

    public TrueFalse(String question, String difficultyLevel, boolean correctAnswer) {
        super(question, difficultyLevel);
        this.correctAnswer = correctAnswer;
    }
    public void displayQuestion() {
        System.out.println("Question (True/False): " + getQuestion());
        System.out.println("Difficulty: " + getDifficultyLevel());
        System.out.println("A) True");
        System.out.println("B) False");
    }
    public int scoreQuestion(String userAnswer) {
        boolean userResponse = userAnswer.equalsIgnoreCase("A") || userAnswer.equalsIgnoreCase("True");
        return userResponse == correctAnswer ? 1 : 0;
    }
}

public class task08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Question[] quiz = {
            new MultipleChoice(
                "What is the largest planet in our solar system?",
                "Easy",
                new String[]{"Earth", "Mars", "Jupiter", "Saturn"},
                "C"
            ),
            new TrueFalse(
                "The Earth is flat.",
                "Easy",
                false
            ),
            new MultipleChoice(
                "Which language is used for Android app development?",
                "Medium",
                new String[]{"Swift", "Kotlin", "Python", "JavaScript"},
                "B"
            )
        };

        int totalScore = 0;
        for (Question q : quiz) {
            q.displayQuestion();
            System.out.print("Your answer: ");
            String answer = scanner.nextLine();
            totalScore += q.scoreQuestion(answer);
            System.out.println();
        }
        System.out.println("Quiz completed!");
        System.out.println("Your total score: " + totalScore + "/" + quiz.length);
        scanner.close();
    }
}
