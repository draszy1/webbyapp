function Hello($scope, $http) {
    $http.get('http://localhost:8081/content/panel').
        success(function(data) {
            $scope.content = data;
        });
}
