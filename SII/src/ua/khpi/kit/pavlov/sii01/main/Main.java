package ua.khpi.kit.pavlov.sii01.main;

import java.util.ArrayList;

import ua.khpi.kit.pavlov.sii01.utility.Comparer;
import ua.khpi.kit.pavlov.sii01.utility.ImageWorker;

/**
 * @author JR_Rider
 * @date 11.10.2017.
 */
public class Main {

	public static void main(String[] args) {
		ImageWorker test = new ImageWorker("res/sii01/test.png");
		ImageWorker test1 = new ImageWorker("res/sii01/test1.png");
		ImageWorker test2 = new ImageWorker("res/sii01/test2.png");
		ImageWorker test3 = new ImageWorker("res/sii01/test3.png");
		ImageWorker test4 = new ImageWorker("res/sii01/test4.png");
		ImageWorker test5 = new ImageWorker("res/sii01/test5.png");

		ArrayList<ImageWorker> templates = new ArrayList<>();
		templates.add(test1);
		templates.add(test2);
		templates.add(test3);
		templates.add(test4);
		templates.add(test5);

		System.out.println(
				"Test is most likely template N " + (int) (Comparer.compareEvklid(templates, test) + 1) + "\n");
		System.out.println(
				"Test is most likely template N " + (int) (Comparer.compareAbsSum(templates, test) + 1) + "\n");
		System.out.println("Test is most likely template N "
				+ (int) (Comparer.compareAngleBetweenVec(templates, test) + 1) + "\n");
		System.out.println(
				"Test is most likely template N " + (int) (Comparer.compareKamberr(templates, test) + 1) + "\n");

		// test.print();
		// test1.print();

		/*
		 * Commented for debug System.out.println("Evklid: ");
		 * System.out.println("test - test1: " +
		 * FormuleHelper.evklid(test.getResultString(), test1.getResultString()));
		 * System.out.println("test - test: " +
		 * FormuleHelper.evklid(test.getResultString(), test.getResultString()));
		 */

		/*
		 * Commented for debug System.out.println("AbsSum: ");
		 * System.out.println("test - test1: " +
		 * FormuleHelper.absSum(test.getResultString(), test1.getResultString()));
		 * System.out.println("test - test: " +
		 * FormuleHelper.absSum(test.getResultString(), test.getResultString()));
		 */

		/*
		 * Commented for debug System.out.println("AbsSumWithCoef: ");
		 * System.out.println( "test - test1: " +
		 * FormuleHelper.absSumWithCoef(test.getResultString(),
		 * templates.get(0).getResultString(),2)); System.out.println( "test - test4: "
		 * + FormuleHelper.absSumWithCoef(test.getResultString(),
		 * templates.get(3).getResultString(),2));
		 */

		/*
		 * Commented for debug System.out.println("Kamberr: ");
		 * System.out.println("test - test1: " +
		 * FormuleHelper.Kamberr(test.getResultString(), test1.getResultString()));
		 * System.out.println("test - test: " +
		 * FormuleHelper.Kamberr(test.getResultString(), test.getResultString()));
		 */

		/*
		 * System.out.println("AngleBetweenVec: "); System.out.println("test - test1: "
		 * + FormuleHelper.AngleBetweenVec(test.getResultString(),
		 * test1.getResultString())); System.out.println("test - test: " +
		 * FormuleHelper.AngleBetweenVec(test.getResultString(),
		 * test.getResultString()));
		 */
	}
}
