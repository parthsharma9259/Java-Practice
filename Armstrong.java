public class Armstrong {
    public static void main(String[] args) {

        int num = 153, temp, rem, sum = 0;

        temp = num;

        while (temp != 0) {
            rem = temp % 10;
            sum = sum + (rem * rem * rem);
            temp = temp / 10;
        }

        if (sum == num) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not Armstrong Number");
        }
    }
}