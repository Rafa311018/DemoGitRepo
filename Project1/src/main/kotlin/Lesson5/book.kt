import java.time.Year
import java.util.*

const val MaxBorrowBooks = 20

class Book (val title: String, val author: String, val year: Int, var pages: Int = 1000){

    fun returnAuthorTitle(): Pair <String, String>{
        return (title to author)
    }

    fun returnAll() : Triple <String, String, Int> {
        return Triple(title, author, year)
    }

    fun canBorrow(books: Int) = if (books == MaxBorrowBooks) false else true

    object Constans {
        const val BASE_URL = "http://freebooks.com/"
    }

    fun printURL() {
        println(Constans.BASE_URL + title + ".html")
    }

    companion object {
        val BASE_URL = "http://freebooks.com/"
    }

}

fun Book.Weight() : Double { return pages * 1.5}

fun Book.tornPages(torn: Int) =  if (torn == pages) 0 else pages -= torn

class Puppy() {
    fun playWithBook(book: Book) {
    book.tornPages(Random().nextInt(15))
    }
}



fun main(args: Array<String>) {
    val book = Book("Harry Potter and the Philosopher's Stone", "J. K. Rowling", 1997)

    val bookTitleAuthor = book.returnAuthorTitle()
    val bookTitleAuthorYear = book.returnAll()

    println("Here is your book ${bookTitleAuthor.first} written bye ${bookTitleAuthor.second}")
    println("Here is your book ${bookTitleAuthorYear.first} written bye ${bookTitleAuthorYear.second} in ${bookTitleAuthorYear.third} ")

    val allBooks = setOf("Hamlet", "Macbeth", "Romeo and Juliet", "A Midsummer Night's Dream", "Othello", "Much Ado About Nothing", "King Lear", "Twelfth Night")
    val libreary = mapOf("William Shakespeare" to allBooks)

    println(libreary.any() {it.value.contains("Hamlet")})

    val moreBooks = mutableMapOf("The Maze Runner" to "James Dashner")
    moreBooks.getOrPut("The Hunger Games"){ "Suzanne Collins"}
    moreBooks.getOrPut("The Maze Runner") { "James Dashner" }
    println(moreBooks)

    val puppy = Puppy()
    val books = Book("Harry Potter","J. K. Rowling",1999, 1350)

    println(books.pages)
    while (books.pages > 0) {
        puppy.playWithBook(books)
        println("${books.pages} pages left in ${books.title}")
    }
    println("there are no mores pages in ${books.title}")
}