package ua.khpi.kit.pavlov.sii01.utility;

/**
 * @author JR_Rider
 * @date 11.10.2017.
 */
public class FormuleHelper {

    public static double evklid(String template, String checked) {

        double res = 0;
        for (int k = 1; k < template.length(); k++) {
            int sK = template.charAt(k);
            int xK = checked.charAt(k);
            res += Math.pow(sK - xK, 2);
        }

        res = Math.sqrt(res);

        return res;
    }

    public static double absSum(String template, String checked) {

        double res = 0;
        for (int k = 1; k < template.length(); k++) {
            int sK = template.charAt(k);
            int xK = checked.charAt(k);
            res += Math.abs(sK - xK);
        }
        return res;
    }

    public static double absSumWithCoef(String template, String checked, int coefficient) {

        double res = 0;
        for (int k = 1; k < template.length(); k++) {
            int sK = template.charAt(k);
            int xK = checked.charAt(k);
            res += Math.abs(sK - xK) * coefficient;
        }
        return res;
    }

    public static double Kamberr(String template, String checked) {
        double res = 0;
        for (int k = 0; k < template.length(); k++) {
            int sK = template.charAt(k);
            int xK = checked.charAt(k);
            if (Math.abs(sK + xK) != 0)
                res += (double) Math.abs(sK - xK) / Math.abs(sK + xK);
        }
        return res;
    }

    public static double AngleBetweenVec(String template, String checked) {
        double res = 0;
        double sL = 0;
        double xL = 0;
        for (int k = 1; k < template.length(); k++) {
            int tsL = template.charAt(k);
            int txL = checked.charAt(k);
            sL += tsL*tsL;
            xL += txL*txL;

        }
        sL = Math.sqrt(sL);
        xL = Math.sqrt(xL);
        for (int k = 1; k < template.length(); k++) {
            int sK = template.charAt(k);
            int xK = checked.charAt(k);
            res += sK * xK;
        }
        return Math.acos(res / (Math.abs(sL) * Math.abs(xL)));
    }

}
