app.controller("AboutFromManageController", ['$location', '$scope', 'AboutManageService', function ($location, $scope, AboutManageService) {
    var getInfo = function () {
        AboutManageService.get().then(function (data) {
            if (data.resultData != null) {
                $scope.info = data.resultData;
            }
        })
    }
    $scope.updateInfo = function (info) {
        console.log(info)
        AboutManageService.put(info).then(function (data) {
            //console.log(data)
            if (data.resultCode == 1) {
                $location.path("/manage/info");
            }
        })
    }
    getInfo();

}]);