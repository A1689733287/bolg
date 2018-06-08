app.controller('ArticleController', ['$scope', 'ArticleService','CommonService', function ($scope, ArticleService,CommonService) {
    var getArticle = function () {
        ArticleService.list().then(function (response) {
            $scope.article = response.data.data;
        });
    }
    getArticle()

    /*分类*/
    CommonService.cate().then(function (response) {
        $scope.cates = response.data.data;
    });

    /*点击排行*/
    CommonService.hitsRank().then(function (response) {
        $scope.hitsRank = response.data.data;
    });

    /*最新排行*/
    CommonService.newRank().then(function (response) {
        $scope.newRank = response.data.data;
    })
}]);