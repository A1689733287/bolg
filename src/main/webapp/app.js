var app = angular.module("app", ["ui.bootstrap", "ngRoute", "ui.router", "ngSanitize"]);

app.config(function ($routeProvider, $locationProvider) {
    /*前端页面*/
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
    }).when('/article/:articleCode', {
        templateUrl: 'modules/article/article-detail-view.html',
        controller: 'ArticleDetailController'
    }).when('/archive', {
        templateUrl: 'modules/archive/article-archive.html',
        controller: 'ArticleArchiveController'
    }).when('/about', {
        templateUrl: 'modules/about/about.html',
        controller: 'AboutMeController'
    }).when("/404", {
        templateUrl: "modules/common/404.view.html"
    });

    /*后端模块*/
    $routeProvider.when('/manage', {
        templateUrl: 'modules/manage/mangae-view.html',
        controller: 'ManageController'
    }).when('/manage/signin', {
        templateUrl: 'modules/manage/signin/signin-view.html',
        controller: 'SigninController'
    }).when("/manage/about", {
        templateUrl: "modules/manage/about/about-manage-view.html",
        controller: 'AboutManageController'
    }).when("/manage/about/edit", {
        templateUrl: "modules/manage/about/about-form-manage-view.html",
        controller: 'AboutFromManageController'
    }).when("/manage/article", {
        templateUrl: "modules/manage/article/article-manage-view.html",
        controller: 'ArticleManageController'
    }).when("/manage/article/new", {
        templateUrl: "modules/manage/article/article-form-manage-view.html",
        controller: 'ArticleFormManageController'
    }).when("/manage/category", {
        templateUrl: "modules/manage/category/category-manage-view.html",
        controller: 'CategoryManageController'
    }).when("/manage/tag", {
        templateUrl: "modules/manage/tag/tag-manage-view.html",
        controller: 'TagManageController'
    });

    $routeProvider.otherwise({
        redirectTo: '/404'
    });

    $locationProvider.hashPrefix('!');
});

app.filter("trusted", ["$sce", function ($sce) {
    return function (html) {
        if ((typeof html) == 'string') {
            // 判断类型为字符串
            return $sce.trustAsHtml(html);
        }
        return html;
    }
}]);

app.run(["$rootScope", "$location", "$window", function ($rootScope, $location, $window) {
    $rootScope.$on("$routeChangeStart", function (event, nextRoute, currentToute) {
        var t = sessionStorage.getItem("token");
        if (nextRoute != null && nextRoute.requiredLogin != null && nextRoute.requiredLogin &&
            (t == undefined || t == "" || t == "null" || t == null)) {
            $location.path("/manage/signin");
        }
    });

}]);