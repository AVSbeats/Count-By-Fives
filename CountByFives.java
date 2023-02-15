public class CountByFives {

    // This will be counting by 5's and then enter new line after every 50's
    // Practicing to learn

    public static void main(String[] args) {
        int i;

        for (i = 5; i <= 500; i += 5) {

            System.out.println(i);

            if (i % 50 == 0) {
                System.out.println("");
            }

        }
    }
}
