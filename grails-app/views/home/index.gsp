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

        <p><strong>${flash.message}</strong></p>

        <p>Welcome ${name}!</p>

        <p>There are ${articleTotal} articles on this site.</p>

        <form action="/home/submitName" method="post" style="margin: 0 auto; width:320px">
            <input type="text" name="name" value="" id="name">
            <input type="submit" name="Submit name" value="Submit name" id="Submit name">
        </form>

        <br>

        <div class="container">

            <div id="list-article-home" class="content">

                <div class="row">
                    <div class="dropdown">
                        <button href="#" class="dropdown-toggle" data-toggle="dropdown"
                                role="button">Filter by category</button>
                        <ul class="dropdown-menu">
                            <li><a href="${createLink(uri: '/')}">All</a></li>
                            <g:each var="category" in="${categories}">
                                <li>
                                    <a href="<g:createLink action="index"
                                                           params="[cat: category.id]"/>">${category.name}</a>
                                </li>
                            </g:each>
                        </ul>
                    </div>

                    <div class="panel panel-default widget">
                        <div class="panel-heading">
                            <h1 class="panel-title">Articles</h1>
                        </div>

                        <div class="panel-body">
                            <ul class="list-group">

                                <g:each var="article" in="${articleList}">

                                    <li class="list-group-item">
                                        <div class="row">
                                            <div class="col-xs-2 col-md-1">
                                                <img src="http://placehold.it/80" class="img-circle img-responsive"
                                                     alt=""/></div>

                                            <div class="col-xs-10 col-md-11">
                                                <div>
                                                    <a href="<g:createLink action="viewArticle"
                                                                           id="${article.id}"/>">${article.title}</a>

                                                    <div class="mic-info">
                                                        Category: ${article.category.name}
                                                    </div>

                                                    <div class="mic-info">
                                                        By: ${article.author} on <g:formatDate format="yyyy-MM-dd"
                                                                                               date="${article.publishDate}"/>
                                                    </div>
                                                </div>

                                            </div>
                                        </div>
                                    </li>

                                </g:each>

                            </ul>
                        </div>
                    </div>
                </div>


                <div class="pagination">
                    <g:paginate total="${articleCount ?: 0}"/>
                </div>
            </div>
        </div>

        <div id="controllers" role="navigation">
            <h2>Available Controllers:</h2>
            <ul>
                <g:each var="c" in="${grailsApplication.controllerClasses.sort { it.fullName }}">
                    <li class="controller">
                        <g:link controller="${c.logicalPropertyName}">${c.fullName}</g:link>
                    </li>
                </g:each>
            </ul>
        </div>

    </section>

</div>

</body>
</html>