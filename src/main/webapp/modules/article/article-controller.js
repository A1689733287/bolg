app.controller('ArticleController', ['$scope', 'ArticleService', function ($scope, ArticleService) {
    var getArticle = function () {
        ArticleService.list().then(function (response) {
            $scope.article = response.data.data;
        });
    }
    getArticle()
}]);