
public class Review01 {

    public static void main(String[] args) {
        //商品価格
        int origin = 1500;
        //消費税額
        int taxFee = tax(origin);
        //税込み価格
        int taxInclude = origin + taxFee;
        System.out.println(origin +"円の商品の税込価格は"+taxInclude+"円"+"(消費税は"+taxFee+"円）です。");
    }

    //消費税額（商品価格×税率）の計算
    public static int tax(int origin) {
        double taxPercentage = 0.1;
        int taxFee = (int) (origin * taxPercentage);
        return taxFee;
    }
}
