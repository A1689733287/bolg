app.service('ArticleDetailService', ['RequestService', function (RequestService) {
    this.getDetail = function (id) {
        return RequestService.getRequest("/article/articleDteail/" + id + ".do", cfg_form);
    };

}])