app.controller('SigninController', ['$scope', '$rootScope', 'SigninService', '$location', function($scope, $rootScope, SigninService, $location) {
   $scope.showNav = false;
    var user = {
        account: "",
        userpass: ""
    };

    $scope.signOut = function() {
        SigninService.delete().then(function(data) {
            sessionStorage.removeItem("token");
            $location.path("manage/signin");
        });
    };
    $scope.signIn = function() {
        user.account = $scope.account;
        user.userpass = $scope.userpass;
        console.log(user);
        SigninService.post(user).then(function (response) {
            console.log(response);
        });
    };

    $scope.refreshCode = function() {
        $("#catpche").attr('src', 'manage/getCaptcha?date=' + new Date().getTime());
    };
}]);