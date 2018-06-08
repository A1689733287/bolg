app.service("AboutManageService", ['RequestService', function (RequestService) {
    this.get = function () {
        return RequestService.getRequest("/manage/author.do");
    };
    this.post = function (info) {
        return RequestService.postRequest("/manage/update.do", info, cfg_json);
    };
}]);