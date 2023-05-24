import Exceptions.ContactNotFoundException;
import Exceptions.NoNameException;
import model.Book;
import model.Person;

public class Main {
    public static void main(String[] args) {
        Book book = new Book();

        try {
            book.addPerson(new Person("Axel", "223-5837346"));
            Person p = book.searchPerson("Carlos");
            System.out.println(p.toString());
        }
        catch (ContactNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
        catch (NoNameException e)
        {
            e.sendToServer();
        }
        catch (Exception e)
        {
            System.out.println("Please, reeboot.");
        }
        finally {
            System.out.println("End of program.");
        }
    }
        }