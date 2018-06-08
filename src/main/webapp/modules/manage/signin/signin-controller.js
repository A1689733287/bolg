app.controller('SigninController', ['$scope', '$rootScope', 'SigninService', '$location', function ($scope, $rootScope, SigninService, $location) {
    var user = {
        userName: "",
        passWord: ""
    };

    $scope.signOut = function () {
        SigninService.delete().then(function (data) {
            sessionStorage.removeItem("token");
            $location.path("/manage/signin");
        });
    };
    $scope.signIn = function () {
        user.userName = $scope.account;
        user.passWord = Md5($scope.userpass);
        user.code = $scope.captche;
        SigninService.post(user).then(function (response) {
            if (response.data.code == 500) {
                layui.use('layer', function () {
                    layer.msg(response.data.msg, {icon: 5});
                });
                return false;
            }
            if (response.data.code == 404) {
                layui.use('layer', function () {
                    layer.msg(response.data.msg, {icon: 5});
                });
                return false;
            }
            if (response.data.code == 200) {
                $location.path("/manage/about")
            }
            if (response.data.code == 300) {
                layui.use('layer', function () {
                    layer.msg(response.data.msg, {icon: 5});
                });
                return false;
            }
        });
    };

    $scope.refreshCode = function () {
        $("#catpche").attr('src', '/manage/getCaptcha.do?date=' + new Date().getTime());
    };


    function Md5(data) {
        var hash = md5.create();
        hash.update(data);
        return hash.hex().substr(0, 16);
    }
}]);