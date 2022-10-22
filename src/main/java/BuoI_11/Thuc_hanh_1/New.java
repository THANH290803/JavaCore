package BuoI_11.Thuc_hanh_1;

public class New implements INew{
    private String title;
    private String author;
    private String publicDate;
    private double rate;


    public New(){}
    public New(String title, String author, String publicDate, String rate) {
        this.title = title;
        this.author = this.author;
        this.publicDate = this.publicDate;
        this.rate = this.rate;
    }

    @Override
    public String toString() {
        return "New{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publicDate='" + publicDate + '\'' +
                ", rate=" + rate +
                '}';
    }


    @Override
    public void display() {
        System.out.println(toString());
    }
}


