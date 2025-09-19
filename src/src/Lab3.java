// Name : Qi Wang
// qi.wang@emory.edu / 2667904
// THIS CODE WAS MY OWN WORK , IT WAS WRITTEN WITHOUT
// CONSULTING ANY SOURCES OUTSIDE OF THOSE APPROVED BY THE INSTRUCTOR .
// Qi Wang
public class Lab3 {
    public static void main(String[] args) {
        int itemNum1, itemNum2, itemNum3, itemNum4, itemNum5;
        itemNum1 = 1;
        itemNum2 = 2;
        itemNum3 = 3;
        itemNum4 = 4;
        itemNum5 = 5;
        double itemPrice1, itemPrice2, itemPrice3, itemPrice4, itemPrice5;
        itemPrice1 = 1.11;
        itemPrice2 = 2.22;
        itemPrice3 = 3.33;
        itemPrice4 = 4.44;
        itemPrice5 = 5.55;
        displayItem(itemNum1,itemPrice1);
        displayItem(itemNum2,itemPrice2);
        displayItem(itemNum3,itemPrice3);
        displayItem(itemNum4,itemPrice4);
        displayItem(itemNum5,itemPrice5);
        System.out.println("Tax Rate :: 7.5%");
        System.out.println("Total Cost :: " + computeTotal(itemPrice1,itemPrice2,itemPrice3,itemPrice4,itemPrice5));
    }
    static void displayItem(int itemNumber, double itemPrice){
        System.out.println(itemNumber + " :: " + itemPrice);
    }
    static double computeTotal(double itemPrice1, double itemPrice2, double itemPrice3,double itemPrice4,double itemPrice5){
        return((itemPrice1+itemPrice2+itemPrice3+itemPrice4+itemPrice5)*1.075);
    }
}
