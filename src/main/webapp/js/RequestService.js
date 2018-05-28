app.service("RequestService", function ($http, $q) {
    /*get请求*/
    this.getRequest = function (url, paramType) {
        /*延迟加载*/
        var deferred = $q.defer();
        $http.get(url, paramsType).then(function (response) {
            deferred.resolve(response)
        }).catch(function (e) {
            console.log(e)
        });
        return deferred.promise;
    };

    /*post请求*/
    this.postRequest = function (url, params, paramType) {
        var deferred = $q.defer();
        $http.post(url, params, paramType).then(function (response) {
            deferred.resolve(response)
        }).catch(function (e) {
            console.log(e);
        });
        return deferred.promise;
    };
    /*put修改请求*/
    this.putRequest = function (url, params, paramsType) {
        var deferred = $q.defer();
        $http.put(url, params, paramsType).then(function (response) {
            deferred.resolve(response)
        });
        return deferred.promise;
    };
    /*delete删除请求*/
    this.deleteRequest = function (url, paramsType) {
        var deferred = $q.defer();
        $http.delete(url, paramsType).then(function (response) {
            deferred.resolve(response)
        }).catch(function (e) {
            console.log(e)
        });
        return deferred.promise;
    };
});