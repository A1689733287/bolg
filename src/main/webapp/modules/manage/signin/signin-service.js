app.service('SigninService', ["RequestService", function (RequestService) {
    this.post = function (user) {
        return RequestService.postRequest("manage/signin", user, cfg_json);
    };

    this.delete = function () {
        return RequestService.deleteRequest("mangage/signout", cfg_form);
    };

    this.getCaptche = function () {
        return RequestService.getRequest("manage/getCaptcha", cfg_form);
    };
}]);