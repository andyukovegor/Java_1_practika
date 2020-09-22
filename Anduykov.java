package Andy;

import java.util.Scanner;
public class Anduykov {

public static double pow(double value, double powValue) {
return (double) Math.pow(value, powValue);
}


public static int f_integer ( Scanner scan) {
Integer x = null;

while (x == null) {
if (scan.hasNextInt()) {
x = scan.nextInt();
} else {
scan.nextLine();
System.out.println("ќшибка попробуйте снова ");
}
}
return x;
}

public static void main(String[] args) {
int a1, a2, n, d = 0, a = 0; // а1- первый элемент прогрессии, а2-второй элемент прогрессии, n- номер
// элемента в прогрессии дл€ которого надо вычислить значение,
//d- разница между элементами прогресии, а - элемент массива, который надо найти.
System.out.println("¬ведите первый элемент ");
Scanner symbol = new Scanner(System.in);
a1 = f_integer(symbol);
System.out.println("¬ведите второй элемент");
a2 = f_integer(symbol);
System.out.println("¬ведите номер элемента прогрессии");
n = f_integer(symbol);
d = a2-a1;
System.out.println("–азность арифметической прогрессии" + d);
a = a1 + d * (n-1);
System.out.println("Ёлемент прогрессии " +a);



}
}