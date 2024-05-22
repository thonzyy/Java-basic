package access.ex;

public class ShoppingCart
{
    private Item[] items= new Item[10];
    private int itemCount;

    public void addItem(Item item)
    {
        if(itemCount>=items.length)
        {
            System.out.println("장바구니가 가득 찼습니다.");
            return;
        }
        items[itemCount]= item;
        itemCount++;
    }

    public void displayItem()
    {
        int totalPrice=0;
        System.out.println("장바구니 상품 출력");
        for (int i = 0; i < itemCount; i++)
        {
            Item item = items[i];
            System.out.println("상품명:"+item.getName()+", 합계:"+item.getTotalPrice());
            totalPrice+=item.getTotalPrice();
        }

        System.out.println("전체 가격 합: "+totalPrice);
    }
}
