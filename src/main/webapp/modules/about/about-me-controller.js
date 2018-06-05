app.controller('AboutMeController', ['$scope', 'AboutMeService', function ($scope, AboutMeService) {
    var getInfo = function () {
        AboutMeService.get().then(function (response) {
            $scope.info = response.data.data;
        });
    }
    getInfo();
}]);