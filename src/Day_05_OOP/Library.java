package Day_05_OOP;

public class Library {
    public static void main(String[] args){

        Book[] books = new Book[3];
        books[0] = new Book("Java" ,"Herbert Schildt" , 585 );
        books[1] = new Book("C++" ,"Bjarne Stroustrup" , 667 );
        books[2] = new Book("C++" ,"Narasimha Karumanchi" , 999 );

        for(Book book : books ){
            System.out.println(book.title + " " + book.author + " ₹ " + book.price);
        }


    }
}
