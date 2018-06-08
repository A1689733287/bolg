app.controller('AboutMeController', ['$scope', 'AboutMeService', 'CommonService', function ($scope, AboutMeService, CommonService) {
    var getInfo = function () {
        AboutMeService.get().then(function (response) {
            $scope.info = response.data.data;
        });
    }
    getInfo();

    /*点击排行*/
    CommonService.hitsRank().then(function (response) {
        $scope.hitsRank = response.data.data;
    });

    /*最新排行*/
    CommonService.newRank().then(function (response) {
        $scope.newRank = response.data.data;
    })
}]);