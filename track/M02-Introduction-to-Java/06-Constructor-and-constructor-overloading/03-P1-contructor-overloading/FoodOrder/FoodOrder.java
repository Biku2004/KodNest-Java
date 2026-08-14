class FoodOrder{
    String item;
    int quantity;

    FoodOrder(String item){
        this.item = item;
        this.quantity = 1;
    }

    FoodOrder(String item, int quantity){
        this.item = item;
        this.quantity = quantity;
    }
    
}