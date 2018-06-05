app.service('SigninService', ["RequestService", function (RequestService) {
    this.post = function (user) {
        return RequestService.postRequest("/manage/signin.do", user, cfg_json);
    };

    this.delete = function () {
        return RequestService.deleteRequest("/mangage/signout.do", cfg_form);
    };

    this.getCaptche = function () {
        return RequestService.getRequest("/manage/getCaptcha.do", cfg_form);
    };

    this.checkCapt = function (data) {
        return RequestService.postRequest("/manage/checkCapt.do", data,cfg_json);
    }
}]);