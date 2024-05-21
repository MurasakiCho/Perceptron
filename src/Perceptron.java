import java.util.Random;
public class Perceptron {
    //VARIABLES
    double [] weights;
    double learningRate;
    double error;
    int guess;

    //CONSTRUCTOR
    public Perceptron (){
        this.learningRate = 0.1;
        this.error = 1;
        this.guess = 0;
        weights = new double[5];
        Random random = new Random();
        for(int i = 0; i < weights.length; i++){
            weights[i] = round(random.nextDouble(-.9, 1));
        }
    }

    //METHODS

    //Used to round the weights to 1 decimal place
    public double round (double value){
        int scale = (int) Math.pow(10, 1);
        return (double) Math.round(value * scale) / scale;
    }

    //use dot product on inputs and their weights
    public int guess(double[] input){
        double weightedSum = 0;
        for(int i = 0; i < weights.length; i++){
            weightedSum += input[i] * weights[i];
        }
        return step(weightedSum);
    }

    //threshold function: if sum > 0, return 1 (bright), else return -1 (dark)
    public int step(double sum){
        if(sum > 0){
            return 1;
        }
        else{
            return -1;
        }
    }

    //sample training method
    public void train(double[] input) {
        guess = guess(input);
        printTrain(input, guess);
        //calculates error of guess, tweaks the weights until there is no error

        while (guess != input[input.length-1]){
            error = input[input.length-1] - guess;
            for (int i = 0; i < weights.length; i++) {
                weights[i] += learningRate * error * input[i];
            }
            guess = guess(input);
        }

    }

    //sample testing method
    public void test (double[] input){
        guess = guess(input);
        printTest(input, guess);
    }

    //print the training process
    public void printTrain(double[] input, int guess){
        String[] sample = new String[4];
        String target;
        String pGuess;
        for(int i = 1; i < 5; i++){
            if(input[i] == 1){
                sample[i-1] = "◼";
            }
            else{
                sample[i-1] = "□";
            }
        }

        System.out.println(sample[0] + sample[1]);
        System.out.println(sample[2] + sample[3]);

        if(input[5] == 1){
            target = "BRIGHT";
        }
        else{
            target = "DARK";
        }
        System.out.println("Target: " + target);

        if(guess == 1){
            pGuess = "BRIGHT";
        }
        else{
            pGuess = "DARK";
        }
        System.out.println("Perceptron's Guess: " + pGuess);

        if(guess != input[5]){
            System.out.println("Training...");
        }
        else{
            System.out.println("Correct!");
        }

        System.out.println();

    }

    //print the testing process
    public void printTest(double[] input, int guess){
        String[] sample = new String[4];
        String target;
        String pGuess;
        for(int i = 1; i < 5; i++){
            if(input[i] == 1){
                sample[i-1] = "◼";
            }
            else{
                sample[i-1] = "□";
            }
        }

        System.out.println(sample[0] + sample[1]);
        System.out.println(sample[2] + sample[3]);

        if(input[5] == 1){
            target = "BRIGHT";
        }
        else{
            target = "DARK";
        }
        System.out.println("Target: " + target);

        if(guess == 1){
            pGuess = "BRIGHT";
        }
        else{
            pGuess = "DARK";
        }
        System.out.println("Perceptron's Guess: " + pGuess);
    }
}
