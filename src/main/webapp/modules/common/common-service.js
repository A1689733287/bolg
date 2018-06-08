app.service('CommonService', ["RequestService", function (RequestService) {
    this.cate = function () {
        return RequestService.getRequest("/category/category.do", cfg_form);
    }

    this.hitsRank = function () {
        return RequestService.getRequest("/article/hitsRangk.do", cfg_form);
    }

    this.newRank = function () {
        return RequestService.getRequest("/article/newRank.do", cfg_form);
    }
}]);