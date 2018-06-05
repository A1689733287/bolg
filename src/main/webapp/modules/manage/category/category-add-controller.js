app.controller("addCategoryCtrl", ['CategoryManageService', '$uibModalInstance', '$scope', function ($uibModalInstance, $scope, CategoryManageService) {
    $scope.confirmAddCategory = function (category) {
        $uibModalInstance.close(category);
    };
    $scope.cancelAddCategory = function () {
        $uibModalInstance.dismiss('cancel');
    }
    var getList = function () {
        CategoryManageService.listtype().then(function (response) {
            console.log(response)
        });
    }
    getList()
}])