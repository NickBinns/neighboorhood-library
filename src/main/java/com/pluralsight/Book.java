package com.pluralsight;

public class Book {
    String title;
    String isbn;
    int id;
    Boolean isCheckedOut;
    String checkedOutTo;



    Book() {
        id = 0;
        isbn = "";
        title = "";
        isCheckedOut = false;
        checkedOutTo = "";
    }

    public Book(int id, String isbn, String title, boolean isCheckedOut, String checkedOutTo) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.isCheckedOut = isCheckedOut;
        this.checkedOutTo = checkedOutTo;
    }

    public int getId() {
        return id;
    }


    public String getIsbn() {
        return isbn;
    }


    public String getTitle() {
        return title;
    }


    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public void setCheckedOut(boolean checkedOut) {
        isCheckedOut = checkedOut;
    }

    public String getCheckedOutTo() {
        return checkedOutTo;
    }

    public void setCheckedOutTo(String checkedOutTo) {
        this.checkedOutTo = checkedOutTo;
    }

    @Override
    public String toString() {
        String sb = "Book{" + "id=" + id +
                ", isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", isCheckedOut=" + isCheckedOut +
                ", checkedOutTo='" + checkedOutTo + '\'' +
                '}';
        return sb;
    }
}
