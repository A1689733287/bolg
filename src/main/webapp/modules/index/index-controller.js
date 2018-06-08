app.controller("IndexController", ['$scope', '$rootScope', 'CommonService', function ($scope, $rootScope, CommonService) {
    /*点击排行*/
    CommonService.hitsRank().then(function (response) {
        $scope.hitsRank = response.data.data;
    });

    /*最新排行*/
    CommonService.newRank().then(function (response) {
        $scope.newRank = response.data.data;
    })

    /*分类*/
    CommonService.cate().then(function (response) {
        $scope.cates = response.data.data;
    });

}]);