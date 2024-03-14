public class Main {
    public static void main(String[] args) {
        MP3 mp3 = new MP3("hehe", "may nghe nhac", "1234", 49.99f, 120);
        Book book = new Book("vi cau la ban nho cua to", "sach chon", "5678", 29.99f, "Tool Pahm", 500, "Chon");
        mp3.showInfo();
        System.out.println();
        book.showInfo();
    }
}
