interface Product{
    void Name_Product();
    void price();
    void rating();
}
class Table implements Product{
    String Name;
    int price;
    double rating;
    Table(String Name, int price, double rating){
        this.Name=Name;
        this.price=price;
        this.rating =rating;
    }
    @Override
     public void Name_Product(){
        System.out.print(Name +" ");
     }
    @Override
     public void price(){
        System.out.print(price +" ");
    }
    @Override
    public void rating(){
        System.out.println(rating +" ");
    }
}
class Chair implements Product{
    String Name;
    int price;
    double rating;
    Chair(String Name, int price, double rating){
        this.Name=Name;
        this.price=price;
        this.rating =rating;
    }
    @Override
    public void Name_Product(){
        System.out.print(Name +" ");
    }
    @Override
    public void price(){
        System.out.print(price +" ");
    }
    @Override
    public void rating(){
        System.out.println(rating +" ");
    }
}
class Armchair implements Product{
    String Name;
    int price;
    double rating;
    Armchair(String Name, int price, double rating){
        this.Name=Name;
        this.price=price;
        this.rating =rating;
    }
    @Override
    public void Name_Product(){
        System.out.print(Name +" ");
    }
    @Override
    public void price(){
        System.out.print(price +" ");
    }
    @Override
    public void rating(){
        System.out.println(rating +" ");
    }
}
interface User{
    void login();
    void password();
}
class Buyer implements User{
    String FIO;
    String login;
    String password;
    Buyer(String FIO, String login, String password){
        this.FIO=FIO;
        this.login=login;
        this.password=password;
    }
    @Override
    public void login(){
        System.out.println("Пользователь:"+FIO +" логин:"+ login);
    }
    @Override
    public void password(){
        System.out.println("Пользователь:"+FIO +" пароль:"+ password);
    }
}
class Pensioner implements User {
    String FIO;
    String login;
    String password;

    Pensioner(String FIO, String login, String password) {
        this.FIO = FIO;
        this.login = login;
        this.password = password;
    }
    @Override
    public void login(){
        System.out.println("Пользователь:"+FIO +" логин:"+ login);
    }
    @Override
    public void password(){
        System.out.println("Пользователь:"+FIO +" пароль:"+ password);
    }
}
class Student implements User {
    String FIO;
    String login;
    String password;
    Student(String FIO, String login, String password) {
        this.FIO = FIO;
        this.login = login;
        this.password = password;
    }
    @Override
    public void login(){
        System.out.println("Пользователь:"+FIO +" логин:"+ login);
    }
    @Override
    public void password(){
        System.out.println("Пользователь:"+FIO +" пароль:"+ password);
    }
}
class Purchases implements User, Product{
    String FIO;
    String login;
    String password;
    String Name_Product;
    int price;
    int rating;
    Purchases(String FIO, String login, String password,String Name_Product, int price, int rating){
        this.FIO=FIO;
        this.login=login;
        this.password=password;
        this.Name_Product = Name_Product;
        this.price = price;
        this.rating = rating;
    }
    @Override
    public void Name_Product(){
        System.out.print(Name_Product +" ");
    }
    @Override
    public void price(){
        System.out.print(price +" ");
    }
    @Override
    public void rating(){
        System.out.println(rating +" ");
    }
    @Override
    public void login(){
        System.out.println("Пользователь:"+FIO +" логин:"+ login);
    }
    @Override
    public void password(){
        System.out.println("Пользователь:"+FIO +" пароль:"+ password);
    }
    void Shopping(){
        System.out.println("Покупатель: " + FIO+ " купил: "+ Name_Product);
    }
}
public class Main {
    public static void main(String[] args) {
        Product[] products= new Product[3];
        products[0] = new Table("стол Империя",12000,5);
        products [1] = new Chair("стул Мрамор",10000,4.8);
        products [2] = new Armchair("игровой стул Белая волна ",25000,4.7);

        for(int i =0;i< products.length;i++){
            products[i].Name_Product();
            products[i].price();
            products[i].rating();
        }
        Purchases [] purchases = new Purchases[1];
        purchases[0]=new Purchases("Бокун Даниил","264835","26566","стол Империя",12000,5);
        for(int i=0; i< purchases.length;i++){
            purchases[i].Name_Product();
            purchases[i].price();
            purchases[i].rating();
            purchases[i].login();
            purchases[i].password();
            purchases[i].Shopping();

        }
    }
}
