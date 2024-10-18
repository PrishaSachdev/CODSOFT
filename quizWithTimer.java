import java.util.*;

public class quizWithTimer {

    // Question class to store the question, options, and correct answer
    static class Question {
        String questionText;
        String[] options;
        int correctAnswerIndex;

        public Question(String questionText, String[] options, int correctAnswerIndex) {
            this.questionText = questionText;
            this.options = options;
            this.correctAnswerIndex = correctAnswerIndex;
        }

        public boolean isCorrectAnswer(int userAnswer) {
            return userAnswer == correctAnswerIndex;
        }
    }

    public static void main(String[] args) {
        List<Question> quizQuestions = Arrays.asList(
            new Question(" What is the longest river in the world?", new String[] {"Nile", "Amazon", "Yangtze", "Mississippi"}, 2),
            new Question("Which planet is known as the Red Planet?", new String[] {"Earth", "Mars", "Jupiter", "Venus"}, 1),
            new Question("Who wrote 'Hamlet'?", new String[] {"Shakespeare", "Dickens", "Austen", "Hemingway"}, 0),
            new Question("Who was the first President of the United States?", new String[] {"Thomas Jefferson", "Benjamin Franklin", "George Washington", "Abraham Lincoln"}, 3),
            new Question("Which is the largest ocean?", new String[] {"Atlantic", "Indian", "Arctic", "Pacific"}, 3)
        );

        Scanner scanner = new Scanner(System.in);
        int score = 0;
        int timeLimitInSeconds = 10;

        for (int i = 0; i < quizQuestions.size(); i++) {
            Question q = quizQuestions.get(i);

            System.out.println("\nQuestion " + (i + 1) + ": " + q.questionText);
            for (int j = 0; j < q.options.length; j++) {
                System.out.println((j + 1) + ". " + q.options[j]);
            }

            long startTime = System.currentTimeMillis();
            System.out.print("Your answer (1-" + q.options.length + "): ");
            int userAnswer = -1;

            // Wait for the user's answer or until the time is up
            while ((System.currentTimeMillis() - startTime) < timeLimitInSeconds * 1000) {
                if (scanner.hasNextInt()) {
                    userAnswer = scanner.nextInt() - 1;
                    break;
                }
            }

            if (userAnswer >= 0 && userAnswer < q.options.length) {
                if (q.isCorrectAnswer(userAnswer)) {
                    System.out.println("Correct!");
                    score++;
                } else {
                    System.out.println("Incorrect.");
                }
            } else {
                System.out.println("Time's up or invalid answer.");
            }
        }

        System.out.println("\nQuiz complete! Your final score is: " + score + "/" + quizQuestions.size());
    }
}
