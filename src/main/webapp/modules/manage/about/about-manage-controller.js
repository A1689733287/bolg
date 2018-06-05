app.controller("AboutManageController", ['$scope', 'AboutManageService', function ($scope, AboutManageService) {
    var getInfo = function () {
        AboutManageService.get().then(function (response) {
                if (response.data != null) {
                    console.log(response);
                    $scope.info = response.data.data;
                }
            }
        );
    }
    getInfo();
}]);