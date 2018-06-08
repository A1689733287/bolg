app.controller('ArticleDetailController', ['$scope', 'ArticleDetailService', '$routeParams', 'CommentService', 'CommonService', function ($scope, ArticleDetailService, $routeParams, CommentService, CommonService) {
    ArticleDetailService.getDetail($routeParams.articleCode).then(function (response) {
        $scope.currentArticle = response.data.data.currArticle;
        $scope.prevArticle = response.data.data.prevArticle;
        $scope.nextArticle = response.data.data.nextArticle;
        CommentService.list($scope.currentArticle.id).then(function (response) {
            $scope.comments = response.data.data;
        })
    })

    $scope.addCommon = function () {
        var articleCommon = {};
        articleCommon.articleId = $scope.currentArticle.id;
        articleCommon.guestName = $scope.penName;
        articleCommon.content = $scope.commentContent;
        CommentService.commit(articleCommon).then(function (response) {
            if (response.data.data = true) {
                layui.use('layer', function () {
                    layer.msg(response.data.msg, {icon: 6});
                });
                $scope.penName = "";
                $scope.commentContent = "";
                CommentService.list($scope.currentArticle.id).then(function (response) {
                    $scope.comments = response.data.data;
                })
            }
        });
    }

    /*分类*/
    CommonService.cate().then(function (response) {
        $scope.cates = response.data.data;
    });

    /*点击排行*/
    CommonService.hitsRank().then(function (response) {
        $scope.hitsRank = response.data.data;
    });

    /*最新排行*/
    CommonService.newRank().then(function (response) {
        $scope.newRank = response.data.data;
    })

}])