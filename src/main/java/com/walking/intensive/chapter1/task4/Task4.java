package com.walking.intensive.chapter1.task4;

/**
 * �������: <a href="https://geometry-math.ru/homework/Java-parameter.html">������</a>
 */
public class Task4 {
    public static void main(String[] args) {
//        ��� ����������� �������� ������ ������ ����� ��������� � ���� ������
        double a = 8;
        double b = 3;
        double c = 0;

        System.out.println(solveQuadraticEquation(a, b, c));

    }

    /**
     * ��� ������������ ������, ����� ��������� ������ ����������� �� �����������.
     * <p>
     * ������� �������������� ������:
     * <p>
     * ���������� �������: 2. �����: -4;4
     * <p>
     * ���������� �������: 1. ������: 0
     * <p>
     * ���������� �������: 0.
     */
    static String solveQuadraticEquation(double a, double b, double c) {
        /*���� D < 0 � �� ���������� ��������� �� ����� �������;
          ���� D = 0 � �� ��������� ����� ����� ������ ���� ������;
          ���� D > 0 � �� ��������� ����� ��� �������.
         ����������� ���������� ������ ����� ���� ������ ��� ������������ ����� ����.

          */
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    return "������� ����������";
                } else {
                    return "���������� �������: 0.";
                }
            } else {
                double aZero = -c / b;
                int rounedAZero = (int)aZero;
                return "���������� �������: 1. ������: " + rounedAZero;
            }
        } else {


            double discriminant = b * b - 4 * a * c;  //���������� ������ ���� D=b2?4ac   �=-b�Math.sqrt(D) / 2a

            if (discriminant > 0) {
                double firstMS = (-b + Math.sqrt(discriminant)) / (2 * a);
                double secondMS = (-b - Math.sqrt(discriminant)) / (2 * a);
                int rounedFirstMS = (int) Math.floor(firstMS);
                int rounedSecondMS = (int) Math.floor(secondMS);
                return "���������� �������: 2. �����: " + Math.min(rounedFirstMS, rounedSecondMS) + ";" + Math.max(rounedFirstMS,rounedSecondMS);
            } else if (discriminant == 0) {
                double disZero =  -b / (2 * a);
                int rounedDisZero = (int)disZero;
                return "���������� �������: 1. ������: " + rounedDisZero;
            } else {
                return "���������� �������: 0.";
            }
        }
    }
}