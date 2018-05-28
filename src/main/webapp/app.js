var app = angular.module("app", ["ngRoute", "ngSanitize"]);
app.config(function ($routeProvider, $locationProvider) {
    $routeProvider.when("/", {
        templateUrl: "modules/index/index-view.html",
        controller: 'IndexController'
    }).when("/article", {
        templateUrl: "modules/article/article-view.html",
        controller: 'ArticleController'
    }).when('/manage', {
        templateUrl: 'modules/manage/mangae-view.html',
        controller: 'ManageController'
    }).when('/manage/signin', {
        templateUrl: 'modules/manage/signin/signin-view.html',
        controller: 'SigninController'
    }).when("/404", {
        templateUrl: "modules/common/404.view.html"
    });
    $routeProvider.otherwise({
        redirectTo: '/404'
    });

    $locationProvider.hashPrefix('!');
});

app.run(["$rootScope", "$location", "$window", function ($rootScope, $location, $window) {
    $rootScope.showNav = true;
    $rootScope.$on("$routeChangeStart", function (event, nextRoute, currentToute) {
        var t = sessionStorage.getItem("token");
        if (nextRoute != null && nextRoute.requiredLogin != null && nextRoute.requiredLogin &&
            (t == undefined || t == "" || t == "null" || t == null)) {
            $location.path("/manage/signin");
        }
    });

}]);