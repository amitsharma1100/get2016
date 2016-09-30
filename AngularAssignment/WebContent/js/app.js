var myApp = angular.module("myApp", [ 'ui.bootstrap' ]);

// get the controller
myApp
		.controller(
				'myCtrl',
				[
						'$scope',
						'$http',
						// get the list of all customers
						function($scope, $http) {
							$http
									.get(
											'http://localhost:8080/AngularAssignment/rest/customers')
									.success(
											function(data) {
												var result = jQuery
														.parseJSON(JSON
																.stringify(data));
												$scope.customers = result;
												$scope.currentPage = 1;
												$scope.itemsPerPage = 8;
												$scope.totalItems = $scope.customers.customerVO.length;

												var ti = $scope.totalItems;
												var ipp = $scope.itemsPerPage;
												$scope.numPages = parseInt(ti
														/ ipp) + 1;

												angular
														.forEach(
																$scope.customers.customerVO,
																function(value,
																		key) {
																	var fullName = value.firstName
																			+ " "
																			+ value.lastName;
																	$scope.customers.customerVO[key].fullName = fullName;
																});

											}).error(function() {
										console.log("error");
									});

							$scope.changeViewClass = 'col-md-3';
							$scope.changeView = function(event) {
								if (event.target.id === 'grid') {
									$scope.changeViewClass = 'col-lg-3';
								} else {
									$scope.changeViewClass = 'col-lg-12';
								}
							};

							// function to close the card
							$scope.cancelBtn = function(id) {
								var id = event.target.name;
								$('#panel-' + id).remove();
							};

							// function to open card to get details for new
							// customer
							$scope.addCustomerPopUp = function(event) {
								Custombox.open({
									target : '#add-customer-modal',
									effect : 'blur',
									escKey : 'true'
								});
							};

							// function to add a new customer
							$scope.addCustomer = function() {
								var fname = $('#first_name').val();
								var lname = $('#last_name').val();
								var gender = $("input[name='gender']:checked")
										.val();
								var email = $('#email').val();
								var city = $('#city').val();
								var country = $('#country').val();
								var orders = $('#orders').val();

								var parameter = JSON.stringify({
									firstName : fname,
									lastName : lname,
									gender : gender,
									email : email,
									city : city,
									country : country,
									orders : orders
								});
								$http
										.post(
												'http://localhost:8080/AngularAssignment/rest/customers',
												parameter)
										.success(
												function(data, status, headers,
														config) {
													if (status == 201) {
														alert('Successfully added');
														$('#add-customer-modal')
																.hide();
													} else {
														alert('Can\'t be added');
													}
												}).error(
												function(data, status, headers,
														config) {
													alert(status);
												});
							};

						} ]);