package myapp

class Article {

    String title
    String contentText
    Date publishDate
    Date editDate
    Category category
    String author
    String lastEditBy

    static constraints = {

        title maxSize: 100
        contentText maxSize: 5000
        publishDate nullable: true
        editDate nullable: true
        lastEditBy nullable: true
    }
}
