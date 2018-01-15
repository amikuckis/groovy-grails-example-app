package myapp

class HomeController {

    HomeService homeService
    CategoryService categoryService
    ArticleService articleService

    def index(Integer cat) {
        def articleCount = (Article.count() == 0) ? "no" : Article.count()
        Long categoryId = cat ?: null
        respond([name: session.name ?: 'Unknown', articleList: homeService.getArticleListByCategory(categoryId), articleTotal: articleCount, categories: categoryService.list()])
    }

    def viewArticle(Long id) {
        respond(article: articleService.get(id))
    }

    def submitName(String name) {
        session.name = name

        flash.message = "Name submitted"

        redirect action: 'index'
    }

    def filterByCategory(Integer cat) {
        redirect action: 'index', params: [cat: cat]
    }
}
