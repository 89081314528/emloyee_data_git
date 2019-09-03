package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * * паспортный стол - заполнить эксель паспортными данными сотрудников (фио, серия, номер, зарплата).
 *  * сначала сделать по аналогии с PrimeTime для одного человека, потом сделать массив
 *  * добавить настройки, какие колонки нужно добавлять в csv. сначала написать метод, который принимает массив строк и строку.
 *  * если в массиве есть эта строка, то он возвращает тру, если нет, то фолс.
 *  * метод, который принимает массив служащих, имя файла (строка с названием файла, например emploee.csv) и целое число, и печатает
 *  * файл служащих, у которых зарплата выше этой цифры
 */

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
	String[] surname = new String[] {"Иванов", "Сорокин", "Середа"};
	String[] name = new String[] {"Павел", "Игорь", "Михаил"};
	String[] middleName = new String[] {"Святославович", "Михайлович", "Владимирович"};
	int[] salary = new int[] {250000, 300000, 36000};
	int[] passportSeries = new int[] {2004, 2006, 1996};
	int[] passportNumber = new int[] {165685, 854525, 347851};

	PrintStream preanter = new PrintStream(new File("data.csv"));
	preanter.println ("фамилия" + ";" + "имя" + ";" + "отчество" + ";" + "серия" + ";" + "номер" + ";" + "зарплата");
		for (int i = 0; i < surname.length; i++) {
			Employee human = new Employee(surname[i], name[i], middleName[i], passportSeries[i], passportNumber[i], salary[i]);
			printFi(human, preanter);
		}
		for (int i = 0; i < surname.length; i++) {
			Employee human = new Employee(surname[i], name[i], middleName[i], passportSeries[i], passportNumber[i], salary[i]);
			printFioSalary(human, preanter);
		}
    }

    public static void printFi (Employee a, PrintStream preanter) {
    	preanter.println(a.surname + ";" + a.name);
	}
	public static void printFioSalary (Employee a, PrintStream preanter) {
		preanter.println(a.surname + ";" + a.name + ";" + a.surname + ";" + ";" + ";" + a.salary);
	}

}
