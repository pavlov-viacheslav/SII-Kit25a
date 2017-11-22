package ua.khpi.kit.pavlov.sii01.utility;

import java.util.ArrayList;

/**
 * @author JR_Rider
 * @date 21.10.2017.
 */
public class Comparer {

	public static int compareEvklid(ArrayList<ImageWorker> templates, ImageWorker checked) {
		int resPos = 0;
		System.out.println("Evklid:");
		double tmp = Integer.MAX_VALUE;
		for (int i = 0; i < templates.size(); i++) {

			System.out.println("Template N " + (int) (i + 1) + " "
					+ FormuleHelper.evklid(templates.get(i).getResultString(), checked.getResultString()));
			if (tmp > FormuleHelper.evklid(templates.get(i).getResultString(), checked.getResultString())) {
				tmp = FormuleHelper.evklid(templates.get(i).getResultString(), checked.getResultString());
				resPos = i;
			}

		}
		return resPos;
	}

	public static int compareAbsSum(ArrayList<ImageWorker> templates, ImageWorker checked) {
		int resPos = 0;
		System.out.println("AbsSum:");
		double tmp = Integer.MAX_VALUE;
		for (int i = 0; i < templates.size(); i++) {

			System.out.println("Template N " + (int) (i + 1) + " "
					+ FormuleHelper.absSum(templates.get(i).getResultString(), checked.getResultString()));
			if (tmp > FormuleHelper.absSum(templates.get(i).getResultString(), checked.getResultString())) {
				tmp = FormuleHelper.absSum(templates.get(i).getResultString(), checked.getResultString());
				resPos = i;
			}

		}
		return resPos;
	}

	public static int compareKamberr(ArrayList<ImageWorker> templates, ImageWorker checked) {
		int resPos = 0;
		System.out.println("Kamberr:");
		double tmp = Integer.MAX_VALUE;
		for (int i = 0; i < templates.size(); i++) {

			System.out.println("Template N" + (int) (i + 1) + " "
					+ FormuleHelper.Kamberr(templates.get(i).getResultString(), checked.getResultString()));
			if (tmp > FormuleHelper.Kamberr(templates.get(i).getResultString(), checked.getResultString())) {
				tmp = FormuleHelper.Kamberr(templates.get(i).getResultString(), checked.getResultString());
				resPos = i;
			}

		}
		return resPos;
	}

	public static int compareAngleBetweenVec(ArrayList<ImageWorker> templates, ImageWorker checked) {
		int resPos = 0;
		System.out.println("AngleBetweenVec:");
		double tmp = Integer.MAX_VALUE;
		for (int i = 0; i < templates.size(); i++) {

			System.out.println("Template N" + (int) (i + 1) + " "
					+ FormuleHelper.AngleBetweenVec(templates.get(i).getResultString(), checked.getResultString()));
			if (tmp > FormuleHelper.AngleBetweenVec(templates.get(i).getResultString(), checked.getResultString())) {
				tmp = FormuleHelper.AngleBetweenVec(templates.get(i).getResultString(), checked.getResultString());
				resPos = i;
			}

		}
		return resPos;
	}
}
