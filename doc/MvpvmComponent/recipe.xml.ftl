<?xml version="1.0"?>
<recipe>
    <#include "../common/recipe_manifest.xml.ftl" />

	<#if !appCompat && !(hasDependency('com.android.support:support-v4'))>
	        <dependency mavenUrl="com.android.support:support-v4:${buildApi}.+"/>
	    </#if>

	<#if appCompat && !(hasDependency('com.android.support:appcompat-v7'))>
	       <dependency mavenUrl="com.android.support:appcompat-v7:${buildApi}.+" />
	</#if>

	<#if (buildApi gte 22) && appCompat && !(hasDependency('com.android.support:design'))>
	    <dependency mavenUrl="com.android.support:design:${buildApi}.+" />
	</#if>

	<!-- 处理模版 -->
	<instantiate from="root/src/app_package/MvpActivity.java.ftl"
     	to="${escapeXmlAttribute(srcOut)}/view/${activityClass}Activity.java" />

	<instantiate from="root/src/app_package/MvpView.java.ftl"
     	to="${escapeXmlAttribute(srcOut)}/view/I${activityClass}View.java" />

	<instantiate from="root/src/app_package/MvpIPresenter.java.ftl"
     	to="${escapeXmlAttribute(srcOut)}/presenter/I${activityClass}Presenter.java" />

	<instantiate from="root/src/app_package/MvpPresenter.java.ftl"
     	to="${escapeXmlAttribute(srcOut)}/presenter/${activityClass}Presenter.java" />

	<instantiate from="root/src/app_package/MvpIViewModel.java.ftl"
     	to="${escapeXmlAttribute(srcOut)}/model/viewmodel/I${activityClass}ViewModel.java" />

	<instantiate from="root/src/app_package/MvpViewModel.java.ftl"
     	to="${escapeXmlAttribute(srcOut)}/model/viewmodel/${activityClass}ViewModel.java" />

	<instantiate from="root/src/app_package/MvpListener.java.ftl"
     	to="${escapeXmlAttribute(srcOut)}/model/listener/On${activityClass}Listener.java" />

	<instantiate from="root/src/app_package/MvpRepository.java.ftl"
     	to="${escapeXmlAttribute(srcOut)}/model/repository/${activityClass}RepositoryImpl.java" />

	<instantiate from="root/src/app_package/MvpIRepository.java.ftl"
     	to="${escapeXmlAttribute(srcOut)}/model/repository/I${activityClass}Repository.java" />
     	
	<instantiate from="root/src/app_package/MvpModel.java.ftl"
     	to="${escapeXmlAttribute(srcOut)}/model/data/${activityClass}Model.java" />

	<instantiate from="root/res/layout/activity_mvp.xml.ftl"
		to="${escapeXmlAttribute(resOut)}/layout/${activityLayoutName}.xml" />

	<!-- 打开模版 -->
	<open file="${escapeXmlAttribute(resOut)}/layout/${activityLayoutName}.xml"/>        

 	<open file="${escapeXmlAttribute(srcOut)}/view/${activityClass}Activity.java" />

 	<open file="${escapeXmlAttribute(srcOut)}/view/I${activityClass}View.java" />

 	<open file="${escapeXmlAttribute(srcOut)}/presenter/I${activityClass}Presenter.java" />

 	<open file="${escapeXmlAttribute(srcOut)}/presenter/${activityClass}Presenter.java" />

 	<open file="${escapeXmlAttribute(srcOut)}/model/viewmodel/I${activityClass}ViewModel.java" />

 	<open file="${escapeXmlAttribute(srcOut)}/model/viewmodel/${activityClass}ViewModel.java" />

 	<open file="${escapeXmlAttribute(srcOut)}/model/listener/On${activityClass}Listener.java" />

 	<open file="${escapeXmlAttribute(srcOut)}/mode/repository/I${activityClass}Repository.java" />

 	<open file="${escapeXmlAttribute(srcOut)}/mode/repository/${activityClass}Repository.java" />

 	<open file="${escapeXmlAttribute(srcOut)}/model/data/${activityClass}Model.java" />

</recipe>
