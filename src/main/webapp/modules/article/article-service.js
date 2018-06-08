app.service('ArticleService', ['RequestService', function (RequestService) {
    this.list = function () {
        return RequestService.getRequest("/article/article.do", cfg_form);
    };
}])