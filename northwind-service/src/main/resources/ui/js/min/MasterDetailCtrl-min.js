var myApp=angular.module("myApp",["phantasm"]),northwindUri="uri:http://ultrastructure.me/ontology/com.chiralbehaviors/demo/northwind/v1";myApp.config(["$httpProvider",function(t){t.defaults.useXDomain=!0,delete t.defaults.headers.common["X-Requested-With"]}]),myApp.service("Customers",["WorkspacePhantasm","PhantasmRelative",function(t,e){this.instances=function(){return t.facetInstances(northwindUri,"Agency","kernel|IsA","Customer")},this.instance=function(n){var r=e.instance(n);return t.facetInstance(northwindUri,"Agency","kernel|IsA","Customer",r)};var n=["orders","itemDetails"];this.ordersOf=function(r){var s=e.instance(r);return t.select(northwindUri,"Agency","kernel|IsA","Customer",s,n)}}]),myApp.filter("sumByKey",function(){return function(t,e){if("undefined"==typeof t||"undefined"==typeof e)return 0;for(var n=0,r=t.length-1;r>=0;r--)n+=parseInt(t[r][e]);return n}}),myApp.filter("customSum",function(){return function(listOfProducts,key){var total=0;return angular.forEach(listOfProducts,function(product){total+=eval("product."+key)}),total}}),myApp.filter("countItemsInOrder",function(){return function(t){var e=0;return angular.forEach(t,function(t){e+=t.Quantity}),e}}),myApp.filter("orderTotal",function(){return function(t){var e=0;return angular.forEach(t,function(t){e+=t.Quantity*t.UnitPrice}),e}}),myApp.controller("MasterDetailCtrl",["$scope","Customers",function(t,e){t.listOfCustomers=null,t.selectedCustomer=null,e.instances().get().then(function(e){t.listOfCustomers=e.instances,t.listOfCustomers.length>0&&(t.selectedCustomer=t.listOfCustomers[0]["@id"],t.loadOrders())}),t.selectCustomer=function(e){t.selectedCustomer=e["@id"],t.loadOrders()},t.loadOrders=function(){t.listOfOrders=null,e.ordersOf(t.selectedCustomer).get().then(function(e){t.listOfOrders=e})}}]);