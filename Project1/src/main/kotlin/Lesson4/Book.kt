open class Books(val tittle: String, val author: String) {
    private var curretPage = 1
    open fun readPage() {
        curretPage++
    }
}

class eBook(tittle: String, author: String, var format: String = "text"): Books(tittle, author) {
    private var wordsRead: Int = 0
    override fun readPage() {
        wordsRead += 250
    }
}