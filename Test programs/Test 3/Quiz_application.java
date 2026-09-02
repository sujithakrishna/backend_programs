package Test3;

import java.util.Scanner;

class Questions
{
    public String question;
    public String answer;
    int score;

    Questions(String question, String answer, int score)
    {
        this.question = question;
        this.answer = answer;
        this.score = score;
    }
}

class Finalscore
{
    int total = 0;

    public void checkAnswer(Questions q, Scanner sc)
    {
        System.out.println(q.question);
        System.out.print("Enter your answer: ");

        String useranswer = sc.next();

        if(useranswer.equalsIgnoreCase(q.answer))
        {
            System.out.println("Correct!");
            total = total + q.score;
        }
        else
        {
            System.out.println("Wrong!");
        }

        System.out.println();
    }

    public void displayScore()
    {
        System.out.println("Final Score: " + total+"/10");
    }
}

public class Quiz_application
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome To Quiz");
        Questions q1 = new Questions("1. What is an object in Java?\n"
                + "A. Instance of a class\nB. Method\nC. Constructor\nD. Variable",
                "A", 1);

        Questions q2 = new Questions("2. Which keyword is used to create an object?\n"
                + "A. class\nB. new\nC. object\nD. create",
                "B", 1);

        Questions q3 = new Questions("3. Which OOP concept means wrapping data and methods together?\n"
                + "A. Inheritance\nB. Polymorphism\nC. Encapsulation\nD. Abstraction",
                "C", 1);

        Questions q4 = new Questions("4. Which keyword is used for inheritance in Java?\n"
                + "A. inherit\nB. extends\nC. implements\nD. super",
                "B", 1);

        Questions q5 = new Questions("5. Which OOP concept allows one method to have different forms?\n"
                + "A. Encapsulation\nB. Inheritance\nC. Polymorphism\nD. Abstraction",
                "C", 1);

        Questions q6 = new Questions("6. Which access modifier provides the highest level of data hiding?\n"
                + "A. public\nB. protected\nC. default\nD. private",
                "D", 1);

        Questions q7 = new Questions("7. What is a constructor used for?\n"
                + "A. Destroying an object\nB. Initializing an object\n"
                + "C. Calling a method\nD. Creating a package",
                "B", 1);

        Questions q8 = new Questions("8. Which keyword is used to call the parent class constructor?\n"
                + "A. this\nB. parent\nC. super\nD. base",
                "C", 1);

        Questions q9 = new Questions("9. Which keyword is used to implement an interface?\n"
                + "A. extends\nB. implements\nC. interface\nD. inherit",
                "B", 1);

        Questions q10 = new Questions("10. Which OOP concept shows only essential information and hides implementation details?\n"
                + "A. Abstraction\nB. Inheritance\nC. Encapsulation\nD. Polymorphism",
                "A", 1);
        Finalscore f = new Finalscore();

        f.checkAnswer(q1, sc);
        f.checkAnswer(q2, sc);
        f.checkAnswer(q3, sc);
        f.checkAnswer(q4, sc);
        f.checkAnswer(q5, sc);
        f.checkAnswer(q6, sc);
        f.checkAnswer(q7, sc);
        f.checkAnswer(q8, sc);
        f.checkAnswer(q9, sc);
        f.checkAnswer(q10, sc);

      
        f.displayScore();

        sc.close();
    }
}