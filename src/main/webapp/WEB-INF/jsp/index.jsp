<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ngApp" value="app"/>
<c:set var="ngController" value="ctrl"/>

<%@include file="include/header.jspf" %>

		<!-- /section:basics/navbar.layout -->
		<div class="main-container" id="main-container">
			<script type="text/javascript">
				try{ace.settings.check('main-container' , 'fixed')}catch(e){}
			</script>

			<!-- #section:basics/sidebar -->
			<div id="sidebar" class="sidebar responsive">
				<script type="text/javascript">
					try{ace.settings.check('sidebar' , 'fixed')}catch(e){}
				</script>

				<div class="sidebar-shortcuts" id="sidebar-shortcuts">
					<div class="sidebar-shortcuts-large" id="sidebar-shortcuts-large">
						<button class="btn btn-success">
							<i class="ace-icon fa fa-signal"></i>
						</button>

						<button class="btn btn-info">
							<i class="ace-icon fa fa-pencil"></i>
						</button>

						<!-- #section:basics/sidebar.layout.shortcuts -->
						<button class="btn btn-warning">
							<i class="ace-icon fa fa-users"></i>
						</button>

						<button class="btn btn-danger">
							<i class="ace-icon fa fa-cogs"></i>
						</button>

						<!-- /section:basics/sidebar.layout.shortcuts -->
					</div>

					<div class="sidebar-shortcuts-mini" id="sidebar-shortcuts-mini">
						<span class="btn btn-success"></span>

						<span class="btn btn-info"></span>

						<span class="btn btn-warning"></span>

						<span class="btn btn-danger"></span>
					</div>
				</div><!-- /.sidebar-shortcuts -->
				
				<%@include file="include/menu.jspf" %>

				<!-- /section:basics/sidebar.layout.minimize -->
				<script type="text/javascript">
					try{ace.settings.check('sidebar' , 'collapsed')}catch(e){}
				</script>
			</div>

			<!-- /section:basics/sidebar -->
			<div class="main-content">
				<!-- #section:basics/content.breadcrumbs -->
				<div class="breadcrumbs" id="breadcrumbs">
					<script type="text/javascript">
						try{ace.settings.check('breadcrumbs' , 'fixed')}catch(e){}
					</script>

					<ul class="breadcrumb">
						<li>
							<i class="ace-icon fa fa-home home-icon"></i>
							<a href="#">主页</a>
						</li>
						
						<li class="active">REST API</li>
						
					</ul><!-- /.breadcrumb -->

					<!-- #section:basics/content.searchbox -->
					<div class="nav-search" style="top:5px;"></div>
					<!-- /section:basics/content.searchbox -->
					
				</div>

				<!-- /section:basics/content.breadcrumbs -->
				<div class="page-content">					
					<div class="page-content-area">
					
					
						<div class="row">
							<div class="col-xs-12">
								<!-- PAGE CONTENT BEGINS -->
									
								<div class="row">
									<div class="col-xs-6 col-sm-2">
										<h3 class="header blue lighter smaller">
											<i class="ace-icon fa fa-folder-o smaller-90"></i>
											TABLE
										</h3>
										<br/>
										<select ng-model="table" style="width:100%" ng-change="tableChang()" ng-init="table=''">
											<option value="">请选择</option>
											<option value="{{api.id}}" ng-repeat="api in data.apis">{{api.serviceName}}</option>
										</select>
									</div>
									<div class="col-xs-6 col-sm-10">
										<h3 class="header blue lighter smaller">
											<i class="ace-icon fa fa-folder-o smaller-90"></i>
											API
										</h3>																
									
										<div id="tabs" class="ui-tabs ui-widget ui-widget-content ui-corner-all">
										<ul class="ui-tabs-nav ui-helper-reset ui-helper-clearfix ui-widget-header ui-corner-all" role="tablist">
											<li class="ui-state-default ui-corner-top ui-tabs-active ui-state-active" role="tab" tabindex="0" aria-controls="tabs-1" aria-labelledby="ui-id-29" aria-selected="true" aria-expanded="true">
												<a href="#tabs-1" class="ui-tabs-anchor" role="presentation" tabindex="-1" id="ui-id-29">增&nbsp;&nbsp;加</a>
											</li>

											<li class="ui-state-default ui-corner-top" role="tab" tabindex="-1" aria-controls="tabs-2" aria-labelledby="ui-id-30" aria-selected="false" aria-expanded="false">
												<a href="#tabs-2" class="ui-tabs-anchor" role="presentation" tabindex="-1" id="ui-id-30">删&nbsp;&nbsp;除</a>
											</li>

											<li class="ui-state-default ui-corner-top" role="tab" tabindex="-1" aria-controls="tabs-3" aria-labelledby="ui-id-31" aria-selected="false" aria-expanded="false">
												<a href="#tabs-3" class="ui-tabs-anchor" role="presentation" tabindex="-1" id="ui-id-31">修&nbsp;&nbsp;改</a>
											</li>

											<li class="ui-state-default ui-corner-top" role="tab" tabindex="-1" aria-controls="tabs-4" aria-labelledby="ui-id-32" aria-selected="false" aria-expanded="false">
												<a href="#tabs-4" class="ui-tabs-anchor" role="presentation" tabindex="-1" id="ui-id-32">查&nbsp;&nbsp;询</a>
											</li>
										</ul>

										<div id="tabs-1" aria-labelledby="ui-id-29" class="ui-tabs-panel ui-widget-content ui-corner-bottom" role="tabpanel" aria-hidden="false">
											<table>
											<thead>
											<th>字段</th>
											<th>录入</th>
											</thead>
											<tbody>
											<tr ng-repeat="classStruction in apiData.classStructions" ng-hide="classStruction.isPrimary">
											<td style="width:150px;">{{classStruction.fieldName}}</td>
											<td style="width:500px;"><input type="text" style="width:100%" /></td>
											</tr>
											</tbody>
											</table>
											
											<button class="btn btn-info" type="button">提交</button>
											
										</div>

										<div id="tabs-2" aria-labelledby="ui-id-30" class="ui-tabs-panel ui-widget-content ui-corner-bottom" role="tabpanel" aria-hidden="true" style="display: none;">
											<p>Morbi tincidunt, dui sit amet facilisis feugiat, odio metus gravida ante, ut pharetra massa metus id nunc. Duis scelerisque molestie turpis. Morbi facilisis. Curabitur ornare consequat nunc. Aenean vel metus. Ut posuere viverra nulla..</p>
										</div>

										<div id="tabs-3" aria-labelledby="ui-id-31" class="ui-tabs-panel ui-widget-content ui-corner-bottom" role="tabpanel" aria-hidden="true" style="display: none;">
											<p>Mauris eleifend est et turpis. Duis id erat. Suspendisse potenti. Aliquam vulputate, pede vel vehicula accumsan, mi neque rutrum erat, eu congue orci lorem eget lorem. Praesent eu risus hendrerit ligula tempus pretium.</p>
										</div>
										
										<div id="tabs-4" aria-labelledby="ui-id-32" class="ui-tabs-panel ui-widget-content ui-corner-bottom" role="tabpanel" aria-hidden="true" style="display: none;">
											<p>Mauris eleifend est et turpis. Duis id erat. Suspendisse potenti. Aliquam vulputate, pede vel vehicula accumsan, mi neque rutrum erat, eu congue orci lorem eget lorem. Praesent eu risus hendrerit ligula tempus pretium.</p>
										</div>
									</div>
								</div>
								</div><!-- /.row -->
								
								
								<!-- PAGE CONTENT ENDS -->
							</div><!-- /.col -->
						</div><!-- /.row -->
					</div><!-- /.page-content-area -->
				</div><!-- /.page-content -->
			</div><!-- /.main-content -->
			
			<%@include file="include/footer.jspf" %>

			<a href="#" id="btn-scroll-up" class="btn-scroll-up btn btn-sm btn-inverse">
				<i class="ace-icon fa fa-angle-double-up icon-only bigger-110"></i>
			</a>
		</div><!-- /.main-container -->

		<!-- basic scripts -->

		<!--[if !IE]> -->
		<script type="text/javascript">
			window.jQuery || document.write("<script src='../assets/js/jquery.min.js'>"+"<"+"/script>");
		</script>

		<!-- <![endif]-->

		<!--[if IE]>
		<script type="text/javascript">
		 window.jQuery || document.write("<script src='../assets/js/jquery1x.min.js'>"+"<"+"/script>");
		</script>
		<![endif]-->
		
		<script type="text/javascript">
			if('ontouchstart' in document.documentElement) document.write("<script src='../assets/js/jquery.mobile.custom.min.js'>"+"<"+"/script>");
		</script>
		<script src="../assets/js/bootstrap.min.js"></script>

		<!-- page specific plugin scripts -->
		<script src="../assets/js/jquery-ui.min.js"></script>
		<script src="../assets/js/jquery.ui.touch-punch.min.js"></script>

		<!-- ace scripts -->
		<script src="../assets/js/ace-elements.min.js"></script>
		<script src="../assets/js/ace.min.js"></script>
		
<script>
jQuery(function($) {			
	$( "#tabs" ).tabs();
});

angular.module('app', ['ngResource'])
.factory('apiDao', function($resource) {
	return {
		getApis:function() {
			return $resource('/api/get_apis.json');
		},
		getApiStruction:function() {
			return $resource('/api/get_api_struction.json');
		}
	};
})
.controller('ctrl', ['$scope', 'apiDao',
	function($scope, apiDao) {
		$scope.tableChang = function() {
			if ($scope.table != null && $scope.table != "") {
				$scope.apiData = apiDao.getApiStruction().save({serviceId:$scope.table});
			}
		};
	
		$scope.getApis = function(){
			$scope.data = apiDao.getApis().save();
		};
		
		$scope.getApis();
	}
]);
</script>
	</body>
</html>
