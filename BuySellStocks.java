public class BuySellStocks {
    public static int buySellStocks(int[] price){
        int buyPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i:price){
            if(buyPrice<i){
                int profit=i-buyPrice;
                maxProfit=Math.max(maxProfit,profit);
            }else{
                buyPrice=i;
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int[] price={1,5,3,7,4};
        System.out.println(buySellStocks(price));
    }
}
