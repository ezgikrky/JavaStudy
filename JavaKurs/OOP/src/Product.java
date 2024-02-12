public class Product {  //Özellik tutan class

    //final sadece constructor da set edilebiliyor final dışarıdan erişimikısıtlıypot
    // private sadece bu classın içerisinde geçerli demek

    //yazmak set, okumak get 
    //get ve seti yapmak için öncelikle aşağıdaki private alanları sadece bu classtan erişilebilir hale getirdik çünkü bu alanlar üzerinden kurallar getirebiliriz
    private int id; //this.id bunu işaret eder. //

    private String name;
    private double unitPrice; // fiyat
    private String detail;
    private double discount; //% kaç indirim olduğu ile alakalı
    // private double unitPriceAfterDiscount; // indirim uygulandıktan sonraki fiyat. bunu sadece okumamız lazım elimizcle değer vermemeliyiz


    public Product() {

    }



    public Product(int id, String name, double unitPrice, String detail, double discount) {

        super(); // bu olmasa yukarıdaki ben çalıştım ekranda 2 kere gözükürdü şimdi böyle yazarak 3 tane olmasını sağladık
        this.id = id; //bu classtaki id
        this.name = name;
        this.unitPrice = unitPrice;
        this.detail = detail;
        this.discount = discount;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }


    public double getUnitPriceAfterDiscount() { // sadece okuma yağacağımız için getter seçtik
        return unitPrice - (unitPrice * discount / 100);  // this.unitPrice- (this.unitPrice * this.dicount / 100) şeklinde de yazabilirdik
    }
}
