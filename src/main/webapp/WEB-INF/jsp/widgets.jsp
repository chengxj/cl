<!DOCTYPE html>
<html lang="en">
	<head>
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
		<meta charset="utf-8" />
		<title>Widgets - Ace Admin</title>

		<meta name="description" content="Draggabble Widget Boxes &amp; Containers" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0" />

		<!-- bootstrap & fontawesome -->
		<link rel="stylesheet" href="../assets/css/bootstrap.min.css" />
		<link rel="stylesheet" href="../assets/css/font-awesome.min.css" />

		<!-- page specific plugin styles -->
		<link rel="stylesheet" href="../assets/css/jquery-ui.custom.min.css" />

		<!-- text fonts -->
		<link rel="stylesheet" href="../assets/css/ace-fonts.css" />

		<!-- ace styles -->
		<link rel="stylesheet" href="../assets/css/ace.min.css" id="main-ace-style" />

		<!--[if lte IE 9]>
			<link rel="stylesheet" href="../assets/css/ace-part2.min.css" />
		<![endif]-->
		<link rel="stylesheet" href="../assets/css/ace-skins.min.css" />
		<link rel="stylesheet" href="../assets/css/ace-rtl.min.css" />

		<!--[if lte IE 9]>
		  <link rel="stylesheet" href="../assets/css/ace-ie.min.css" />
		<![endif]-->

		<!-- inline styles related to this page -->

		<!-- ace settings handler -->
		<script src="../assets/js/ace-extra.min.js"></script>

		<!-- HTML5shiv and Respond.js for IE8 to support HTML5 elements and media queries -->

		<!--[if lte IE 8]>
		<script src="../assets/js/html5shiv.min.js"></script>
		<script src="../assets/js/respond.min.js"></script>
		<![endif]-->
	</head>

	<body class="no-skin">
		<!-- #section:basics/navbar.layout -->
		<div id="navbar" class="navbar navbar-default">
			<script type="text/javascript">
				try{ace.settings.check('navbar' , 'fixed')}catch(e){}
			</script>

			<div class="navbar-container" id="navbar-container">
				<!-- #section:basics/sidebar.mobile.toggle -->
				<button type="button" class="navbar-toggle menu-toggler pull-left" id="menu-toggler">
					<span class="sr-only">Toggle sidebar</span>

					<span class="icon-bar"></span>

					<span class="icon-bar"></span>

					<span class="icon-bar"></span>
				</button>

				<!-- /section:basics/sidebar.mobile.toggle -->
				<div class="navbar-header pull-left">
					<!-- #section:basics/navbar.layout.brand -->
					<a href="#" class="navbar-brand">
						<small>
							<i class="fa fa-leaf"></i>
							Ace Admin
						</small>
					</a>

					<!-- /section:basics/navbar.layout.brand -->

					<!-- #section:basics/navbar.toggle -->

					<!-- /section:basics/navbar.toggle -->
				</div>

				<!-- #section:basics/navbar.dropdown -->
				<div class="navbar-buttons navbar-header pull-right" role="navigation">
					<ul class="nav ace-nav">
						<li class="grey">
							<a data-toggle="dropdown" class="dropdown-toggle" href="#">
								<i class="ace-icon fa fa-tasks"></i>
								<span class="badge badge-grey">4</span>
							</a>

							<ul class="dropdown-menu-right dropdown-navbar dropdown-menu dropdown-caret dropdown-close">
								<li class="dropdown-header">
									<i class="ace-icon fa fa-check"></i>
									4 Tasks to complete
								</li>

								<li>
									<a href="#">
										<div class="clearfix">
											<span class="pull-left">Software Update</span>
											<span class="pull-right">65%</span>
										</div>

										<div class="progress progress-mini">
											<div style="width:65%" class="progress-bar"></div>
										</div>
									</a>
								</li>

								<li>
									<a href="#">
										<div class="clearfix">
											<span class="pull-left">Hardware Upgrade</span>
											<span class="pull-right">35%</span>
										</div>

										<div class="progress progress-mini">
											<div style="width:35%" class="progress-bar progress-bar-danger"></div>
										</div>
									</a>
								</li>

								<li>
									<a href="#">
										<div class="clearfix">
											<span class="pull-left">Unit Testing</span>
											<span class="pull-right">15%</span>
										</div>

										<div class="progress progress-mini">
											<div style="width:15%" class="progress-bar progress-bar-warning"></div>
										</div>
									</a>
								</li>

								<li>
									<a href="#">
										<div class="clearfix">
											<span class="pull-left">Bug Fixes</span>
											<span class="pull-right">90%</span>
										</div>

										<div class="progress progress-mini progress-striped active">
											<div style="width:90%" class="progress-bar progress-bar-success"></div>
										</div>
									</a>
								</li>

								<li class="dropdown-footer">
									<a href="#">
										See tasks with details
										<i class="ace-icon fa fa-arrow-right"></i>
									</a>
								</li>
							</ul>
						</li>

						<li class="purple">
							<a data-toggle="dropdown" class="dropdown-toggle" href="#">
								<i class="ace-icon fa fa-bell icon-animated-bell"></i>
								<span class="badge badge-important">8</span>
							</a>

							<ul class="dropdown-menu-right dropdown-navbar navbar-pink dropdown-menu dropdown-caret dropdown-close">
								<li class="dropdown-header">
									<i class="ace-icon fa fa-exclamation-triangle"></i>
									8 Notifications
								</li>

								<li>
									<a href="#">
										<div class="clearfix">
											<span class="pull-left">
												<i class="btn btn-xs no-hover btn-pink fa fa-comment"></i>
												New Comments
											</span>
											<span class="pull-right badge badge-info">+12</span>
										</div>
									</a>
								</li>

								<li>
									<a href="#">
										<i class="btn btn-xs btn-primary fa fa-user"></i>
										Bob just signed up as an editor ...
									</a>
								</li>

								<li>
									<a href="#">
										<div class="clearfix">
											<span class="pull-left">
												<i class="btn btn-xs no-hover btn-success fa fa-shopping-cart"></i>
												New Orders
											</span>
											<span class="pull-right badge badge-success">+8</span>
										</div>
									</a>
								</li>

								<li>
									<a href="#">
										<div class="clearfix">
											<span class="pull-left">
												<i class="btn btn-xs no-hover btn-info fa fa-twitter"></i>
												Followers
											</span>
											<span class="pull-right badge badge-info">+11</span>
										</div>
									</a>
								</li>

								<li class="dropdown-footer">
									<a href="#">
										See all notifications
										<i class="ace-icon fa fa-arrow-right"></i>
									</a>
								</li>
							</ul>
						</li>

						<li class="green">
							<a data-toggle="dropdown" class="dropdown-toggle" href="#">
								<i class="ace-icon fa fa-envelope icon-animated-vertical"></i>
								<span class="badge badge-success">5</span>
							</a>

							<ul class="dropdown-menu-right dropdown-navbar dropdown-menu dropdown-caret dropdown-close">
								<li class="dropdown-header">
									<i class="ace-icon fa fa-envelope-o"></i>
									5 Messages
								</li>

								<li class="dropdown-content">
									<ul class="dropdown-menu dropdown-navbar">
										<li>
											<a href="#">
												<img src="../assets/avatars/avatar.png" class="msg-photo" alt="Alex's Avatar" />
												<span class="msg-body">
													<span class="msg-title">
														<span class="blue">Alex:</span>
														Ciao sociis natoque penatibus et auctor ...
													</span>

													<span class="msg-time">
														<i class="ace-icon fa fa-clock-o"></i>
														<span>a moment ago</span>
													</span>
												</span>
											</a>
										</li>

										<li>
											<a href="#">
												<img src="../assets/avatars/avatar3.png" class="msg-photo" alt="Susan's Avatar" />
												<span class="msg-body">
													<span class="msg-title">
														<span class="blue">Susan:</span>
														Vestibulum id ligula porta felis euismod ...
													</span>

													<span class="msg-time">
														<i class="ace-icon fa fa-clock-o"></i>
														<span>20 minutes ago</span>
													</span>
												</span>
											</a>
										</li>

										<li>
											<a href="#">
												<img src="../assets/avatars/avatar4.png" class="msg-photo" alt="Bob's Avatar" />
												<span class="msg-body">
													<span class="msg-title">
														<span class="blue">Bob:</span>
														Nullam quis risus eget urna mollis ornare ...
													</span>

													<span class="msg-time">
														<i class="ace-icon fa fa-clock-o"></i>
														<span>3:15 pm</span>
													</span>
												</span>
											</a>
										</li>

										<li>
											<a href="#">
												<img src="../assets/avatars/avatar2.png" class="msg-photo" alt="Kate's Avatar" />
												<span class="msg-body">
													<span class="msg-title">
														<span class="blue">Kate:</span>
														Ciao sociis natoque eget urna mollis ornare ...
													</span>

													<span class="msg-time">
														<i class="ace-icon fa fa-clock-o"></i>
														<span>1:33 pm</span>
													</span>
												</span>
											</a>
										</li>

										<li>
											<a href="#">
												<img src="../assets/avatars/avatar5.png" class="msg-photo" alt="Fred's Avatar" />
												<span class="msg-body">
													<span class="msg-title">
														<span class="blue">Fred:</span>
														Vestibulum id penatibus et auctor  ...
													</span>

													<span class="msg-time">
														<i class="ace-icon fa fa-clock-o"></i>
														<span>10:09 am</span>
													</span>
												</span>
											</a>
										</li>
									</ul>
								</li>

								<li class="dropdown-footer">
									<a href="inbox.html">
										See all messages
										<i class="ace-icon fa fa-arrow-right"></i>
									</a>
								</li>
							</ul>
						</li>

						<!-- #section:basics/navbar.user_menu -->
						<li class="light-blue">
							<a data-toggle="dropdown" href="#" class="dropdown-toggle">
								<img class="nav-user-photo" src="../assets/avatars/user.jpg" alt="Jason's Photo" />
								<span class="user-info">
									<small>Welcome,</small>
									Jason
								</span>

								<i class="ace-icon fa fa-caret-down"></i>
							</a>

							<ul class="user-menu dropdown-menu-right dropdown-menu dropdown-yellow dropdown-caret dropdown-close">
								<li>
									<a href="#">
										<i class="ace-icon fa fa-cog"></i>
										Settings
									</a>
								</li>

								<li>
									<a href="profile.html">
										<i class="ace-icon fa fa-user"></i>
										Profile
									</a>
								</li>

								<li class="divider"></li>

								<li>
									<a href="#">
										<i class="ace-icon fa fa-power-off"></i>
										Logout
									</a>
								</li>
							</ul>
						</li>

						<!-- /section:basics/navbar.user_menu -->
					</ul>
				</div>

				<!-- /section:basics/navbar.dropdown -->
			</div><!-- /.navbar-container -->
		</div>

		<!-- /section:basics/navbar.layout -->
		<div class="main-container" id="main-container">
			<script type="text/javascript">
				try{ace.settings.check('main-container' , 'fixed')}catch(e){}
			</script>

			<!-- #section:basics/sidebar -->
			<div id="sidebar" class="sidebar                  responsive">
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

				<ul class="nav nav-list">
					<li class="">
						<a href="index.html">
							<i class="menu-icon fa fa-tachometer"></i>
							<span class="menu-text"> Dashboard </span>
						</a>

						<b class="arrow"></b>
					</li>

					<li class="">
						<a href="#" class="dropdown-toggle">
							<i class="menu-icon fa fa-desktop"></i>
							<span class="menu-text"> UI &amp; Elements </span>

							<b class="arrow fa fa-angle-down"></b>
						</a>

						<b class="arrow"></b>

						<ul class="submenu">
							<li class="">
								<a href="#" class="dropdown-toggle">
									<i class="menu-icon fa fa-caret-right"></i>

									Layouts
									<b class="arrow fa fa-angle-down"></b>
								</a>

								<b class="arrow"></b>

								<ul class="submenu">
									<li class="">
										<a href="top-menu.html">
											<i class="menu-icon fa fa-caret-right"></i>
											Top Menu
										</a>

										<b class="arrow"></b>
									</li>

									<li class="">
										<a href="mobile-menu-1.html">
											<i class="menu-icon fa fa-caret-right"></i>
											Default Mobile Menu
										</a>

										<b class="arrow"></b>
									</li>

									<li class="">
										<a href="mobile-menu-2.html">
											<i class="menu-icon fa fa-caret-right"></i>
											Mobile Menu 2
										</a>

										<b class="arrow"></b>
									</li>

									<li class="">
										<a href="mobile-menu-3.html">
											<i class="menu-icon fa fa-caret-right"></i>
											Mobile Menu 3
										</a>

										<b class="arrow"></b>
									</li>
								</ul>
							</li>

							<li class="">
								<a href="typography.html">
									<i class="menu-icon fa fa-caret-right"></i>
									Typography
								</a>

								<b class="arrow"></b>
							</li>

							<li class="">
								<a href="elements.html">
									<i class="menu-icon fa fa-caret-right"></i>
									Elements
								</a>

								<b class="arrow"></b>
							</li>

							<li class="">
								<a href="buttons.html">
									<i class="menu-icon fa fa-caret-right"></i>
									Buttons &amp; Icons
								</a>

								<b class="arrow"></b>
							</li>

							<li class="">
								<a href="treeview.html">
									<i class="menu-icon fa fa-caret-right"></i>
									Treeview
								</a>

								<b class="arrow"></b>
							</li>

							<li class="">
								<a href="jquery-ui.html">
									<i class="menu-icon fa fa-caret-right"></i>
									jQuery UI
								</a>

								<b class="arrow"></b>
							</li>

							<li class="">
								<a href="nestable-list.html">
									<i class="menu-icon fa fa-caret-right"></i>
									Nestable Lists
								</a>

								<b class="arrow"></b>
							</li>

							<li class="">
								<a href="#" class="dropdown-toggle">
									<i class="menu-icon fa fa-caret-right"></i>

									Three Level Menu
									<b class="arrow fa fa-angle-down"></b>
								</a>

								<b class="arrow"></b>

								<ul class="submenu">
									<li class="">
										<a href="#">
											<i class="menu-icon fa fa-leaf green"></i>
											Item #1
										</a>

										<b class="arrow"></b>
									</li>

									<li class="">
										<a href="#" class="dropdown-toggle">
											<i class="menu-icon fa fa-pencil orange"></i>

											4th level
											<b class="arrow fa fa-angle-down"></b>
										</a>

										<b class="arrow"></b>

										<ul class="submenu">
											<li class="">
												<a href="#">
													<i class="menu-icon fa fa-plus purple"></i>
													Add Product
												</a>

												<b class="arrow"></b>
											</li>

											<li class="">
												<a href="#">
													<i class="menu-icon fa fa-eye pink"></i>
													View Products
												</a>

												<b class="arrow"></b>
											</li>
										</ul>
									</li>
								</ul>
							</li>
						</ul>
					</li>

					<li class="">
						<a href="#" class="dropdown-toggle">
							<i class="menu-icon fa fa-list"></i>
							<span class="menu-text"> Tables </span>

							<b class="arrow fa fa-angle-down"></b>
						</a>

						<b class="arrow"></b>

						<ul class="submenu">
							<li class="">
								<a href="tables.html">
									<i class="menu-icon fa fa-caret-right"></i>
									Simple &amp; Dynamic
								</a>

								<b class="arrow"></b>
							</li>

							<li class="">
								<a href="jqgrid.html">
									<i class="menu-icon fa fa-caret-right"></i>
									jqGrid plugin
								</a>

								<b class="arrow"></b>
							</li>
						</ul>
					</li>

					<li class="">
						<a href="#" class="dropdown-toggle">
							<i class="menu-icon fa fa-pencil-square-o"></i>
							<span class="menu-text"> Forms </span>

							<b class="arrow fa fa-angle-down"></b>
						</a>

						<b class="arrow"></b>

						<ul class="submenu">
							<li class="">
								<a href="form-elements.html">
									<i class="menu-icon fa fa-caret-right"></i>
									Form Elements
								</a>

								<b class="arrow"></b>
							</li>

							<li class="">
								<a href="form-wizard.html">
									<i class="menu-icon fa fa-caret-right"></i>
									Wizard &amp; Validation
								</a>

								<b class="arrow"></b>
							</li>

							<li class="">
								<a href="wysiwyg.html">
									<i class="menu-icon fa fa-caret-right"></i>
									Wysiwyg &amp; Markdown
								</a>

								<b class="arrow"></b>
							</li>

							<li class="">
								<a href="dropzone.html">
									<i class="menu-icon fa fa-caret-right"></i>
									Dropzone File Upload
								</a>

								<b class="arrow"></b>
							</li>
						</ul>
					</li>

					<li class="active">
						<a href="widgets.html">
							<i class="menu-icon fa fa-list-alt"></i>
							<span class="menu-text"> Widgets </span>
						</a>

						<b class="arrow"></b>
					</li>

					<li class="">
						<a href="calendar.html">
							<i class="menu-icon fa fa-calendar"></i>

							<span class="menu-text">
								Calendar

								<!-- #section:basics/sidebar.layout.badge -->
								<span class="badge badge-transparent tooltip-error" title="2 Important Events">
									<i class="ace-icon fa fa-exclamation-triangle red bigger-130"></i>
								</span>

								<!-- /section:basics/sidebar.layout.badge -->
							</span>
						</a>

						<b class="arrow"></b>
					</li>

					<li class="">
						<a href="gallery.html">
							<i class="menu-icon fa fa-picture-o"></i>
							<span class="menu-text"> Gallery </span>
						</a>

						<b class="arrow"></b>
					</li>

					<li class="">
						<a href="#" class="dropdown-toggle">
							<i class="menu-icon fa fa-tag"></i>
							<span class="menu-text"> More Pages </span>

							<b class="arrow fa fa-angle-down"></b>
						</a>

						<b class="arrow"></b>

						<ul class="submenu">
							<li class="">
								<a href="profile.html">
									<i class="menu-icon fa fa-caret-right"></i>
									User Profile
								</a>

								<b class="arrow"></b>
							</li>

							<li class="">
								<a href="inbox.html">
									<i class="menu-icon fa fa-caret-right"></i>
									Inbox
								</a>

								<b class="arrow"></b>
							</li>

							<li class="">
								<a href="pricing.html">
									<i class="menu-icon fa fa-caret-right"></i>
									Pricing Tables
								</a>

								<b class="arrow"></b>
							</li>

							<li class="">
								<a href="invoice.html">
									<i class="menu-icon fa fa-caret-right"></i>
									Invoice
								</a>

								<b class="arrow"></b>
							</li>

							<li class="">
								<a href="timeline.html">
									<i class="menu-icon fa fa-caret-right"></i>
									Timeline
								</a>

								<b class="arrow"></b>
							</li>

							<li class="">
								<a href="email.html">
									<i class="menu-icon fa fa-caret-right"></i>
									Email Templates
								</a>

								<b class="arrow"></b>
							</li>

							<li class="">
								<a href="login.html">
									<i class="menu-icon fa fa-caret-right"></i>
									Login &amp; Register
								</a>

								<b class="arrow"></b>
							</li>
						</ul>
					</li>

					<li class="">
						<a href="#" class="dropdown-toggle">
							<i class="menu-icon fa fa-file-o"></i>

							<span class="menu-text">
								Other Pages

								<!-- #section:basics/sidebar.layout.badge -->
								<span class="badge badge-primary">5</span>

								<!-- /section:basics/sidebar.layout.badge -->
							</span>

							<b class="arrow fa fa-angle-down"></b>
						</a>

						<b class="arrow"></b>

						<ul class="submenu">
							<li class="">
								<a href="faq.html">
									<i class="menu-icon fa fa-caret-right"></i>
									FAQ
								</a>

								<b class="arrow"></b>
							</li>

							<li class="">
								<a href="error-404.html">
									<i class="menu-icon fa fa-caret-right"></i>
									Error 404
								</a>

								<b class="arrow"></b>
							</li>

							<li class="">
								<a href="error-500.html">
									<i class="menu-icon fa fa-caret-right"></i>
									Error 500
								</a>

								<b class="arrow"></b>
							</li>

							<li class="">
								<a href="grid.html">
									<i class="menu-icon fa fa-caret-right"></i>
									Grid
								</a>

								<b class="arrow"></b>
							</li>

							<li class="">
								<a href="blank.html">
									<i class="menu-icon fa fa-caret-right"></i>
									Blank Page
								</a>

								<b class="arrow"></b>
							</li>
						</ul>
					</li>
				</ul><!-- /.nav-list -->

				<!-- #section:basics/sidebar.layout.minimize -->
				<div class="sidebar-toggle sidebar-collapse" id="sidebar-collapse">
					<i class="ace-icon fa fa-angle-double-left" data-icon1="ace-icon fa fa-angle-double-left" data-icon2="ace-icon fa fa-angle-double-right"></i>
				</div>

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
							<a href="#">Home</a>
						</li>
						<li class="active">Widgets</li>
					</ul><!-- /.breadcrumb -->

					<!-- #section:basics/content.searchbox -->
					<div class="nav-search" id="nav-search">
						<form class="form-search">
							<span class="input-icon">
								<input type="text" placeholder="Search ..." class="nav-search-input" id="nav-search-input" autocomplete="off" />
								<i class="ace-icon fa fa-search nav-search-icon"></i>
							</span>
						</form>
					</div><!-- /.nav-search -->

					<!-- /section:basics/content.searchbox -->
				</div>

				<!-- /section:basics/content.breadcrumbs -->
				<div class="page-content">
					<!-- #section:settings.box -->
					<div class="ace-settings-container" id="ace-settings-container">
						<div class="btn btn-app btn-xs btn-warning ace-settings-btn" id="ace-settings-btn">
							<i class="ace-icon fa fa-cog bigger-150"></i>
						</div>

						<div class="ace-settings-box clearfix" id="ace-settings-box">
							<div class="pull-left width-50">
								<!-- #section:settings.skins -->
								<div class="ace-settings-item">
									<div class="pull-left">
										<select id="skin-colorpicker" class="hide">
											<option data-skin="no-skin" value="#438EB9">#438EB9</option>
											<option data-skin="skin-1" value="#222A2D">#222A2D</option>
											<option data-skin="skin-2" value="#C6487E">#C6487E</option>
											<option data-skin="skin-3" value="#D0D0D0">#D0D0D0</option>
										</select>
									</div>
									<span>&nbsp; Choose Skin</span>
								</div>

								<!-- /section:settings.skins -->

								<!-- #section:settings.navbar -->
								<div class="ace-settings-item">
									<input type="checkbox" class="ace ace-checkbox-2" id="ace-settings-navbar" />
									<label class="lbl" for="ace-settings-navbar"> Fixed Navbar</label>
								</div>

								<!-- /section:settings.navbar -->

								<!-- #section:settings.sidebar -->
								<div class="ace-settings-item">
									<input type="checkbox" class="ace ace-checkbox-2" id="ace-settings-sidebar" />
									<label class="lbl" for="ace-settings-sidebar"> Fixed Sidebar</label>
								</div>

								<!-- /section:settings.sidebar -->

								<!-- #section:settings.breadcrumbs -->
								<div class="ace-settings-item">
									<input type="checkbox" class="ace ace-checkbox-2" id="ace-settings-breadcrumbs" />
									<label class="lbl" for="ace-settings-breadcrumbs"> Fixed Breadcrumbs</label>
								</div>

								<!-- /section:settings.breadcrumbs -->

								<!-- #section:settings.rtl -->
								<div class="ace-settings-item">
									<input type="checkbox" class="ace ace-checkbox-2" id="ace-settings-rtl" />
									<label class="lbl" for="ace-settings-rtl"> Right To Left (rtl)</label>
								</div>

								<!-- /section:settings.rtl -->

								<!-- #section:settings.container -->
								<div class="ace-settings-item">
									<input type="checkbox" class="ace ace-checkbox-2" id="ace-settings-add-container" />
									<label class="lbl" for="ace-settings-add-container">
										Inside
										<b>.container</b>
									</label>
								</div>

								<!-- /section:settings.container -->
							</div><!-- /.pull-left -->

							<div class="pull-left width-50">
								<!-- #section:basics/sidebar.options -->
								<div class="ace-settings-item">
									<input type="checkbox" class="ace ace-checkbox-2" id="ace-settings-hover" />
									<label class="lbl" for="ace-settings-hover"> Submenu on Hover</label>
								</div>

								<div class="ace-settings-item">
									<input type="checkbox" class="ace ace-checkbox-2" id="ace-settings-compact" />
									<label class="lbl" for="ace-settings-compact"> Compact Sidebar</label>
								</div>

								<div class="ace-settings-item">
									<input type="checkbox" class="ace ace-checkbox-2" id="ace-settings-highlight" />
									<label class="lbl" for="ace-settings-highlight"> Alt. Active Item</label>
								</div>

								<!-- /section:basics/sidebar.options -->
							</div><!-- /.pull-left -->
						</div><!-- /.ace-settings-box -->
					</div><!-- /.ace-settings-container -->

					<!-- /section:settings.box -->
					<div class="page-content-area">
						<div class="page-header">
							<h1>
								Widgets
								<small>
									<i class="ace-icon fa fa-angle-double-right"></i>
									Draggabble Widget Boxes &amp; Containers
								</small>
							</h1>
						</div><!-- /.page-header -->

						<div class="row">
							<div class="col-xs-12">
								<!-- PAGE CONTENT BEGINS -->
								<div class="row">
									<div class="col-xs-12 col-sm-6 widget-container-col">
										<!-- #section:custom/widget-box -->
										<div class="widget-box">
											<div class="widget-header">
												<h5 class="widget-title">Default Widget Box</h5>

												<!-- #section:custom/widget-box.toolbar -->
												<div class="widget-toolbar">
													<div class="widget-menu">
														<a href="#" data-action="settings" data-toggle="dropdown">
															<i class="ace-icon fa fa-bars"></i>
														</a>

														<ul class="dropdown-menu dropdown-menu-right dropdown-light-blue dropdown-caret dropdown-closer">
															<li>
																<a data-toggle="tab" href="#dropdown1">Option#1</a>
															</li>

															<li>
																<a data-toggle="tab" href="#dropdown2">Option#2</a>
															</li>
														</ul>
													</div>

													<a href="#" data-action="fullscreen" class="orange2">
														<i class="ace-icon fa fa-expand"></i>
													</a>

													<a href="#" data-action="reload">
														<i class="ace-icon fa fa-refresh"></i>
													</a>

													<a href="#" data-action="collapse">
														<i class="ace-icon fa fa-chevron-up"></i>
													</a>

													<a href="#" data-action="close">
														<i class="ace-icon fa fa-times"></i>
													</a>
												</div>

												<!-- /section:custom/widget-box.toolbar -->
											</div>

											<div class="widget-body">
												<div class="widget-main">
													<p class="alert alert-info">
														Nunc aliquam enim ut arcu aliquet adipiscing. Fusce dignissim volutpat justo non consectetur. Nulla fringilla eleifend consectetur.
													</p>
													<p class="alert alert-success">
														Raw denim you probably haven't heard of them jean shorts Austin.
													</p>
												</div>
											</div>
										</div>

										<!-- /section:custom/widget-box -->
									</div>

									<div class="col-xs-12 col-sm-6 widget-container-col">
										<div class="widget-box widget-color-blue">
											<!-- #section:custom/widget-box.options -->
											<div class="widget-header">
												<h5 class="widget-title bigger lighter">
													<i class="ace-icon fa fa-table"></i>
													Tables & Colors
												</h5>

												<div class="widget-toolbar widget-toolbar-light no-border">
													<select id="simple-colorpicker-1" class="hide">
														<option selected="" data-class="blue" value="#307ECC">#307ECC</option>
														<option data-class="blue2" value="#5090C1">#5090C1</option>
														<option data-class="blue3" value="#6379AA">#6379AA</option>
														<option data-class="green" value="#82AF6F">#82AF6F</option>
														<option data-class="green2" value="#2E8965">#2E8965</option>
														<option data-class="green3" value="#5FBC47">#5FBC47</option>
														<option data-class="red" value="#E2755F">#E2755F</option>
														<option data-class="red2" value="#E04141">#E04141</option>
														<option data-class="red3" value="#D15B47">#D15B47</option>
														<option data-class="orange" value="#FFC657">#FFC657</option>
														<option data-class="purple" value="#7E6EB0">#7E6EB0</option>
														<option data-class="pink" value="#CE6F9E">#CE6F9E</option>
														<option data-class="dark" value="#404040">#404040</option>
														<option data-class="grey" value="#848484">#848484</option>
														<option data-class="default" value="#EEE">#EEE</option>
													</select>
												</div>
											</div>

											<!-- /section:custom/widget-box.options -->
											<div class="widget-body">
												<div class="widget-main no-padding">
													<table class="table table-striped table-bordered table-hover">
														<thead class="thin-border-bottom">
															<tr>
																<th>
																	<i class="ace-icon fa fa-user"></i>
																	User
																</th>

																<th>
																	<i>@</i>
																	Email
																</th>
																<th class="hidden-480">Status</th>
															</tr>
														</thead>

														<tbody>
															<tr>
																<td class="">Alex</td>

																<td>
																	<a href="#">alex@email.com</a>
																</td>

																<td class="hidden-480">
																	<span class="label label-warning">Pending</span>
																</td>
															</tr>

															<tr>
																<td class="">Fred</td>

																<td>
																	<a href="#">fred@email.com</a>
																</td>

																<td class="hidden-480">
																	<span class="label label-success arrowed-in arrowed-in-right">Approved</span>
																</td>
															</tr>

															<tr>
																<td class="">Jack</td>

																<td>
																	<a href="#">jack@email.com</a>
																</td>

																<td class="hidden-480">
																	<span class="label label-warning">Pending</span>
																</td>
															</tr>

															<tr>
																<td class="">John</td>

																<td>
																	<a href="#">john@email.com</a>
																</td>

																<td class="hidden-480">
																	<span class="label label-inverse arrowed">Blocked</span>
																</td>
															</tr>

															<tr>
																<td class="">James</td>

																<td>
																	<a href="#">james@email.com</a>
																</td>

																<td class="hidden-480">
																	<span class="label label-info arrowed-in arrowed-in-right">Online</span>
																</td>
															</tr>
														</tbody>
													</table>
												</div>
											</div>
										</div>
									</div><!-- /.span -->
								</div><!-- /.row -->

								<div class="space-24"></div>

								<div class="row">
									<div class="col-xs-12 col-sm-6 widget-container-col">
										<div class="widget-box widget-color-orange collapsed">
											<!-- #section:custom/widget-box.options.collapsed -->
											<div class="widget-header widget-header-small">
												<h6 class="widget-title">
													<i class="ace-icon fa fa-sort"></i>
													Small Header & Collapsed
												</h6>

												<div class="widget-toolbar">
													<a href="#" data-action="settings">
														<i class="ace-icon fa fa-cog"></i>
													</a>

													<a href="#" data-action="reload">
														<i class="ace-icon fa fa-refresh"></i>
													</a>

													<a href="#" data-action="collapse">
														<i class="ace-icon fa fa-plus" data-icon-show="fa-plus" data-icon-hide="fa-minus"></i>
													</a>

													<a href="#" data-action="close">
														<i class="ace-icon fa fa-times"></i>
													</a>
												</div>
											</div>

											<!-- /section:custom/widget-box.options.collapsed -->
											<div class="widget-body">
												<div class="widget-main">
													<p class="alert alert-info">
														Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque commodo massa sed ipsum porttitor facilisis.
													</p>
												</div>
											</div>
										</div>
									</div>

									<div class="col-xs-12 col-sm-6 widget-container-col">
										<div class="widget-box">
											<!-- #section:custom/widget-box.header.options -->
											<div class="widget-header widget-header-large">
												<h4 class="widget-title">Big Header</h4>

												<div class="widget-toolbar">
													<a href="#" data-action="settings">
														<i class="ace-icon fa fa-cog"></i>
													</a>

													<a href="#" data-action="reload">
														<i class="ace-icon fa fa-refresh"></i>
													</a>

													<a href="#" data-action="collapse">
														<i class="ace-icon fa fa-chevron-up"></i>
													</a>

													<a href="#" data-action="close">
														<i class="ace-icon fa fa-times"></i>
													</a>
												</div>
											</div>

											<!-- /section:custom/widget-box.header.options -->
											<div class="widget-body">
												<div class="widget-main">
													<p class="alert alert-info">
														Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque commodo massa sed ipsum porttitor facilisis.
													</p>
												</div>
											</div>
										</div>
									</div>
								</div>

								<div class="space-24"></div>

								<div class="row">
									<div class="col-xs-12 col-sm-3 widget-container-col">
										<div class="widget-box">
											<div class="widget-header">
												<h5 class="widget-title smaller">With Label</h5>

												<div class="widget-toolbar">
													<span class="label label-success">
														16%
														<i class="ace-icon fa fa-arrow-up"></i>
													</span>
												</div>
											</div>

											<div class="widget-body">
												<div class="widget-main padding-6">
													<div class="alert alert-info"> Hello World! </div>
												</div>
											</div>
										</div>
									</div>

									<div class="col-xs-12 col-sm-3 widget-container-col">
										<div class="widget-box widget-color-dark light-border">
											<div class="widget-header">
												<h5 class="widget-title smaller">With Badge</h5>

												<div class="widget-toolbar">
													<span class="badge badge-danger">Alert</span>
												</div>
											</div>

											<div class="widget-body">
												<div class="widget-main padding-6">
													<div class="alert alert-info"> Hello World! </div>
												</div>
											</div>
										</div>
									</div>

									<div class="col-xs-12 col-sm-6 widget-container-col">
										<div class="widget-box widget-color-dark">
											<div class="widget-header widget-header-small">
												<h6 class="widget-title smaller">With Labels & Badges</h6>

												<div class="widget-toolbar no-border">
													<label>
														<input type="checkbox" class="ace ace-switch ace-switch-3" />
														<span class="lbl middle"></span>
													</label>
												</div>

												<div class="widget-toolbar">
													<span class="label label-warning">
														1.2%
														<i class="ace-icon fa fa-arrow-down"></i>
													</span>
													<span class="badge badge-info">info</span>
												</div>
											</div>

											<div class="widget-body">
												<div class="widget-main">
													<div class="alert alert-info">
														Lorem ipsum dolor sit amet, consectetur adipiscing.
													</div>
												</div>
											</div>
										</div>
									</div>
								</div>

								<div class="space"></div>

								<div class="row">
									<div class="col-xs-12 col-sm-6 widget-container-col">
										<div class="widget-box widget-color-dark">
											<div class="widget-header">
												<h5 class="widget-title bigger lighter">Box with Toolbox</h5>

												<div class="widget-toolbar">
													<div class="progress progress-mini progress-striped active pos-rel" style="width:100px;" data-percent="61%">
														<div class="progress-bar progress-bar-danger" style="width:61%"></div>
													</div>
												</div>
											</div>

											<div class="widget-body">
												<!-- #section:custom/widget-box.toolbox -->
												<div class="widget-toolbox">
													<div class="btn-toolbar">
														<div class="btn-group">
															<button class="btn btn-sm btn-success btn-white btn-round">
																<i class="ace-icon fa fa-check bigger-110 green"></i>
																Approve
															</button>

															<button class="btn btn-sm btn-danger btn-white btn-round">
																<i class="ace-icon fa fa-times bigger-110 red2"></i>
																Reject
															</button>
														</div>

														<div data-toggle="buttons" class="btn-group">
															<label class="btn btn-sm btn-default btn-white btn-round">
																<i class="icon-only ace-icon fa fa-bold bigger-110"></i>

																<input type="checkbox" value="1" />
															</label>

															<label class="btn btn-sm btn-default btn-white btn-round">
																<i class="icon-only ace-icon fa fa-italic bigger-110"></i>

																<input type="checkbox" value="2" />
															</label>
														</div>

														<div data-toggle="buttons" class="btn-group">
															<label class="btn btn-sm btn-primary btn-white btn-round">
																<i class="icon-only ace-icon fa fa-align-left bigger-110"></i>

																<input type="radio" value="1" />
															</label>

															<label class="btn btn-sm btn-primary btn-white btn-round">
																<i class="icon-only ace-icon fa fa-align-center bigger-110"></i>

																<input type="radio" value="2" />
															</label>

															<label class="btn btn-sm btn-primary btn-white btn-round">
																<i class="icon-only ace-icon fa fa-align-right bigger-110"></i>

																<input type="radio" value="3" />
															</label>
														</div>
													</div>
												</div>

												<!-- /section:custom/widget-box.toolbox -->
												<div class="widget-main padding-16">
													Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque commodo massa sed ipsum porttitor facilisis. Nullam interdum massa vel nisl fringilla sed viverra erat tincidunt. Phasellus in ipsum velit. Maecenas id erat vel sem convallis blandit. Nunc aliquam enim ut arcu aliquet adipiscing. Fusce dignissim volutpat justo non consectetur. Nulla fringilla eleifend consectetur. Etiam justo nisl, gravida id egestas eu, eleifend vel metus. Pellentesque tellus ipsum, euismod in facilisis quis, aliquet quis sem.
												</div>
											</div>
										</div>
									</div>

									<div class="col-xs-12 col-sm-6 widget-container-col">
										<div class="widget-box widget-color-pink">
											<div class="widget-header">
												<h5 class="widget-title">Bottom Toolbox (Footer)</h5>

												<div class="widget-toolbar">
													<a href="#" data-action="collapse">
														<i class="1 ace-icon fa fa-chevron-up bigger-125"></i>
													</a>
												</div>

												<div class="widget-toolbar no-border">
													<button class="btn btn-xs btn-light bigger">
														<i class="ace-icon fa fa-arrow-left"></i>
														Prev
													</button>

													<button class="btn btn-xs bigger btn-yellow dropdown-toggle" data-toggle="dropdown">
														Next
														<i class="ace-icon fa fa-chevron-down icon-on-right"></i>
													</button>

													<ul class="dropdown-menu dropdown-yellow dropdown-menu-right dropdown-caret dropdown-close">
														<li>
															<a href="#">Action</a>
														</li>

														<li>
															<a href="#">Another action</a>
														</li>

														<li>
															<a href="#">Something else here</a>
														</li>

														<li class="divider"></li>

														<li>
															<a href="#">Separated link</a>
														</li>
													</ul>
												</div>
											</div>

											<div class="widget-body">
												<div class="widget-main">
													<p class="alert alert-info">
														Nunc aliquam enim ut arcu aliquet adipiscing. Fusce dignissim volutpat justo non consectetur. Nulla fringilla eleifend consectetur.
													</p>
													<p class="alert alert-success">
														Raw denim you probably haven't heard of them jean shorts Austin.
													</p>
												</div>

												<div class="widget-toolbox padding-8 clearfix">
													<button class="btn btn-xs btn-danger pull-left">
														<i class="ace-icon fa fa-times"></i>
														<span class="bigger-110">I don't accept</span>
													</button>

													<button class="btn btn-xs btn-success pull-right">
														<span class="bigger-110">I accept</span>

														<i class="ace-icon fa fa-arrow-right icon-on-right"></i>
													</button>
												</div>
											</div>
										</div>
									</div>
								</div>

								<div class="space"></div>

								<div class="row">
									<div class="col-sm-6 widget-container-col">
										<div class="widget-box">
											<div class="widget-header widget-header-small">
												<h5 class="widget-title smaller">Tabbed</h5>

												<!-- #section:custom/widget-box.tabbed -->
												<div class="widget-toolbar no-border">
													<ul class="nav nav-tabs" id="myTab">
														<li class="active">
															<a data-toggle="tab" href="#home">Home</a>
														</li>

														<li>
															<a data-toggle="tab" href="#profile">Profile</a>
														</li>

														<li>
															<a data-toggle="tab" href="#info">Info</a>
														</li>
													</ul>
												</div>

												<!-- /section:custom/widget-box.tabbed -->
											</div>

											<div class="widget-body">
												<div class="widget-main padding-6">
													<div class="tab-content">
														<div id="home" class="tab-pane in active">
															<p>Raw denim you probably haven't heard of them jean shorts Austin.</p>
														</div>

														<div id="profile" class="tab-pane">
															<p>Food truck fixie locavore, accusamus mcsweeney's marfa nulla single-origin coffee squid.</p>
														</div>

														<div id="info" class="tab-pane">
															<p>Etsy mixtape wayfarers, ethical wes anderson tofu before they sold out mcsweeney's organic lomo retro fanny pack lo-fi farm-to-table readymade.</p>
														</div>
													</div>
												</div>
											</div>
										</div>
									</div>

									<div class="col-sm-6 widget-container-col">
										<div class="widget-box widget-color-dark">
											<div class="widget-header widget-hea1der-small">
												<h6 class="widget-title">Scroll Content</h6>

												<div class="widget-toolbar">
													<a href="#" data-action="settings">
														<i class="ace-icon fa fa-cog"></i>
													</a>

													<a href="#" data-action="reload">
														<i class="ace-icon fa fa-refresh"></i>
													</a>

													<a href="#" data-action="collapse">
														<i class="ace-icon fa fa-chevron-up"></i>
													</a>

													<a href="#" data-action="close">
														<i class="ace-icon fa fa-times"></i>
													</a>
												</div>
											</div>

											<div class="widget-body">
												<div class="widget-main padding-4">
													<!-- #section:custom/scrollbar -->
													<div class="scrollable" data-height="125">
														<div class="content">
															<div class="alert alert-info">
																Lorem ipsum dolor sit amet, consectetur adipiscing.
															</div>
															<div class="alert alert-danger">
																Lorem ipsum dolor sit amet, consectetur adipiscing.
															</div>
															<div class="alert alert-success">
																Lorem ipsum dolor sit amet, consectetur adipiscing.
															</div>
															<div class="alert">
																Lorem ipsum dolor sit amet, consectetur adipiscing.
															</div>
														</div>
													</div>

													<!-- /section:custom/scrollbar -->
												</div>
											</div>
										</div>
									</div>
								</div>

								<div class="space-24"></div>

								<div class="row">
									<div class="col-sm-6 widget-container-col">
										<!-- #section:custom/widget-box.options.transparent -->
										<div class="widget-box transparent">
											<div class="widget-header">
												<h4 class="widget-title lighter">Transparent Box</h4>

												<div class="widget-toolbar no-border">
													<a href="#" data-action="settings">
														<i class="ace-icon fa fa-cog"></i>
													</a>

													<a href="#" data-action="reload">
														<i class="ace-icon fa fa-refresh"></i>
													</a>

													<a href="#" data-action="collapse">
														<i class="ace-icon fa fa-chevron-up"></i>
													</a>

													<a href="#" data-action="close">
														<i class="ace-icon fa fa-times"></i>
													</a>
												</div>
											</div>

											<div class="widget-body">
												<div class="widget-main padding-6 no-padding-left no-padding-right">
													Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque commodo massa sed ipsum porttitor facilisis. Nullam interdum massa vel nisl fringilla sed viverra erat tincidunt. Phasellus in ipsum velit. Maecenas id erat vel sem convallis blandit. Nunc aliquam enim ut arcu aliquet adipiscing. Fusce dignissim volutpat justo non consectetur.
												</div>
											</div>
										</div>

										<!-- /section:custom/widget-box.options.transparent -->
									</div>

									<div class="col-sm-6 widget-container-col">
										<div class="widget-box transparent">
											<div class="widget-header">
												<h4 class="widget-title lighter">Tabs With Scroll</h4>

												<div class="widget-toolbar no-border">
													<ul class="nav nav-tabs" id="myTab2">
														<li class="active">
															<a data-toggle="tab" href="#home2">Home</a>
														</li>

														<li>
															<a data-toggle="tab" href="#profile2">Profile</a>
														</li>

														<li>
															<a data-toggle="tab" href="#info2">Info</a>
														</li>
													</ul>
												</div>
											</div>

											<div class="widget-body">
												<div class="widget-main padding-12 no-padding-left no-padding-right">
													<div class="tab-content padding-4">
														<div id="home2" class="tab-pane in active">
															<!-- #section:custom/scrollbar.horizontal -->
															<div class="scrollable-horizontal" data-size="800">
																<b>Horizontal Scroll</b>
																Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque commodo massa sed ipsum porttitor facilisis. Nullam interdum massa vel nisl fringilla sed viverra erat tincidunt. Phasellus in ipsum velit. Maecenas id erat vel sem convallis blandit. Nunc aliquam enim ut arcu aliquet adipiscing. Fusce dignissim volutpat justo non consectetur.
						Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque commodo massa sed ipsum porttitor facilisis. Nullam interdum massa vel nisl fringilla sed viverra erat tincidunt. Phasellus in ipsum velit. Maecenas id erat vel sem convallis blandit. Nunc aliquam enim ut arcu aliquet adipiscing. Fusce dignissim volutpat justo non consectetur.
						Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque commodo massa sed ipsum porttitor facilisis. Nullam interdum massa vel nisl fringilla sed viverra erat tincidunt. Phasellus in ipsum velit. Maecenas id erat vel sem convallis blandit. Nunc aliquam enim ut arcu aliquet adipiscing. Fusce dignissim volutpat justo non consectetur.
															</div>

															<!-- /section:custom/scrollbar.horizontal -->
														</div>

														<div id="profile2" class="tab-pane">
															<div class="scrollable" data-size="100" data-position="left">
																<b>Scroll on Left</b>
																Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque commodo massa sed ipsum porttitor facilisis. Nullam interdum massa vel nisl fringilla sed viverra erat tincidunt. Phasellus in ipsum velit. Maecenas id erat vel sem convallis blandit. Nunc aliquam enim ut arcu aliquet adipiscing. Fusce dignissim volutpat justo non consectetur.
						Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque commodo massa sed ipsum porttitor facilisis. Nullam interdum massa vel nisl fringilla sed viverra erat tincidunt. Phasellus in ipsum velit. Maecenas id erat vel sem convallis blandit. Nunc aliquam enim ut arcu aliquet adipiscing. Fusce dignissim volutpat justo non consectetur.
						Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque commodo massa sed ipsum porttitor facilisis. Nullam interdum massa vel nisl fringilla sed viverra erat tincidunt. Phasellus in ipsum velit. Maecenas id erat vel sem convallis blandit. Nunc aliquam enim ut arcu aliquet adipiscing. Fusce dignissim volutpat justo non consectetur.
															</div>
														</div>

														<div id="info2" class="tab-pane">
															<div class="scrollable" data-size="100">
																<b>Scroll # 3</b>
																Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque commodo massa sed ipsum porttitor facilisis. Nullam interdum massa vel nisl fringilla sed viverra erat tincidunt. Phasellus in ipsum velit. Maecenas id erat vel sem convallis blandit. Nunc aliquam enim ut arcu aliquet adipiscing. Fusce dignissim volutpat justo non consectetur.
						Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque commodo massa sed ipsum porttitor facilisis. Nullam interdum massa vel nisl fringilla sed viverra erat tincidunt. Phasellus in ipsum velit. Maecenas id erat vel sem convallis blandit. Nunc aliquam enim ut arcu aliquet adipiscing. Fusce dignissim volutpat justo non consectetur.
						Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque commodo massa sed ipsum porttitor facilisis. Nullam interdum massa vel nisl fringilla sed viverra erat tincidunt. Phasellus in ipsum velit. Maecenas id erat vel sem convallis blandit. Nunc aliquam enim ut arcu aliquet adipiscing. Fusce dignissim volutpat justo non consectetur.
															</div>
														</div>
													</div>
												</div>
											</div>
										</div>
									</div>
								</div><!-- PAGE CONTENT ENDS -->
							</div><!-- /.col -->
						</div><!-- /.row -->
					</div><!-- /.page-content-area -->
				</div><!-- /.page-content -->
			</div><!-- /.main-content -->

			<div class="footer">
				<div class="footer-inner">
					<!-- #section:basics/footer -->
					<div class="footer-content">
						<span class="bigger-120">
							<span class="blue bolder">Ace</span>
							Application &copy; 2013-2014
						</span>

						&nbsp; &nbsp;
						<span class="action-buttons">
							<a href="#">
								<i class="ace-icon fa fa-twitter-square light-blue bigger-150"></i>
							</a>

							<a href="#">
								<i class="ace-icon fa fa-facebook-square text-primary bigger-150"></i>
							</a>

							<a href="#">
								<i class="ace-icon fa fa-rss-square orange bigger-150"></i>
							</a>
						</span>
					</div>

					<!-- /section:basics/footer -->
				</div>
			</div>

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
		<script src="../assets/js/jquery-ui.custom.min.js"></script>
		<script src="../assets/js/jquery.ui.touch-punch.min.js"></script>

		<!-- ace scripts -->
		<script src="../assets/js/ace-elements.min.js"></script>
		<script src="../assets/js/ace.min.js"></script>

		<!-- inline scripts related to this page -->
		<script type="text/javascript">
			jQuery(function($) {
			
				$('#simple-colorpicker-1').ace_colorpicker({pull_right:true}).on('change', function(){
					var color_class = $(this).find('option:selected').data('class');
					var new_class = 'widget-box';
					if(color_class != 'default')  new_class += ' widget-color-'+color_class;
					$(this).closest('.widget-box').attr('class', new_class);
				});
			
			
				// scrollables
				$('.scrollable').each(function () {
					var $this = $(this);
					$(this).ace_scroll({
						size: $this.data('size') || 100,
						//styleClass: 'scroll-left scroll-margin scroll-thin scroll-dark scroll-light no-track scroll-visible'
					});
				});
				$('.scrollable-horizontal').each(function () {
					var $this = $(this);
					$(this).ace_scroll(
					  {
						horizontal: true,
						styleClass: 'scroll-top',//show the scrollbars on top(default is bottom)
						size: $this.data('size') || 500,
						mouseWheelLock: true
					  }
					).css({'padding-top': 12});
				});
				
				$(window).on('resize.scroll_reset', function() {
					$('.scrollable-horizontal').ace_scroll('reset');
				});
			
			
				/**
				//or use slimScroll plugin
				$('.slim-scrollable').each(function () {
					var $this = $(this);
					$this.slimScroll({
						height: $this.data('height') || 100,
						railVisible:true
					});
				});
				*/
				
			
				/**$('.widget-box').on('setting.ace.widget' , function(e) {
					e.preventDefault();
				});*/
			
				/**
				$('.widget-box').on('show.ace.widget', function(e) {
					//e.preventDefault();
					//this = the widget-box
				});
				$('.widget-box').on('reload.ace.widget', function(e) {
					//this = the widget-box
				});
				*/
			
				//$('#my-widget-box').widget_box('hide');
			
				
			
				// widget boxes
				// widget box drag & drop example
			    $('.widget-container-col').sortable({
			        connectWith: '.widget-container-col',
					items:'> .widget-box',
					handle: ace.vars['touch'] ? '.widget-header' : false,
					cancel: '.fullscreen',
					opacity:0.8,
					revert:true,
					forceHelperSize:true,
					placeholder: 'widget-placeholder',
					forcePlaceholderSize:true,
					tolerance:'pointer',
					start: function(event, ui) {
						//when an element is moved, it's parent becomes empty with almost zero height.
						//we set a min-height for it to be large enough so that later we can easily drop elements back onto it
						ui.item.parent().css({'min-height':ui.item.height()})
						//ui.sender.css({'min-height':ui.item.height() , 'background-color' : '#F5F5F5'})
					},
					update: function(event, ui) {
						ui.item.parent({'min-height':''})
						//p.style.removeProperty('background-color');
					}
			    });
			
			});
		</script>

		<!-- the following scripts are used in demo only for onpage help and you don't need them -->
		<link rel="stylesheet" href="../assets/css/ace.onpage-help.css" />
		<link rel="stylesheet" href="../docs/assets/js/themes/sunburst.css" />

		<script type="text/javascript"> ace.vars['base'] = '..'; </script>
		<script src="../assets/js/ace/elements.onpage-help.js"></script>
		<script src="../assets/js/ace/ace.onpage-help.js"></script>
		<script src="../docs/assets/js/rainbow.js"></script>
		<script src="../docs/assets/js/language/generic.js"></script>
		<script src="../docs/assets/js/language/html.js"></script>
		<script src="../docs/assets/js/language/css.js"></script>
		<script src="../docs/assets/js/language/javascript.js"></script>
	</body>
</html>
