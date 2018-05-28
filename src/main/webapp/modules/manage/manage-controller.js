app.controller('ManageController', ['$scope', '$location', function($scope, $location) {
	var t = sessionStorage.getItem("token");
	if(t == undefined || t == "" || t == "null" || t == null) {
		$location.path("manage/signin");
	} else {
		$location.path("manage/index");
	}
}]);