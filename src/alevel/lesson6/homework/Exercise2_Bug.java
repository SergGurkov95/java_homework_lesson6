//Найти и исправить ошибку в коде с помощью дебаггера

package alevel.lesson6.homework;

public class Exercise2_Bug {

    public static void main(String[] args) {
        int[][] triangle = new int[4][];

        triangle[0] = new int[1];
        triangle[1] = new int[2];
        triangle[2] = new int[3];
        triangle[3] = new int[4];
//triangle[4] = new int[5];

        for (int i = 0; i < triangle.length; i++) {
            System.out.println(triangle.length + "!");
            System.out.println("i = " + i);
            for (int j = 0; j < triangle[i].length; j++) {
                System.out.println(triangle[i].length);
                triangle[i][j] = 0;
            }
        }

        System.out.println();

        for (int i = 0; i < triangle.length; i++) {
            for (int j = 0; j < triangle[i].length; j++) {      // i < triangle[i].length - бесконечное условие
                System.out.print(triangle[i][j] + " ");         //на второй итерации программа попытается получить данные из несуществующей ячейки
            }                                                   // исправление условия на j < triangle[i].length решает проблему
            System.out.println();
        }

    }
}
