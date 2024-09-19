 class Book {
    static int totalNumberOfBooks;
    String title;
    String author;
    String isbn;
    boolean isBorrowed;
    static {
        totalNumberOfBooks=0;
    }

     {
         totalNumberOfBooks++;
     }

    Book(String isbn , String author , String title) {
        this.isbn = isbn;
        this.author = author;
        this.title = title;
    }
    Book(String isbn){
        this(isbn , "Unknown" , "Unknown");
    }
    static int getTotalNumberOfBooks(){
        return totalNumberOfBooks;
    }
    void borrowBook(){
        if(isBorrowed){
            System.out.println("Book is already borrowed");
        }else {
            this.isBorrowed=true;
            System.out.println("Enjoy" + this.title);
        }

    }
    void returnBook(){
        if(isBorrowed){
            this.isBorrowed=false;
            System.out.println("Hope you like it,Please drop a review");
        }else {
            System.out.println("This book is already in a library");
        }
    }

     public static void main(String[] args) {
         Book javaBasics=new Book("1", "sabya","Java");
         Book myBook=new Book("2");
         System.out.println(Book.getTotalNumberOfBooks());
         javaBasics.borrowBook();
         myBook.borrowBook();
         javaBasics.borrowBook();
         javaBasics.returnBook();
         javaBasics.returnBook();

     }

}
