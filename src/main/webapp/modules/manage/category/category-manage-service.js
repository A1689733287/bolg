app.service("CategoryManageService", ['RequestService', function (RequestService) {
    this.list = function () {
        return RequestService.getRequest('/manage/category.do', cfg_form);
    };
    this.getArticles = function (categoryId) {
        return RequestService.getRequest('/manage/category/' + categoryId + ".do", cfg_form);
    }
    this.post = function (category) {
        return RequestService.postRequest("/manage/category.do", category, cfg_json);
    }

}])