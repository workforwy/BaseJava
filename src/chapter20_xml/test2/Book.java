package chapter20_xml.day2101_xml;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private String isbn;
    private String name;
    private String publisher;
    private String pages;
    private String price;
    private List<String> authors = new ArrayList<String>();

    public Book() {
        super();
    }

    public Book(String isbn, String name, String publisher, String pages, String price, List<String> authors) {
        super();
        this.isbn = isbn;
        this.name = name;
        this.publisher = publisher;
        this.pages = pages;
        this.price = price;
        this.authors = authors;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPages() {
        return pages;
    }

    public void setPages(String pages) {
        this.pages = pages;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    @Override
    public String toString() {
        return "\n版号" + isbn + "\n书名" + name + "\n出版社" + publisher + "\n页数" + pages + "\n价格" + price + "\n作者" + authors;
    }
}
