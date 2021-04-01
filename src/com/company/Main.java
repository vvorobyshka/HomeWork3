package com.company;

public class Main {

    public static void main(String[] args) {
        int month = 13;
        if ((month >= 1 && month < 3) || month == 12) {
            System.out.println("Зима");
        } else if (month >= 3 && month < 6) {
            System.out.println("Весна");
        } else if (month >= 6 && month < 9) {
            System.out.println("Лето");
        } else if (month >= 9 && month < 12) {
            System.out.println("Осень");
        }

        switch (month) {
            case 1:
            case 12:
            case 2:
                System.out.println("Зима");
                break;

            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;

            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;

            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такой месяц еще не придумали. Вы можете быть первым.");
                break;
        }
        int [] array = {2,3,4,2,6,7,9,4,7,6};
        for(int i=array.length-1; i>=0; i-- )
        System.out.println(array[i]);
        int[][] arraySquare = new int[2][4];
        arraySquare[0][0] = 12;
        arraySquare[0][1] = 14;
        arraySquare[0][2] = 16;
        arraySquare[0][3] = 18;
        arraySquare[1][0] = 13;
        arraySquare[1][1] = 15;
        arraySquare[1][2] = 17;
        arraySquare[1][3] = 19;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(arraySquare[i][j] + "[" + i + "][" + j + "]" + " ");
            }
            System.out.println();
        }
    }

}

