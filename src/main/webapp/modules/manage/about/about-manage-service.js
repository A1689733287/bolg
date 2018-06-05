app.service("AboutManageService", ['RequestService', function (RequestService) {
    this.get = function () {
        return RequestService.getRequest("/manage/author.do");
    };
    this.put = function (info) {
        return RequestService.putRequest("/manage/author.do", info, cfg_json);
    };
}]);