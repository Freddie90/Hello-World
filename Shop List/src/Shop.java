public class Shop {

    private String itemNumber;
    private String itemnName;
    private double itemPrice;
    private int amount;


    public Shop()
    {
    }

    public Shop(String num, String nme, double price, int amoun)
    {
        itemNumber = num;
        itemnName = nme;
        itemPrice = price;
        amount = amoun;
    }

    public void setItemNumber(String num)
    {
        itemNumber = num;
    }


    public void setItemName(String nme)
    {
        itemnName = nme;
    }

    public void setItemPrice(double price)
    {
        itemPrice = price;
    }

    public void setAmount(int amoun)
    {
        amount = amoun;
    }

    public String getItemNumber()
    {
        return itemNumber;
    }
    public String getItemName()
    {
        return itemnName;
    }
    public double getItemPrice()
    {
        return itemPrice;
    }

    public int getAmount()
    {
        return amount;
    }

    public double calcPaymentAmount()
    {
        double paymentDue;
        paymentDue = (amount * itemPrice);
        return paymentDue;
    }

    //public String toString()
    //{
    //    String str;

//        str = "%s-25 %s-25 %10d %10d", itemNumber, ItemName, itemPrice, amount;
    //      return str;
    //}
}
