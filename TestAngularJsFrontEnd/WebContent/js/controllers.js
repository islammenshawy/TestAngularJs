'use strict';

/* Controllers */

angular.module('myApp.controllers', [])
  .controller('MyCtrl1', ['$scope', 'Customers', function($scope, Customers) {
	  $scope.allcustomers = Customers.getCustomers();

  }])
  .controller('MyCtrl2', ['$scope', function($scope) {

  }]);
