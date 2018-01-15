package myapp

class BootStrap {

    public static final contentText = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed molestie efficitur posuere. " +
            "Proin sed pretium nibh. Curabitur sit amet elit in enim fermentum iaculis imperdiet sit amet nisl. Cras consequat id erat " +
            "in commodo. Proin tristique libero tortor. Phasellus mattis mattis tellus in lobortis. Donec ultricies vulputate gravida. " +
            "Aliquam nec vestibulum ex. Mauris porttitor ipsum urna, vitae dictum lorem malesuada sed. Integer elementum, diam porttitor " +
            "scelerisque mollis, tellus elit dignissim est, nec aliquet nisl dolor quis felis. Vivamus viverra ex sit amet fringilla porttitor. " +
            "Fusce vehicula elit at ultrices commodo. Curabitur lorem risus, lobortis a mi quis, ultricies ullamcorper lectus. Sed ex elit, " +
            "feugiat ac semper sed, porttitor ut nibh.\n" +
            "\n" +
            "Nulla posuere pretium est, quis placerat lorem mollis et. Cras enim tortor, porttitor nec congue faucibus, faucibus vitae " +
            "neque. Maecenas justo est, vehicula nec mattis id, ultrices egestas lorem. Nunc nisl ante, laoreet vitae fermentum nec, " +
            "interdum vel leo. Mauris at erat et leo scelerisque egestas. Curabitur lobortis nec enim in efficitur. Vestibulum varius " +
            "pharetra ligula vel pretium. Cras eu convallis tortor. Morbi aliquam magna sapien, in ultricies metus imperdiet ac. Quisque " +
            "vulputate cursus lobortis. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Fusce vitae " +
            "velit interdum, ornare ex a, maximus risus. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos.\n" +
            "\n" +
            "Vestibulum ac blandit lacus. Cras a est convallis turpis faucibus ornare quis eu lorem. Nullam mattis dui sit amet molestie " +
            "tincidunt. Nunc purus sapien, tempus vitae fermentum ut, consectetur et dolor. Nullam tristique maximus lacus, vel gravida " +
            "ante dignissim quis. Morbi sit amet dignissim dui. Cras vehicula rutrum ipsum, non cursus arcu lacinia quis. Etiam bibendum " +
            "posuere convallis. Fusce enim massa, mollis non purus a, sodales gravida mi. Fusce eu lobortis eros, ut finibus orci. Praesent " +
            "a tellus vitae sapien eleifend congue.\n" +
            "\n" +
            "Integer accumsan ante sed dapibus maximus. Sed tristique arcu vel dolor rhoncus hendrerit. Vivamus sagittis imperdiet metus " +
            "nec scelerisque. Mauris non rhoncus neque. Nullam vel eleifend est. In ut metus interdum, imperdiet nibh vitae, rhoncus nunc. " +
            "Aliquam sapien sem, hendrerit vel lacus consectetur, blandit dictum arcu. Maecenas dapibus felis mi, eu egestas nulla cursus at. " +
            "Proin in tortor elit. Morbi commodo, lorem ut rhoncus viverra, justo urna placerat turpis, eget imperdiet ex eros nec dui. In " +
            "hac habitasse platea dictumst. In non ante velit.\n" +
            "\n" +
            "Sed gravida, urna at sodales fringilla, nisi mauris tempus purus, convallis aliquet ligula elit nec erat. Suspendisse potenti. " +
            "Vestibulum fringilla eleifend velit, quis lobortis tortor luctus in. Integer non turpis blandit, dapibus mauris eleifend, " +
            "pretium neque. Phasellus ut odio in mauris placerat lobortis vel nec augue. Etiam efficitur dolor sed dui congue pulvinar. " +
            "Proin eleifend sem nulla, ac vehicula justo rhoncus ut."

    def init = { servletContext ->
        def category1 = new Category(name: "Nature").save()
        def category2 = new Category(name: "Sport").save()
        new Article(title: "Lion", contentText: contentText, publishDate: new Date(), author: "Mister", category: category1).save()
        new Article(title: "Tiger", contentText: contentText, publishDate: new Date(), author: "Mister", category: category1).save()
        new Article(title: "Biggest mountain", contentText: contentText, publishDate: new Date(), author: "Smith", category: category1).save()
        new Article(title: "Hockey", contentText: contentText, publishDate: new Date(), author: "Mister", category: category2).save()
        new Article(title: "Karate", contentText: contentText, publishDate: new Date(), author: "Jet Lee", category: category2).save()
    }
    def destroy = {
    }
}
