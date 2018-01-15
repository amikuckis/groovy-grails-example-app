package myapp

import grails.gorm.transactions.Transactional

@Transactional
class HomeService {

    ArticleService articleService

    def getArticleListByCategory(Long categoryId) {
        if (categoryId != null) {
            def c = Article.createCriteria()
            def results = c.list {
                category {
                    eq('id', categoryId)
                }
                maxResults(10)
            }
        } else {
            Article.list()
        }
    }

}
