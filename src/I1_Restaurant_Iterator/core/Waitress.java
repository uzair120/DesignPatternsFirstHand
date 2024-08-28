package I1_Restaurant_Iterator.core;

public class Waitress {
    Menu panCakeHouseMenu;
    Menu dinerMenu;

    public Waitress(PanCakeHouseMenu panCakeHouseMenu, DinerMenu dinerMenu) {
        this.panCakeHouseMenu = panCakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu(){
        Iterator pancakeIterator = panCakeHouseMenu.createIterator();
        Iterator dinerIterator = dinerMenu.createIterator();

        System.out.println("PanCake Menu");
        printMenu(pancakeIterator);
        System.out.println("Diner Menu");
        printMenu(dinerIterator);
    }

    private void printMenu(Iterator iterator){

       while (iterator.hasNext()){
           MenuItem menuItem = (MenuItem) iterator.next();
           System.out.print(menuItem.getName() + ",");
           System.out.print(menuItem.getPrice() + " -- ");
           System.out.println(menuItem.getDescription());
       }
    }

}
