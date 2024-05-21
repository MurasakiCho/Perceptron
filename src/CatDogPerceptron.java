import java.util.Random;
//Perceptron that tells the difference between a cat and a dog based on their traits
public class CatDogPerceptron extends Perceptron{
    //Constructor
    public CatDogPerceptron(){
        this.learningRate = 0.1;
        this.error = 1;
        this.guess = 0;
        weights = new double[4];
        Random random = new Random();
        for(int i = 0; i < weights.length; i++){
            weights[i] = round(random.nextDouble(-.9, 1));
        }
    }

    //prints training session specific to cats and dogs
    @Override
    public void printTrain(double[] input, int guess) {
        String target;
        String pGuess;

        if(input[1] == 1){
            System.out.print("Meows, ");
        }
        else{
            System.out.print("Barks, ");
        }
        if(input[2] == 1){
            System.out.print("Purrs, ");
        }
        else{
            System.out.print("Growls, ");
        }
        if(input[3] == 1){
            System.out.print("Small");
        }
        else{
            System.out.print("Large");
        }

        System.out.println();

        if(input[4] == 1){
            target = "CAT";
        }
        else{
            target = "DOG";
        }
        System.out.println("Target: " + target);

        if(guess == 1){
            pGuess = "CAT";
        }
        else{
            pGuess = "DOG";
        }
        System.out.println("Perceptron's Guess: " + pGuess);

        if(guess != input[4]){
            System.out.println("Training...");
        }
        else{
            System.out.println("Correct!");
        }

        System.out.println();
    }

    //prints testing session specific to cats and dogs
    @Override
    public void printTest(double[] input, int guess){
        String target;
        String pGuess;

        if(input[1] == 1){
            System.out.print("Meows, ");
        }
        else{
            System.out.print("Barks, ");
        }
        if(input[2] == 1){
            System.out.print("Purrs, ");
        }
        else{
            System.out.print("Growls, ");
        }
        if(input[3] == 1){
            System.out.print("Small");
        }
        else{
            System.out.print("Large");
        }

        System.out.println();

        if(input[4] == 1){
            target = "CAT";
        }
        else{
            target = "DOG";
        }
        System.out.println("Target: " + target);

        if(guess == 1){
            pGuess = "CAT";
        }
        else{
            pGuess = "DOG";
        }
        System.out.println("Perceptron's Guess: " + pGuess);

        System.out.println();
    }


}
