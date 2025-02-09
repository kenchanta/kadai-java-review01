
public class Review01 {

    public static void main(String[] args) {
        int origin = 1500;
        double taxPercentage = 0.1;

        int taxFee = tax(origin,taxPercentage);
        int taxInclude = origin + taxFee;

        System.out.println(origin +"円の商品の税込価格は"+taxInclude+"円"+"(消費税は"+taxFee+"円）です。");
    }

    //消費税額（商品価格×税率）の計算
    public static int tax(int origin, double taxPercentage) {
        int taxFee = (int) (origin * taxPercentage);
        return taxFee;
    }
}
