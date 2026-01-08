package JavaPractice;

import java.util.Scanner;

public class Practice {


        public static void main(String[] args) {
            // Armstrong Number In Java


            Scanner in = new Scanner(System.in);
            System.out.println("Up to how many numbers you want to find Armstrong number?");
            int n = in.nextInt();


            if (n>99 && n<1000) {


                for (int i = 100; i <= n; i++) {
                    int x =0;

                    int y = i;
                    for (int z=0; z<3; z++) {
                        int rem = y % 10;
                        x = x + (rem * rem * rem);
                        y = y / 10;
                        }

                    if (i == x) {
                        System.out.println(i);
                    }
                    }


                }

            }

        }


