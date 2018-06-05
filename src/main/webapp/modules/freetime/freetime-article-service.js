app.service('FreeTimeArticleService', ['RequestService', function (RequestService) {
    this.list = function () {
        return RequestService.getRequest("/article/article/2.do", cfg_form);
    };
}]);