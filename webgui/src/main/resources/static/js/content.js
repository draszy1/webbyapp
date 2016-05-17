function Hello($scope, $http) {
    $http.get('http://localhost:8088/content/panel').
        success(function(data) {
            $scope.content = data;
        });
}
