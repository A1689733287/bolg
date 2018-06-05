app.service('ArticleService', ['RequestService', function (RequestService) {
    this.list = function () {
        return RequestService.getRequest("/article/article/1.do", cfg_form);
    };
}])