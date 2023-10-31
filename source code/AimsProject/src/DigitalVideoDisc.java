public class DigitalVideoDisc {
    // Trường dữ liệu cho tiêu đề của DVD
    private String title;
    // Trường dữ liệu cho thể loại của DVD
    private String category;
    // Trường dữ liệu cho đạo diễn của DVD
    private String director;
    // Trường dữ liệu cho độ dài của DVD
    private int length;
    // Trường dữ liệu cho giá của DVD
    private float cost;

    // Hàm tạo cho DVD với chỉ tiêu đề
    public DigitalVideoDisc(String title) {
        super();
        this.title = title;
    }

    // Hàm tạo cho DVD với tiêu đề, thể loại và giá
    public DigitalVideoDisc(String title, String category, float cost) {
        super();
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    // Hàm tạo cho DVD với tiêu đề, thể loại, đạo diễn và giá
    public DigitalVideoDisc(String title, String category, String director, float cost) {
        super();
        this.title = title;
        this.category = category;
        this.director = director;
        this.cost = cost;
    }

    // Hàm tạo cho DVD với tiêu đề, thể loại, đạo diễn, độ dài và giá
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super();
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
    }

    // Phương thức truy xuất tiêu đề của DVD
    public String getTitle() {
        return title;
    }

    // Phương thức truy xuất thể loại của DVD
    public String getCategory() {
        return category;
    }

    // Phương thức truy xuất đạo diễn của DVD
    public String getDirector() {
        return director;
    }

    // Phương thức truy xuất độ dài của DVD
    public int getLength() {
        return length;
    }

    // Phương thức truy xuất giá của DVD
    public float getCost() {
        return cost;
    }
}
