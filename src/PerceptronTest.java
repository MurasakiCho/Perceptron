public class PerceptronTest {
    public static void main(String[] args) {

        //all 16 possible combinations of black and white in a 4-square block with bias and their targets
        double [][] data = {
                //bias, x1, x2, x3, x4, target (bright or dark)
                {1, 1, 1, 1, 1, 1}, //bright
                {1, -1, -1, 1, -1, -1},//dark
                {1, -1, -1, 1, 1, 1},//bright
                {1, -1, 1, -1, -1, -1},//dark
                {1, 1, 1, -1, -1, 1},//bright
                {1, -1, 1, -1, 1, 1},//bright
                {1, -1, 1, 1, -1, 1},//bright
                {1, -1, 1, 1, 1, 1},//bright
                {1, 1, -1, -1, -1, -1},//dark
                {1, 1, -1, -1, 1, 1},//bright
                {1, 1, -1, 1, -1, 1},//bright
                {1, 1, -1, 1, 1, 1},//bright
                {1, -1, -1, -1, 1, -1},//dark
                {1, 1, 1, -1, 1, 1},//bright
                {1, -1, -1, -1, -1, -1},//dark
                {1, 1, 1, 1, -1, 1},//bright
        };

        //Bias, bark or meow?, growl or purr?, big or small?, dog or cat?
        double [][] data2 = {
                {-1, -1, -1, 1, -1}, //dog
                {-1, 1, 1, 1, 1}, //cat
                {-1, 1, 1, 1, 1}, //cat
                {-1, -1, -1, -1, -1}, //dog
                {-1, -1, -1, 1, -1}, //dog
                {-1, 1, 1, 1, 1}, //cat
                {-1, 1, 1, 1, 1}, //cat
                {-1, -1, -1, 1, -1}, //dog
                {-1, -1, -1, 1, -1}, //dog
                {-1, -1, -1, -1, -1}, //dog
                {-1, 1, 1, 1, 1}, //cat
                {-1, -1, -1, -1, -1}, //dog
                {-1, 1, 1, 1, 1}, //cat
                {-1, 1, 1, 1, 1}, //cat
                {-1, -1, -1, 1, -1}, //dog
        };


        int loop = 0;

        Perceptron perceptron = new Perceptron();
        CatDogPerceptron catDog = new CatDogPerceptron();

        //First Perceptron
        //training
       /* while(loop < 2){
            for (int i = 0; i < 10; i++){
                double[] input = new double [6];
                System.arraycopy(data[i], 0, input, 0, 6);
                perceptron.train(input);
            }
            loop++;
        }

        System.out.println();
        System.out.println("-----TESTING-----");
        System.out.println();
        System.out.println();

        //Tests
        for (int i = 10; i < 16; i++){
            double[] input = new double [6];
            System.arraycopy(data[i], 0, input, 0, 6);
            perceptron.test(input);
        }*/

        //CatDogPerceptron
        //training

        for (int i = 0; i < 10; i++){
            double[] input = new double [5];
            System.arraycopy(data2[i], 0, input, 0, 5);
            catDog.train(input);
        }


        System.out.println();
        System.out.println("-----TESTING-----");
        System.out.println();
        System.out.println();

        //Tests
        for (int i = 10; i < 15; i++){
            double[] input = new double [5];
            System.arraycopy(data2[i], 0, input, 0, 5);
            catDog.test(input);
        }
    }
}