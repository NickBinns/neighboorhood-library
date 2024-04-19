package com.pluralsight;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Book b1 = new Book(5, "203-854", "Catch-22", false, "");
        Book b2 = new Book(7, "278-987", "Thief In The Night", false, "");
        Book b3 = new Book(9, "328-1290", "The Great Gatsby", false, "");
        Book b4 = new Book(11, "102-5476", "The Hunger Games", false, "");
        Book b5 = new Book(13, "345-8382", "To Kill A Mockingbird", false, "");
        Book b6 = new Book(15, "112-9933", "The Lord Of The Rings", false, "");
        Book b7 = new Book(17, "034-8382", "Beast Of The East", false, "");
        Book b8 = new Book(19, "190-3453", "The Bigger Artist", false, "");
        Book b9 = new Book(21, "032-7834", "Almost Healed", false, "");
        Book b10 = new Book(23, "722-0579", "Signed To The Streets", false, "");
        Book b11 = new Book(25, "876-9932", "Lord Of The Flies", false, "");
        Book b12= new Book(27, "260-4360", "American Confession", false, "");
        Book b13 = new Book(30, "329-0043", "Dropping Jewels", false, "");
        Book b14 = new Book(33, "201-0234", "Diary Of A Wimpy Kid", false, "");
        Book b15 = new Book(35, "654-2354", "Moby Dick", false, "");
        Book b16 = new Book(37, "190-0019", "Brave New World", false, "");
        Book b17 = new Book(41, "202-3101", "The Philistines", false, "");
        Book b18 = new Book(44, "890-1245", "Animal Farm", false, "");
        Book b19 = new Book(46, "670-9038", "Dork Diaries", false, "");
        Book b20 = new Book(50, "182-7693", "Slaughterhouse 5", false, "");


        Book[] books = {
                b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18, b19, b20
        };

        System.out.println("Please pick a book from the following list: \n");

        printAllBooks(books);




        boolean found = false;

        while(!found) {
            System.out.println("Enter the id number of the book you want: ");
            // Read in a number
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            int inputNumber = Integer.parseInt(input);

            Book theBook = findBookById(inputNumber, books);
            if (theBook != null ) found = true;

            if (found) {
                System.out.println("Here is the book I wanted!");
                System.out.println(theBook);

            } else {
                System.out.println("Sorry we do not have that book at the moment");
            }
        }
    }


    static void printAllBooks(Book[] books) {
        for (Book b : books) {
            System.out.println(b.getId() + ":  " + b.getTitle());
        }
    }

    static Book findBookById(int id, Book[] books) {
        for (Book b : books) {
            if (id == b.getId()) {
                return b;
            }
        }
        return null;
    }

}
