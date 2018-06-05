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
    this.put = function (category) {
        return RequestService.putRequest("/manage/category.do", category, cfg_json);
    }
    this.deleteById = function (categoryId) {
        return RequestService.deleteRequest("/manage/category/" + categoryId + ".do", cfg_form);
    }
    this.listtype = function () {
        return RequestService.getRequest('/manage/typecate.do', cfg_form);
    }
}])