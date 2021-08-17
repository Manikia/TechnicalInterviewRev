public class rover {
    public static void main(String[] args) {
        String input = "RDLL";
        int x = 0, y = 0;

        // add the up and down coordinates
        for (int i = 0; i < input.length(); i++) {
            switch (input.charAt(i)) {
                case 'U': {
                    y++;
                    verify(x, y);
                    System.out.println("moving Up");

                    break;
                }
                case 'D': {
                    y--;
                    verify(x, y);
                    System.out.println("moving Down");

                    break;
                }
                case 'L': {
                    x--;
                    verify(x, y);
                    System.out.println("moving Left");

                    break;
                }

                case 'R': {
                    x++;
                    verify(x, y);
                    System.out.println("moving right");

                    break;
                }
                default: {
                    System.out.println("\nInvalid input\n");
                }
            }
        System.out.println("Coordinates are: " + x + "," + y);
        }

        }
        static void verify(int x, int y) {
            if (y > 0 || x < 0) {
                // if out of bounds
                System.exit(0);
            }
        }
}