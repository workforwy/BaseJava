package c02_enum.varparams;

/**书*/
class Book{
    //has a (关联关系):不存在整体部分关系
    private Author author;
    public void setAuthor(Author author) {
        this.author = author;
    }
}
/**作者*/
class Author{}
public class RelationDemo01 {
    public static void main(String[] args) {
        Book book=new Book();
        Author author=new Author();
        book.setAuthor(author);
    }
}

