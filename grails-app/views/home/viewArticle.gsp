<%@ page import="myapp.Article" %>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Home Page</title>
</head>

<body>

<div id="content" role="main">
    <div class="nav" role="navigation">
        <ul>
            <li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
            <li><g:link controller="article" action="index">Article edit</g:link></li>
            <li><g:link controller="category" action="index">Category edit</g:link></li>
        </ul>
    </div>
    <section class="row colset-2-its">

        <div class="container">

            <div class="row">

                <div class="panel panel-default widget">
                    <div class="panel-heading">
                        <h1 class="panel-title">${article.title}</h1>
                    </div>

                    <div class="panel-body">

                        <div class="row">
                            <div class="col-xs-2 col-md-1">
                                <img src="http://placehold.it/80" class="img-circle img-responsive"
                                     alt=""/></div>

                            <div class="col-xs-10 col-md-11">

                                <div class="mic-info">
                                    By: ${article.author} on <g:formatDate format="yyyy-MM-dd"
                                                                           date="${article.publishDate}"/>
                                </div>

                                <div class="comment-text">
                                    Category: ${article.category.name}
                                </div>

                                <br>

                                <div class="text-area">
                                    <p class="text-center">${article.contentText}</p>
                                </div>

                            </div>
                        </div>
                    </div>
                </div>
            </div>

        </div>

    </section>

</div>

</body>
</html>