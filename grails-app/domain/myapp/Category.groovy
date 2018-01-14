package myapp

class Category {

    String name

    static constraints = {

        name: maxSize:100
    }

    String toString() {
        name
    }
}
