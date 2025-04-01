package com.api.book.bootRestApiBook.services;

import com.api.book.bootRestApiBook.Model.BookDTO;
import com.api.book.bootRestApiBook.Repo.BookRepository;
import com.api.book.bootRestApiBook.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class BookService {

    @Autowired
private BookRepository bookRepository;
   // public static List<Book> list=new ArrayList<>();

//    static {
//        list.add(new Book("Wings Of Fire",12,"APJ Abdil Kalam"));
//        list.add(new Book("JAVA",121,"ABC"));
//        list.add(new Book("Python",112,"Robert Hook"));
//    }

    //Get All Books
    public List<Book> getAllBooks(){

//
        return (List<Book>) bookRepository.findAll();
    }


    //Get Single Boook By ID
    public Book getBookByID(int id) {
//        Book book =null;
//        try {
////            book = list.stream()
////                    .filter(e -> e.getId() == id)
////                    .findFirst()
////                    .get();
//            book=this.bookRepository.findById(id);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//         return book;
        Optional<Book> bookOptional = bookRepository.findById(id);
        return bookOptional.orElse(null);

    }

    //Adding Book:
    public BookDTO addBook(BookDTO book){
        //list.add(b);
        //return b;
//        Book result = (Book) bookRepository.save(book);
//        return result;

        Book book1=new Book();
        book1.setAuthor(book.getAuthor());
        book1.setTitle(book.getTitle());
        Book save = bookRepository.save(book1);


        return toDto(save);
    }

    public BookDTO toDto(Book book){
        BookDTO bookDTO=new BookDTO();
        bookDTO.setAuthor(book.getAuthor());
        bookDTO.setTitle(book.getTitle());

        return bookDTO;
    }


    //Delete Book:
    public void deleteBook(int bid){
//
//        list=list.stream().filter(book->book.getId()!=bid).
//                collect(Collectors.toList());
        bookRepository.deleteById(bid);
    }


    //UpdateBook:

    public void updateBook(Book book, int bookId) {
//        list = list.stream().map(b -> {
//            if (b.getId() == bookId) {  // Compare ID correctly
//                b.setTitle(book.getTitle());
//                b.setAuthor(book.getAuthor());
//            }
//            return b;  // Return the modified book
//        }).collect(Collectors.toList());
        book.setId(bookId);

        bookRepository.save(book);
    }
}

