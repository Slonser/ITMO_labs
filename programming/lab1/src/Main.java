import java.lang.Math;
import java.util.Arrays;

/** 
 * Лабораторная работа №1, вариант 311805
 * @author Кокорин Всеволод Вячеславович, Группа R3118
 * @version 0.1
*/
public class Main{

    
    /**
     * @param left - левая граница отрезка
     * @param right - правая граница отрезкаd
     * @return возращает случайное значение из отрезка [left; right]
     */
    public static double getRandom(double left, double right){
        return Math.random() * (right - left + 1) + left;
    }


    /**
     * Красиво выводит массив
     * @param array - double[][] с данными для вывода
     */
    public static void printArray(double[][] array){
        for(int i = 0;i < array.length;i++){
            System.out.print("| ");
            for(int j = 0; j < array[i].length; j++){
		if(!Double.isNaN(array[i][j]))
                    System.out.printf("%8.2f | ", array[i][j]);
		else
		    System.out.printf("%8s | ", "***");
            }
            System.out.println();
        }
    }

    /*
    	1 пункт
        Создать одномерный массив a типа long. Заполнить его чётными числами от 2 до 24 включительно в порядке убывания.
    */


    private static final short D_SIZE = 12;
    private static long[] d = new long[D_SIZE];

    public static void initFirst(){
        for(int i = D_SIZE; i > 0; i--)
            d[D_SIZE - i] = i * 2 + 2;
    }


    /*
    	2 пункт
        Создать одномерный массив x типа double. Заполнить его 10-ю случайными числами в диапазоне от -12.0 до 13.0.
    */

    private static final short X_SIZE = 10;
    private static double[] x = new double[X_SIZE];

    public static void initSecond(){
        for(int i = 0; i < X_SIZE; i++)
            x[i] = getRandom(-12,13);
    }


    /*
    	3 пункт
        Создать двумерный массив a размером 12x10. Вычислить его элементы по формуле.
    */

    private static final short RESULT_HEIGHT = 12;
    private static final short RESULT_WIDTH = 10;
    private static double[][] result = new double[RESULT_HEIGHT][RESULT_WIDTH];
    private static final long[] FILTER_ARRAY = {2,4,6,8,20,24};

    public static void initThird(){
        for(int i = 0; i < RESULT_HEIGHT; i++){
            for(int j = 0; j < RESULT_WIDTH; j++){
                double k = x[j];
                if(d[i] == 14){
                    result[i][j] = Math.sin(Math.pow(Math.log(Math.abs(k)), 2 * (Math.pow((k+1)/k, 3) + 1)));
                }else if(Arrays.asList(FILTER_ARRAY).contains(d[i])){
                        result[i][j] = Math.log(Math.pow(Math.sin(Math.atan(Math.pow((k+0.5)/25, 2))), 2));
                }else{
                        result[i][j] = Math.asin(0.5 * Math.pow(Math.E,Math.cbrt(-Math.sqrt(Math.abs(k)))));
                }
            }
        }
    }


    public static void main(String[] args){
        initFirst();
        initSecond();
        initThird();
        printArray(result);
    }
}
