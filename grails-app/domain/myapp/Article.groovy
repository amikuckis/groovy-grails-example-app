package myapp

class Article {

    String title
    String contentText
    Date publishDate
    Date editDate
    Category category

    static constraints = {

        title maxSize: 100
        contentText maxSize: 5000
    }
}
