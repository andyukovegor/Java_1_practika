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
System.out.println("������ ���������� ����� ");
}
}
return x;
}

public static void main(String[] args) {
int a1, a2, n, d = 0, a = 0; // �1- ������ ������� ����������, �2-������ ������� ����������, n- �����
// �������� � ���������� ��� �������� ���� ��������� ��������,
//d- ������� ����� ���������� ���������, � - ������� �������, ������� ���� �����.
System.out.println("������� ������ ������� ");
Scanner symbol = new Scanner(System.in);
a1 = f_integer(symbol);
System.out.println("������� ������ �������");
a2 = f_integer(symbol);
System.out.println("������� ����� �������� ����������");
n = f_integer(symbol);
d = a2-a1;
System.out.println("�������� �������������� ����������" + d);
a = a1 + d * (n-1);
System.out.println("������� ���������� " +a);



}
}