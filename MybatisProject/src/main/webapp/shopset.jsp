<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html lang="zh-cn" xmlns="http://www.w3.org/1999/xhtml">
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- 上述3个meta标签##必须##放在最前面，任何其他内容都##必须##跟随其后！ -->
<title>个人中心-中介机构-店铺设置页面</title>
<script type="text/javascript" type="text/javascript">
	var sys = sys || {};
	sys.rootPath = "${ctx}";
	sys.pageNum = 10;
	sys.gridStyle = "Bootstrap";
</script>
<!-- Bootstrap -->
<!-- Bootstrap -->
<link rel="stylesheet" type="text/css"
	href="${resourceRoot }/js/bootstrap-3.3.7/css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css"
	href="${resourceRoot }/css/user-info.css">
<link rel="stylesheet" type="text/css"
	href="${resourceRoot }/css/subAccount/subAccount.css" />
	<link rel="stylesheet" type="text/css"
	href="${resourceRoot }/css/shop/shopset.css" />
</head>

<script src="${resourceRoot }/js/jquery-1.12.4/jquery-1.12.4.min.js"></script>
<script src="${resourceRoot }/js/layer-v3.0.3/layer/layer.js"></script>
<script src="${resourceRoot }/js/shop/shopset.js"></script>

<body>
	<br />

	<div class="content"
		style="width: 930px;height: 100%;border: 1px solid #BFBFBF;float: left;margin-left: 20px;">
		<h3
			style="height: 50px;line-height: 50px;border-bottom: 1px solid #CCCCCC;padding-left: 30px;font-size: 20px;">店铺设置</h3>
			
			
			
		<div class="row" style="margin: 20px;">
		    <div class="col-xs-6">
				<div class="col-xs-4">
					<p class="text-right">企业名称</p>
				</div>
				<div class="col-xs-8">
					<input type="text" class="form-control" name="" id="" readOnly/>
				</div>
			</div>
		</div>
		
		
		
		<form id="shopsetform" name="shopsetform" method="post">
			<div>

				<div class="row" style="margin: 20px;">
					<div class="col-xs-6">
						<div class="col-xs-4">
							<p class="text-right">店铺介绍:</p>
						</div>
						<div class="col-xs-8">
							<textarea rows="10" cols="38" name="dpjs"></textarea>
						</div>
					</div>
				</div>
				
				<div class="row" style="margin: 20px;">
					<div class="col-xs-6">
						<div class="col-xs-4">
							<p class="text-right">点击上传企业logo</p>
						</div>
						<p class="text-left" style="padding-left: 30px;panding-bottom:20px">图片尺寸180*180<br/>格式为jpg或png
						</p>
					</div>
				</div>
				
				
				
				
				
				<div class="row" style="margin: 20px;">
					<div class="col-xs-6">
						<div class="col-xs-4">
							<p class="text-right">从业年限</p>
						</div>
						<div class="col-xs-8">
							<c:if test="${not empty cynxList}">
								<select class="form-control" id="cynx" name="cynx">
									<c:forEach items="${cynxList}" var="data" varStatus="status">
										<c:if test="${data.cynxDm == '100' }">
											<option value="${data.cynxDm}" selected="selected">${data.cynxMc}
											</option>
										</c:if>

										<c:if test="${data.cynxDm != '100' }">
											<option value="${data.cynxDm}">${data.cynxMc}</option>
										</c:if>
									</c:forEach>
								</select>
							</c:if>
						</div>
					</div>
				</div>
				
				
				
				
 			   <div class="row" style="margin: 20px;"> 
					<div class="col-xs-6"> 
 						<div class="col-xs-4"> 
							<p class="text-right">服务行业:</p> 
						</div> 
						
<!-- 						<input name="fwhy" type="checkbox" value="${data.fwhyDm }">${data.fwhyMc}  -->
						
						<table>
						  
						      <c:if test="${not empty fwhyList}"> 
							   <c:forEach items="${fwhyList}" var="data" varStatus="status">
							         <c:if test="${status.index % 4 ==0 }"> 
							         <tr>
							         </c:if>
							            <td>
							               <input id="boxfwhy_${data.fwhyDm } name="fwhy" type="checkbox" value="${data.fwhyDm }">${data.fwhyMc}
							            </td>
							         <c:if test="${(status.index+1) % 4 ==0}">
							         </tr>
							         </c:if>
								</c:forEach>
<!-- 								 <c:forEach items="${fwhyList}" var="data" varStatus="status" begin="1" step="4">  -->
<!-- 							         <tr><td>${data.fwhyMc} </td></tr> -->
<!-- 								</c:forEach>   -->
<!-- 								<c:forEach items="${fwhyList}" var="data" varStatus="status" begin="1" step="4">  -->
<!-- 							         <td>${data.fwhyMc} </td> -->
<!-- 								</c:forEach>  -->
						     </c:if> 
						    
						</table>
						
<!-- 						 <ul> -->
				              
<!-- 			               <c:if test="${not empty fwhyList}">  -->
<!-- 							   <c:forEach items="${fwhyList}" var="data" varStatus="status">  -->
<!-- 								    <li style="list-style: none;"> -->
<!-- 										<input name="fwhy" type="checkbox" value="${data.fwhyDm }">${data.fwhyMc}   -->
<!-- 									  </li> -->
<!-- 								</c:forEach>  -->
<!-- 						   </c:if>  -->
				             
<!-- 				         </ul> -->
							
 					</div> 
				</div> 
				
				
				
				
				
				 <div class="row" style="margin: 20px;">
					<div class="col-xs-6">
						<div class="col-xs-4">
							<p class="text-right">服务营收规模:</p>
						</div>
						<div class="col-xs-8">
							<c:if test="${not empty fwysgmList}">
								   <c:forEach items="${fwysgmList}" var="data" varStatus="status">
										<input id="boxysgm_${data.fwysgmDm } name="ysgm" type="checkbox" value="${data.fwysgmDm }">${data.fwysgmMc} <br/>
									</c:forEach>
							</c:if>
						</div>
					</div>
				</div>
				
				
				<div class="row" style="margin: 20px;">

					<div class="col-xs-6">
						<div class="col-xs-4">
							<p class="text-right">资质展示:</p>
						</div>
<!-- 						<div class="col-xs-8"> -->
<!-- 							<a href="javascript:void(0)" onclick="agreeContent();">选择代理范围</a> -->
<!-- 						</div> -->
					</div>
				</div>
				
				
				<br/>
				<div class="col-xs-8">
					<div class="col-xs-4"></div>
					<div class="col-xs-4">
						<a href="#">
							<button type="button" onclick="submitShopSetForm();"
								class="btn btn-primary" style="width: 120px;">确定</button>
						</a>
					</div>
					<div class="col-xs-4"></div>
					<div class="col-xs-4">
						<a href="#">
							<button type="button" onclick="reset();"
								class="btn" style="width: 120px;">取消</button>
						</a>
					</div>
				</div>
				<br />
			</div>
		</form>
	</div>

</body>


</html>