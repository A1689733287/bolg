app.controller('ArticleDetailController', ['$scope', 'ArticleDetailService', '$routeParams', function ($scope, ArticleDetailService, $routeParams) {
    ArticleDetailService.getDetail(1).then(function (response) {
        console.log(response.data.data)
        $scope.art = response.data.data
    })
}])