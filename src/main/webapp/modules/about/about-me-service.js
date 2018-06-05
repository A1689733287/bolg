app.service('AboutMeService', ['RequestService', function (RequestService) {
    this.get = function () {
        return RequestService.getRequest("/about/author.do", cfg_form);
    }
}]);