var app = angular.module("myApp", []);

app.controller("myCtrl", function ($scope) {
  console.log("My controller.....");

  $scope.users = [
    {name: "Product One", email: "$22.5", fullname: "Dang Kim Thi"},
    {name: "Product Two", email: "$15.00", fullname: "Ho Viet Duc" },
    {name: "Product Four", email: "$123.82", fullname: "Code Lean" },
    {name: "Product Five", email: "$123.75", fullname: "Code Lean" },


  ];

  $scope.addUser = function () {
    $scope.users.push($scope.newUser);
    $scope.newUser = {};
    $scope.message = "New User Added successfully";
  };
  $scope.selectUser = function (user) {
    console.log(user);
    $scope.clickedUser = user;
  };
  $scope.editUser = function () {
    $scope.message = "User Edited successfully";
  };

  $scope.deleteUser = function () {
    $scope.users.slice($scope.users.index0f($scope.clickedUser));
    $scope.message = "User Deleted successfully";
  };
  $scope.clearMessage = function () {
    $scope.message = "";
  };
});
