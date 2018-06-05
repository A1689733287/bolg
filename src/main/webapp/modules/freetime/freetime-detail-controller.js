app.controller('FreetimeDetailController', ['$scope', 'FreetimeDetailService', '$routeParams', function ($routeParams, $scope, FreetimeDetailService) {
    FreetimeDetailService.get($routeParams.articleCode).then(function (response) {
        console.log(response)
    });
}])