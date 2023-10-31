public class Cart {
    // Hằng số đại diện cho số lượng tối đa các DVD có thể đặt hàng
    public static final int MAX_NUMBERS_ORDERED = 20;
    // Mảng lưu trữ danh sách các DVD đặt hàng
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];

    // Hàm tạo của lớp Cart
    public Cart() {
        super();
    }

    // Phương thức tính tổng giá trị của tất cả các DVD trong giỏ hàng
    public float totalCost() {
        float total = 0f;
        for (int i = 0; i < MAX_NUMBERS_ORDERED; i++) {
            if (itemsOrdered[i] != null) {
                total = total + itemsOrdered[i].getCost();
            }
        }
        return total;
    }

    // Phương thức thêm một DVD vào giỏ hàng
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        for (int i = 0; i < MAX_NUMBERS_ORDERED; i++) {
            if (itemsOrdered[i] == null) {
                itemsOrdered[i] = disc;
                break;
            }
        }
    }

    // 2.1. Nạp chồng phương thức bằng cách khác biệt trong kiểu tham số
    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
        for (DigitalVideoDisc disc : dvdList) {
            addDigitalVideoDisc(disc);
        }
    }

    // 2.2. Nạp chồng phương thức bằng cách khác biệt trong số lượng tham số
    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        addDigitalVideoDisc(dvd1);
        addDigitalVideoDisc(dvd2);
    }

    // Phương thức loại bỏ một DVD khỏi giỏ hàng
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        for (int i = 0; i < MAX_NUMBERS_ORDERED; i++) {
            if (itemsOrdered[i] == disc) {
                itemsOrdered[i] = null;
            }
        }
    }
}
