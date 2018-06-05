app.service('FreetimeDetailService', ['RequestService', function (RequestService) {
    this.get = function (id) {
        return RequestService.getRequest("article/article/id", cfg_form);
    }
}])