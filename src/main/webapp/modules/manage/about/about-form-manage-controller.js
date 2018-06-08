app.controller("AboutFromManageController", ['$location', '$scope', 'AboutManageService', function ($location, $scope, AboutManageService) {
    var getInfo = function () {
        AboutManageService.get().then(function (response) {
            if (response.data != null) {
                $scope.info = response.data.data;
            }
        })
    }
    $scope.updateInfo = function (info) {
        info.aboutMe = editor.txt.html();
        console.log(info)
        AboutManageService.post(info).then(function (response) {
            //console.log(data)
            if (response.data.code == 200) {
                $location.path("/manage/about");
            }
        })
    }
    getInfo();

}]);