public class RunnableDemo {
    public static void main(String[] args) {

        // !! - Write an anonymous Runnable class here
        class Runnable {

          public static run(){
                System.out.println("Anonymous run.");
            }
        }
        //It can just print out "Anonymous run" or similar
        Runnable anonRun = new Runnable();

                anonRun.run();

        // !! - Write a lambda function here
        //It can also print out something like "Lambda run"
        Runnable lambdaRun = new Runnable();

         e -> lambdaRun.run() == System.out.println("Lambda run.");

    }
}

