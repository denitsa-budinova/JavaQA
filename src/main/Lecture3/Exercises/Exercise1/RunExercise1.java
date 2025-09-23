package main.Lecture3.Exercises.Exercise1;

public class RunExercise1 {
    public static void main(String[] args) {

        Movie spiritedAway = new Movie("Spirited Away", "Fantasy/Adventure", 8.6);
        Movie unbroken = new Movie("Unbroken", "Drama/War", 7.2);
        Movie theShawshankRedemption = new Movie("The Shawshank Redemption", "Thriller/Crime", 9.3);

        spiritedAway.displayDetails();
        unbroken.displayDetails();
        theShawshankRedemption.displayDetails();
    }
}
