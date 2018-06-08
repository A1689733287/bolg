app.service("CommentService", ["RequestService", function (RequestService) {
    this.commit = function (data) {
        return RequestService.postRequest('/comment/add.do', data, cfg_json);
    }

    this.list = function (articleId) {
        return RequestService.getRequest('/comment/list/' + articleId + '.do', cfg_form);
    }
}]);