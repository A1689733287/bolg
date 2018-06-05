app.controller('FreeTimeArticleController', ['$scope', 'FreeTimeArticleService', function ($scope, FreeTimeArticleService) {
    var getArticle = function () {
        FreeTimeArticleService.list().then(function (response) {
            $scope.article = response.data.data;
        });
    }
    getArticle();
}]);