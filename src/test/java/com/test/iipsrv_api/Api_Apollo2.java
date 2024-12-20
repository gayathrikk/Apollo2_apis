package com.test.iipsrv_api;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.util.LinkedHashMap;
import java.util.Map;
public class Api_Apollo2 {
	 private static final Map<String, String> ENDPOINT_LABELS = new LinkedHashMap<>();

	    static {
	    	ENDPOINT_LABELS.put("https://maps.googleapis.com/maps/api/mapsjs/gen_204?csp_test=true","gen_204?csp_test=true");
	    	ENDPOINT_LABELS.put("https://maps.googleapis.com/$rpc/google.internal.maps.mapsjs.v1.MapsJsInternalService/GetViewportInfo","GetViewportInfo");
	    	ENDPOINT_LABELS.put("https://www.google.com/maps/vt?pb=!1m4!1m3!1i18!2i189493!3i121528!1m4!1m3!1i18!2i189493!3i121529!1m4!1m3!1i18!2i189494!3i121528!1m4!1m3!1i18!2i189494!3i121529!1m4!1m3!1i18!2i189495!3i121528!1m4!1m3!1i18!2i189495!3i121529!2m3!1e0!2sm!3i715469347!2m3!1e2!2sspotlit!5i1!3m12!2sen!3sIN!5e289!12m4!1e68!2m2!1sset!2sRoadmap!12m3!1e37!2m1!1ssmartmaps!4e3!12m1!5b1!27m15!299174093m14!14m13!1m8!1m2!1y4202535197641361837!2y3999490297262107631!2s%2Fg%2F11tg7_yn99!4m2!1x129926501!2x802306756!15sgcid%3Aneurologist!2b0!3b0!6b0!8b0&client=google-maps-embed&token=84524","vt?pb=!1m4!1m3!1i18!2i189493!3i121528!1m4!1m3!1i18!2i189493!3i121529!1m4!1m3!1i18!2i189494!3i121528!1m4!1m3!1i18!2i189494!3i121529!1m4!1m3!1i18!2i189495!3i121528!1m4!1m3!1i18!2i189495!3i121529!2m3!1e0!2sm!3i715469347!2m3!1e2!2sspotlit!5i1!3m12!2sen!3sIN!5e289!12m4!1e68!2m2!1sset!2sRoadmap!12m3!1e37!2m1!1ssmartmaps!4e3!12m1!5b1!27m15!299174093m14!14m13!1m8!1m2!1y4202535197641361837!2y3999490297262107631!2s%2Fg%2F11tg7_yn99!4m2!1x129926501!2x802306756!15sgcid%3Aneurologist!2b0!3b0!6b0!8b0&client=google-maps-embed&token=84524");
	    	ENDPOINT_LABELS.put("https://maps.googleapis.com/$rpc/google.internal.maps.mapsjs.v1.MapsJsInternalService/GetViewportInfo","GetViewportInfo");
	    	ENDPOINT_LABELS.put("https://www.googleapis.com/identitytoolkit/v3/relyingparty/getProjectConfig?key=AIzaSyCOaPSsHtgZUIvapd4vLJ4OJcIIykakvjs&cb=1734421131262","getProjectConfig?key=AIzaSyCOaPSsHtgZUIvapd4vLJ4OJcIIykakvjs&cb=1734421131262");
	    	ENDPOINT_LABELS.put("https://www.googleapis.com/identitytoolkit/v3/relyingparty/getProjectConfig?key=AIzaSyCOaPSsHtgZUIvapd4vLJ4OJcIIykakvjs&cb=1734421132698","getProjectConfig?key=AIzaSyCOaPSsHtgZUIvapd4vLJ4OJcIIykakvjs&cb=1734421132698");
	    	ENDPOINT_LABELS.put("https://www.googleapis.com/identitytoolkit/v3/relyingparty/verifyAssertion?key=AIzaSyCOaPSsHtgZUIvapd4vLJ4OJcIIykakvjs","verifyAssertion?key=AIzaSyCOaPSsHtgZUIvapd4vLJ4OJcIIykakvjs");
	    	ENDPOINT_LABELS.put("https://www.googleapis.com/identitytoolkit/v3/relyingparty/getAccountInfo?key=AIzaSyCOaPSsHtgZUIvapd4vLJ4OJcIIykakvjs","getAccountInfo?key=AIzaSyCOaPSsHtgZUIvapd4vLJ4OJcIIykakvjs");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/CC/getLoginUser","getLoginUser");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/activities/Activity/","Activity");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/BR/getAnnotationTypesMin","getAnnotationTypesMin");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/analytics/listTags","listTags");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/analytics/allTags","allTags");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/CC/getLoginUser","getLoginUser");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/CC/getCCUserId","getCCUserId");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/analytics/getSearchHistory?user_id=185","getSearchHistory?user_id=185");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/analytics/getActivityHistory?user_id=185","getActivityHistory?user_id=185");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/CC/getDetailsOfSeriesStatsAllRestricted/100675352028486106357","100675352028486106357");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/analytics/saveSearchHistory","saveSearchHistory");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/analytics/tagsectionsearch","tagsectionsearch");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/analytics/tagbrainsearch","tagbrainsearch");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/analytics/tagAtlasSearch","tagAtlasSearch");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/analytics/tagtilesearch","tagtilesearch");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/analytics/tagOntologySearch","tagOntologySearch");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/analytics/getSearchHistory?user_id=185","getSearchHistory?user_id=185");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/atlas/describe_brain/?biosample=52","describe_brain/?biosample=52");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/analytics/saveActivityHistory","saveActivityHistory");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/analytics/getActivityHistory?user_id=185","getActivityHistory?user_id=185");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/activities/Activity/","Activity");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/analytics/saveActivityHistory","saveActivityHistory");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/analytics/getActivityHistory?user_id=185","getActivityHistory?user_id=185");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/GW/getBrainThumbNailDetails/IIT/V1/SS-15:10:52","SS-15:10:52");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/qc/SeriesSet/15/","15/");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/BR/AppAtlasRegisteration/","AppAtlasRegisteration");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/BR/AppAtlasRegisteration/?externalkey=FlatTree::IIT:V1:SS-15:10:52:52&annotationtype=6&userid=[object%20Object]","AppAtlasRegisteration/?externalkey=FlatTree::IIT:V1:SS-15:10:52:52&annotationtype=6&userid=[object%20Object]");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/BR/AppAtlasRegisteration/","AppAtlasRegisteration");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/BR/AppAtlasRegisteration/?externalkey=FlatTree::IIT:V1:SS-15:10:52:52&annotationtype=6&userid=[object%20Object]","AppAtlasRegisteration/?externalkey=FlatTree::IIT:V1:SS-15:10:52:52&annotationtype=6&userid=[object%20Object]");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/BR/AppAtlasRegisteration/","AppAtlasRegisteration");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/activities/Activity/","Activity");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/analytics/saveActivityHistory","saveActivityHistory");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/analytics/getActivityHistory?user_id=185","getActivityHistory?user_id=185");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/GW/getBrainThumbNailDetails/IIT/V1/SS-15:10:52","SS-15:10:52");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/GW/getBrainViewerDetails/IIT/V1/SS-15:10:52","SS-15:10:52");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/BR/AppAtlasRegisteration/","AppAtlasRegisteration");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/analytics/saveActivityHistory","saveActivityHistory");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/activities/Activity/","Activity");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/analytics/getActivityHistory?user_id=185","getActivityHistory?user_id=185");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/analytics/saveSearchHistory","saveSearchHistory");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/analytics/getSearchHistory?user_id=185","getSearchHistory?user_id=185");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/analytics/saveSearchHistory","saveSearchHistory");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/analytics/dbBrainQuery","dbBrainQuery");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/analytics/getSearchHistory?user_id=185","getSearchHistory?user_id=185");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/analytics/saveSearchHistory","saveSearchHistory");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/atlas/get_stats?query=medulla","get_stats?query=medulla");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/analytics/getSearchHistory?user_id=185","getSearchHistory?user_id=185");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/analytics/saveLlmFeedback","saveLlmFeedback");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/atlas/image_to_text_converter","image_to_text_converter");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/GW/getOntology/","getOntology");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/BR/getAnnotationTypesMin","getAnnotationTypesMin");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/dashboard/scanningSummaryReport/All","All");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/dashboard/queryAnnotateData","queryAnnotateData");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/dashboard/bugtrackerDetails","bugtrackerDetails");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/dashboard/queryActivites","queryActivites");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/dashboard/dashboardSubject","dashboardSubject");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/dashboard/dashboardOrganExtraction","dashboardOrganExtraction");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/dashboard/dashboardCryoProtection","dashboardCryoProtection");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/dashboard/dashboardCryoBlock","dashboardCryoBlock");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/dashboard/dashboardMRI","dashboardMRI");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/dashboard/dashboardImageQC","dashboardImageQC");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/dashboard/ManualRegistration","ManualRegistration");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/dashboard/AtlasCreation","AtlasCreation");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/dashboard/querySectionAnnotateData","querySectionAnnotateData");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/CC/getCCUserId","getCCUserId");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/CC/getDetailsOfSeriesStatsAllRestricted/100675352028486106357","100675352028486106357");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/dashboard/queryMyTask/185","185");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/dashboard/queryActivites","queryActivites");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/dashboard/updateAnnotateData","updateAnnotateData");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/dashboard/querySectionAnnotateData","querySectionAnnotateData");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/dashboard/scanningSummaryReport/All","All");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/dashboard/queryAnnotateData","queryAnnotateData");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/dashboard/updateSectionAnnotateData","updateSectionAnnotateData");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/dashboard/queryActivites","queryActivites");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/BR/getAnnotationTypesMin","getAnnotationTypesMin");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/dashboard/querySectionAnnotateData?bio=213&onto=189","querySectionAnnotateData?bio=213&onto=189");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/atlas/compareAtlasRegion","compareAtlasRegion");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/atlas/atlas_roi_viewer","atlas_roi_viewer");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/BR/getAnnotationTypesMin","getAnnotationTypesMin");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/dashboard/secByRegion","secByRegion");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/atlas/get_Atlasviewer","get_Atlasviewer");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/BR/getAnnotationTypesMin","getAnnotationTypesMin");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/atlas/growthShrinkage","growthShrinkage");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/atlas/plotRegions","plotRegions");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/atlas/growthShrinkageImages","growthShrinkageImages");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/BR/getAnnotationTypesMin","getAnnotationTypesMin");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/atlas/compareAtlasRegion","compareAtlasRegion");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/qc/getSectionData","getSectionData");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/atlas/get_post_autoqc","get_post_autoqc");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/GW/getBrainViewerDetails/IIT/V1/SS-16:12:442","SS-16:12:442");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/activities/Activity/","Activity");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/BR/getAnnotationTypesMin","getAnnotationTypesMin");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/CC/getDetailsOfSeriesStatsAllRestricted/100675352028486106357","100675352028486106357");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/CC/getCCUserId","getCCUserId");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/GW/getBrainThumbNailDetailsAtlas/IIT/V1/SS-16","SS-16");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/qc/saveSectionRGB","saveSectionRGB");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/BR/AppAtlasRegisteration/19644/","19644/");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/GW/getBrainThumbNailDetails/IIT/V1/SS-16:12:442","SS-16:12:442");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/CC/getCCUserId","getCCUserId");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/GW/getPins/16/12/442","442");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/BR/atlas_lockGetStatus","atlas_lockGetStatus");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/GW/getBrainViewerDetails/IIT/V1/SS-16:12:442","SS-16:12:442");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/BR/AppAnnotationType/","AppAnnotationType/");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/BR/getAnnotationTypesMin","getAnnotationTypesMin");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/GW/commentsLoad","commentsLoad");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/BR/AppAtlasRegisteration/?externalkey=Registration::IIT:V1:SS-16:12:442:442&annotationtype=197","AppAtlasRegisteration/?externalkey=Registration::IIT:V1:SS-16:12:442:442&annotationtype=197");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/GW/commentsLoad","commentsLoad");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/qc/queryBiosampleBySeries/16","16");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/CC/getDetailsOfSeriesStatsAllRestricted/100675352028486106357","100675352028486106357");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/CC/getCCUserId","getCCUserId");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/BR/AppAtlasRegisteration/?externalkey=Registration::IIT:V1:SS-16:12:442:442&annotationtype=197","AppAtlasRegisteration/?externalkey=Registration::IIT:V1:SS-16:12:442:442&annotationtype=197");
	    	ENDPOINT_LABELS.put("https://www.googleapis.com/identitytoolkit/v3/relyingparty/getAccountInfo?key=AIzaSyCOaPSsHtgZUIvapd4vLJ4OJcIIykakvjs","getAccountInfo?key=AIzaSyCOaPSsHtgZUIvapd4vLJ4OJcIIykakvjs");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/BR/AppAnnotationType/197/","197");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/GW/getBrainViewerDetails/IIT/V1/SS-16:12:433","SS-16:12:433");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/GW/getBrainViewerDetails/IIT/V1/SS-16:12:442","SS-16:12:442");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/qc/queryBiosampleBySeries/16","16");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/GW/getBrainThumbNailDetailsAtlas/IIT/V1/SS-16","SS-16");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/GW/commentsSave","commentsSave");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/BR/saveRegistration","saveRegistration");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/GW/getSectionAnnotatedDetails/IIT/V1/SS-16:-1:-1/1","1");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/GW/getBrainThumbNailDetails/IIT/V1/SS-16:-1:-1","SS-16:-1:-1");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/GW/getSignificantDetails/IIT/V1/SS-16:-1:-1/4","4");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/GW/getBrainThumbNailDetails/IIT/V1/SS-16:-1:-1","SS-16:-1:-1");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/analytics/datasets","datasets");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/analytics/saveBrainTags","saveBrainTags");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/qc/section_export_status/16/NISSL/412","412");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/qc/change_section_export_status/","change_section_export_status/");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/GW/getBrainThumbNailDetails/IIT/V1/SS-16:-1:-1","SS-16:-1:-1");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/GW/getBrainThumbNailDetails/IIT/V1/SS-100?public=1","SS-100?public=1");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/GW/getBrainViewerDetails/IIT/V1/SS-100:306:811","SS-100:306:811");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/GW/getBrainThumbNailDetails/IIT/V1/SS-100:306:811","SS-100:306:811");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/GW/getPublicBrains","getPublicBrains");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/CC/getCCUserId","getCCUserId");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/GW/commentsLoad","commentsLoad");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/BR/atlas_lockGetStatus","atlas_lockGetStatus");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/BR/AppAtlasRegisteration/?externalkey=FlatTree::IIT:V1:SS-100:306:811:811&annotationtype=6","AppAtlasRegisteration/?externalkey=FlatTree::IIT:V1:SS-100:306:811:811&annotationtype=6");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/BR/AppAtlasRegisteration/","AppAtlasRegisteration");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/BR/AppAnnotationType/","AppAnnotationType/");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/GW/getPins/100/306/811","811");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/BR/AppAnnotationType/6/","6/");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/BR/getappannotationalgorithm/6","6");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/BR/AppAtlasRegisteration/43751/","43751/");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/qc/queryBiosampleBySeries/100","100");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/GW/getBrainViewerDetails/IIT/V1/SS-65:199:1256","SS-65:199:1256");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/activities/getAtlasTimestamp/199/1256/Base%20Atlas","Base%20Atlas");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/BR/atlas_lock","atlas_lock");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/GW/commentsSave","commentsSave");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/activities/saveAtlasTimestamp","saveAtlasTimestamp");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/prediction/resolve_sliver","resolve_sliver");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/prediction/remove_overlap","remove_overlap");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/BR/AppAtlasRegisteration/53546/","53546");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/BR/AppAtlasRegisteration/53546/","53546");
	    	ENDPOINT_LABELS.put("https://www.googleapis.com/identitytoolkit/v3/relyingparty/getAccountInfo?key=AIzaSyCOaPSsHtgZUIvapd4vLJ4OJcIIykakvjs","getAccountInfo?key=AIzaSyCOaPSsHtgZUIvapd4vLJ4OJcIIykakvjs");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/BR/AppAtlasRegisteration/?externalkey=FlatTree::IIT:V1:SS-85:232:1627:1627&annotationtype=189","AppAtlasRegisteration/?externalkey=FlatTree::IIT:V1:SS-85:232:1627:1627&annotationtype=189");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/GW/getBrainThumbNailDetails/IIT/V1/SS-85:232:1627","SS-85:232:1627");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/GW/getBrainViewerDetails/IIT/V1/SS-85:232:1627","SS-85:232:1627");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/CC/getCCUserId","getCCUserId");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/GW/getPins/85/232/1627","1627");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/BR/atlas_lockGetStatus","atlas_lockGetStatus");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/GW/getBrainViewerDetails/IIT/V1/SS-85:232:1627","SS-85:232:1627");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/BR/AppAnnotationType/","AppAnnotationType");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/GW/commentsLoad","commentsLoad");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/qc/queryBiosampleBySeries/85","85");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/BR/AppAnnotationType/189/","189");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/BR/getappannotationalgorithm/189","189");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/BR/AppAnnotationType/189/","189");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/BR/getAnnotationTypesMin","getAnnotationTypesMin");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/GW/getBrainViewerDetails/IIT/V1/SS-85:232:1642","SS-85:232:1642");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/CC/getDetailsOfSeriesStatsAllRestricted/103441276790283502588","103441276790283502588");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/GW/getBrainThumbNailDetailsAtlas/IIT/V1/SS-85","SS-85");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/BR/atlas_lock","atlas_lock");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/BR/atlas_unlock","atlas_unlock");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/BR/AppAtlasRegisteration/53561/","53561");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/activities/getAtlasTimestamp/232/1642/Base%20Atlas","Base%20Atlas");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/activities/Activity","Activity");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/prediction/resolve_sliver","resolve_sliver");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/prediction/remove_overlap","remove_overlap");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/qc/querySectionBySeriesIDSectionNo/232/1633","1633");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/imaging_service/i2iregdev","i2iregdev");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/activities/saveAtlasTimestamp","saveAtlasTimestamp");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/atlas/annotationLabel_view","annotationLabel_view");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/BR/AppAtlasRegisteration/58262/","58262");
	    	ENDPOINT_LABELS.put("https://www.googleapis.com/identitytoolkit/v3/relyingparty/getAccountInfo?key=AIzaSyCOaPSsHtgZUIvapd4vLJ4OJcIIykakvjs","etAccountInfo?key=AIzaSyCOaPSsHtgZUIvapd4vLJ4OJcIIykakvjs");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/BR/AppAtlasRegisteration/?externalkey=PixelAnnotation::IIT:V1:SS-85:232:1660:1660&annotationtype=3","AppAtlasRegisteration/?externalkey=PixelAnnotation::IIT:V1:SS-85:232:1660:1660&annotationtype=3");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/GW/getBrainThumbNailDetails/IIT/V1/SS-85:232:1660","SS-85:232:1660");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/GW/getBrainViewerDetails/IIT/V1/SS-85:232:1660","SS-85:232:1660");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/CC/getCCUserId","getCCUserId");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/GW/getPins/85/232/1660","1600");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/BR/atlas_lockGetStatus","atlas_lockGetStatus");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/BR/AppAtlasRegisteration/58262/","58262");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/BR/getAnnotationTypesMin","getAnnotationTypesMin");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/GW/commentsLoad","commentsLoad");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/CC/getDetailsOfSeriesStatsAllRestricted/103441276790283502588","103441276790283502588");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/CC/getCCUserId","getCCUserId");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/BR/AppAtlasRegisteration/58262/","58262");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/BR/AppAnnotationType/3/","3");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/BR/getappannotationalgorithm/3","3");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/BR/AppAnnotationType/3/","3");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/qc/SeriesSet/85/","85");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/GW/listAnnotatedTiles","listAnnotatedTiles");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/GW/listWipTiles","listWipTiles");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/GW/listAGTiles","listAGTiles");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/GW/getBrainThumbNailDetailsAtlas/IIT/V1/SS-85","SS-85");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/BR/AppAnnotationType/","AppAnnotationType");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/BR/getappannotationalgorithm/3","3");
	    	ENDPOINT_LABELS.put("https://apollo2.humanbrain.in/BR/AppAnnotationType/3/","3");
	        
	    }

	    @Test
	    public void testAPIs() {
	        for (String endpoint : ENDPOINT_LABELS.keySet()) {
	            String endpointLabel = ENDPOINT_LABELS.get(endpoint);
	            Response response;

	            // Determine request type and send the request
	            if (isPostEndpoint(endpointLabel)) {
	                response = sendRequest("POST", endpoint, "{\"key\": \"value\"}");
	            } else {
	                response = sendRequest("GET", endpoint, null);
	            }

	            int statusCode = response.getStatusCode();
	            if (statusCode == 200) {
	                System.out.println("API request to " + endpointLabel + " passed. Status code: " + statusCode);
	            } else {
	                System.out.println("API request to " + endpointLabel + " failed. Status code: " + statusCode);
	                System.out.println("Response: " + response.getBody().asString());
	            }

	            // Assert that status code is 200
	            Assert.assertEquals(statusCode, 200, "API request to " + endpointLabel + " failed");
	        }
	    }

	    private boolean isPostEndpoint(String endpointLabel) {
	        // Define the labels that correspond to POST requests
	        
	        return	endpointLabel.equals("gen_204?csp_test=true") ||
	        		endpointLabel.equals("GetViewportInfo") ||
	        		endpointLabel.equals("vt?pb=!1m4!1m3!1i18!2i189493!3i121528!1m4!1m3!1i18!2i189493!3i121529!1m4!1m3!1i18!2i189494!3i121528!1m4!1m3!1i18!2i189494!3i121529!1m4!1m3!1i18!2i189495!3i121528!1m4!1m3!1i18!2i189495!3i121529!2m3!1e0!2sm!3i715469347!2m3!1e2!2sspotlit!5i1!3m12!2sen!3sIN!5e289!12m4!1e68!2m2!1sset!2sRoadmap!12m3!1e37!2m1!1ssmartmaps!4e3!12m1!5b1!27m15!299174093m14!14m13!1m8!1m2!1y4202535197641361837!2y3999490297262107631!2s%2Fg%2F11tg7_yn99!4m2!1x129926501!2x802306756!15sgcid%3Aneurologist!2b0!3b0!6b0!8b0&client=google-maps-embed&token=84524") ||
	        		endpointLabel.equals("GetViewportInfo") ||
	        		endpointLabel.equals("getProjectConfig?key=AIzaSyCOaPSsHtgZUIvapd4vLJ4OJcIIykakvjs&cb=1734421131262") ||
	        		endpointLabel.equals("getProjectConfig?key=AIzaSyCOaPSsHtgZUIvapd4vLJ4OJcIIykakvjs&cb=1734421132698") ||
	        		endpointLabel.equals("verifyAssertion?key=AIzaSyCOaPSsHtgZUIvapd4vLJ4OJcIIykakvjs") ||
	        		endpointLabel.equals("getAccountInfo?key=AIzaSyCOaPSsHtgZUIvapd4vLJ4OJcIIykakvjs") ||
	        		endpointLabel.equals("getLoginUser") ||
	        		endpointLabel.equals("Activity") ||
	        		endpointLabel.equals("getAnnotationTypesMin") ||
	        		endpointLabel.equals("listTags") ||
	        		endpointLabel.equals("allTags") ||
	        		endpointLabel.equals("getLoginUser") ||
	        		endpointLabel.equals("getCCUserId") ||
	        		endpointLabel.equals("getSearchHistory?user_id=185") ||
	        		endpointLabel.equals("getActivityHistory?user_id=185") ||
	        		endpointLabel.equals("100675352028486106357") ||
	        		endpointLabel.equals("saveSearchHistory") ||
	        		endpointLabel.equals("tagsectionsearch") ||
	        		endpointLabel.equals("tagbrainsearch") ||
	        		endpointLabel.equals("tagAtlasSearch") ||
	        		endpointLabel.equals("tagtilesearch") ||
	        		endpointLabel.equals("tagOntologySearch") ||
	        		endpointLabel.equals("getSearchHistory?user_id=185") ||
	        		endpointLabel.equals("describe_brain/?biosample=52") ||
	        		endpointLabel.equals("saveActivityHistory") ||
	        		endpointLabel.equals("getActivityHistory?user_id=185") ||
	        		endpointLabel.equals("Activity") ||
	        		endpointLabel.equals("saveActivityHistory") ||
	        		endpointLabel.equals("getActivityHistory?user_id=185") ||
	        		endpointLabel.equals("SS-15:10:52") ||
	        		endpointLabel.equals("15/") ||
	        		endpointLabel.equals("AppAtlasRegisteration") ||
	        		endpointLabel.equals("AppAtlasRegisteration/?externalkey=FlatTree::IIT:V1:SS-15:10:52:52&annotationtype=6&userid=[object%20Object]") ||
	        		endpointLabel.equals("AppAtlasRegisteration") ||
	        		endpointLabel.equals("AppAtlasRegisteration/?externalkey=FlatTree::IIT:V1:SS-15:10:52:52&annotationtype=6&userid=[object%20Object]") ||
	        		endpointLabel.equals("AppAtlasRegisteration") ||
	        		endpointLabel.equals("Activity") ||
	        		endpointLabel.equals("saveActivityHistory") ||
	        		endpointLabel.equals("getActivityHistory?user_id=185") ||
	        		endpointLabel.equals("SS-15:10:52") ||
	        		endpointLabel.equals("SS-15:10:52") ||
	        		endpointLabel.equals("AppAtlasRegisteration") ||
	        		endpointLabel.equals("saveActivityHistory") ||
	        		endpointLabel.equals("Activity") ||
	        		endpointLabel.equals("getActivityHistory?user_id=185") ||
	        		endpointLabel.equals("saveSearchHistory") ||
	        		endpointLabel.equals("getSearchHistory?user_id=185") ||
	        		endpointLabel.equals("saveSearchHistory") ||
	        		endpointLabel.equals("dbBrainQuery") ||
	        		endpointLabel.equals("getSearchHistory?user_id=185") ||
	        		endpointLabel.equals("saveSearchHistory") ||
	        		endpointLabel.equals("get_stats?query=medulla") ||
	        		endpointLabel.equals("getSearchHistory?user_id=185") ||
	        		endpointLabel.equals("saveLlmFeedback") ||
	        		endpointLabel.equals("image_to_text_converter") ||
	        		endpointLabel.equals("getOntology") ||
	        		endpointLabel.equals("getAnnotationTypesMin") ||
	        		endpointLabel.equals("All") ||
	        		endpointLabel.equals("queryAnnotateData") ||
	        		endpointLabel.equals("bugtrackerDetails") ||
	        		endpointLabel.equals("queryActivites") ||
	        		endpointLabel.equals("dashboardSubject") ||
	        		endpointLabel.equals("dashboardOrganExtraction") ||
	        		endpointLabel.equals("dashboardCryoProtection") ||
	        		endpointLabel.equals("dashboardCryoBlock") ||
	        		endpointLabel.equals("dashboardMRI") ||
	        		endpointLabel.equals("dashboardImageQC") ||
	        		endpointLabel.equals("ManualRegistration") ||
	        		endpointLabel.equals("AtlasCreation") ||
	        		endpointLabel.equals("querySectionAnnotateData") ||
	        		endpointLabel.equals("getCCUserId") ||
	        		endpointLabel.equals("100675352028486106357") ||
	        		endpointLabel.equals("185") ||
	        		endpointLabel.equals("queryActivites") ||
	        		endpointLabel.equals("updateAnnotateData") ||
	        		endpointLabel.equals("querySectionAnnotateData") ||
	        		endpointLabel.equals("All") ||
	        		endpointLabel.equals("queryAnnotateData") ||
	        		endpointLabel.equals("updateSectionAnnotateData") ||
	        		endpointLabel.equals("queryActivites") ||
	        		endpointLabel.equals("getAnnotationTypesMin") ||
	        		endpointLabel.equals("querySectionAnnotateData?bio=213&onto=189") ||
	        		endpointLabel.equals("compareAtlasRegion") ||
	        		endpointLabel.equals("atlas_roi_viewer") ||
	        		endpointLabel.equals("getAnnotationTypesMin") ||
	        		endpointLabel.equals("secByRegion") ||
	        		endpointLabel.equals("get_Atlasviewer") ||
	        		endpointLabel.equals("getAnnotationTypesMin") ||
	        		endpointLabel.equals("growthShrinkage") ||
	        		endpointLabel.equals("plotRegions") ||
	        		endpointLabel.equals("growthShrinkageImages") ||
	        		endpointLabel.equals("getAnnotationTypesMin") ||
	        		endpointLabel.equals("compareAtlasRegion") ||
	        		endpointLabel.equals("getSectionData") ||
	        		endpointLabel.equals("get_post_autoqc") ||
	        		endpointLabel.equals("SS-16:12:442") ||
	        		endpointLabel.equals("Activity") ||
	        		endpointLabel.equals("getAnnotationTypesMin") ||
	        		endpointLabel.equals("100675352028486106357") ||
	        		endpointLabel.equals("getCCUserId") ||
	        		endpointLabel.equals("SS-16") ||
	        		endpointLabel.equals("saveSectionRGB") ||
	        		endpointLabel.equals("19644/") ||
	        		endpointLabel.equals("SS-16:12:442") ||
	        		endpointLabel.equals("getCCUserId") ||
	        		endpointLabel.equals("442") ||
	        		endpointLabel.equals("atlas_lockGetStatus") ||
	        		endpointLabel.equals("SS-16:12:442") ||
	        		endpointLabel.equals("AppAnnotationType/") ||
	        		endpointLabel.equals("getAnnotationTypesMin") ||
	        		endpointLabel.equals("commentsLoad") ||
	        		endpointLabel.equals("AppAtlasRegisteration/?externalkey=Registration::IIT:V1:SS-16:12:442:442&annotationtype=197") ||
	        		endpointLabel.equals("commentsLoad") ||
	        		endpointLabel.equals("16") ||
	        		endpointLabel.equals("100675352028486106357") ||
	        		endpointLabel.equals("getCCUserId") ||
	        		endpointLabel.equals("AppAtlasRegisteration/?externalkey=Registration::IIT:V1:SS-16:12:442:442&annotationtype=197") ||
	        		endpointLabel.equals("getAccountInfo?key=AIzaSyCOaPSsHtgZUIvapd4vLJ4OJcIIykakvjs") ||
	        		endpointLabel.equals("197") ||
	        		endpointLabel.equals("SS-16:12:433") ||
	        		endpointLabel.equals("SS-16:12:442") ||
	        		endpointLabel.equals("16") ||
	        		endpointLabel.equals("SS-16") ||
	        		endpointLabel.equals("commentsSave") ||
	        		endpointLabel.equals("saveRegistration") ||
	        		endpointLabel.equals("1") ||
	        		endpointLabel.equals("SS-16:-1:-1") ||
	        		endpointLabel.equals("4") ||
	        		endpointLabel.equals("SS-16:-1:-1") ||
	        		endpointLabel.equals("datasets") ||
	        		endpointLabel.equals("saveBrainTags") ||
	        		endpointLabel.equals("412") ||
	        		endpointLabel.equals("change_section_export_status/") ||
	        		endpointLabel.equals("SS-16:-1:-1") ||
	        		endpointLabel.equals("SS-100?public=1") ||
	        		endpointLabel.equals("SS-100:306:811") ||
	        		endpointLabel.equals("SS-100:306:811") ||
	        		endpointLabel.equals("getPublicBrains") ||
	        		endpointLabel.equals("getCCUserId") ||
	        		endpointLabel.equals("commentsLoad") ||
	        		endpointLabel.equals("atlas_lockGetStatus") ||
	        		endpointLabel.equals("AppAtlasRegisteration/?externalkey=FlatTree::IIT:V1:SS-100:306:811:811&annotationtype=6") ||
	        		endpointLabel.equals("AppAtlasRegisteration") ||
	        		endpointLabel.equals("AppAnnotationType/") ||
	        		endpointLabel.equals("811") ||
	        		endpointLabel.equals("6/") ||
	        		endpointLabel.equals("6") ||
	        		endpointLabel.equals("43751/") ||
	        		endpointLabel.equals("100") ||
	        		endpointLabel.equals("SS-65:199:1256") ||
	        		endpointLabel.equals("Base%20Atlas") ||
	        		endpointLabel.equals("atlas_lock") ||
	        		endpointLabel.equals("commentsSave") ||
	        		endpointLabel.equals("saveAtlasTimestamp") ||
	        		endpointLabel.equals("resolve_sliver") ||
	        		endpointLabel.equals("remove_overlap") ||
	        		endpointLabel.equals("53546") ||
	        		endpointLabel.equals("53546") ||
	        		endpointLabel.equals("getAccountInfo?key=AIzaSyCOaPSsHtgZUIvapd4vLJ4OJcIIykakvjs") ||
	        		endpointLabel.equals("AppAtlasRegisteration/?externalkey=FlatTree::IIT:V1:SS-85:232:1627:1627&annotationtype=189") ||
	        		endpointLabel.equals("SS-85:232:1627") ||
	        		endpointLabel.equals("SS-85:232:1627") ||
	        		endpointLabel.equals("getCCUserId") ||
	        		endpointLabel.equals("1627") ||
	        		endpointLabel.equals("atlas_lockGetStatus") ||
	        		endpointLabel.equals("SS-85:232:1627") ||
	        		endpointLabel.equals("AppAnnotationType") ||
	        		endpointLabel.equals("commentsLoad") ||
	        		endpointLabel.equals("85") ||
	        		endpointLabel.equals("189") ||
	        		endpointLabel.equals("189") ||
	        		endpointLabel.equals("189") ||
	        		endpointLabel.equals("getAnnotationTypesMin") ||
	        		endpointLabel.equals("SS-85:232:1642") ||
	        		endpointLabel.equals("103441276790283502588") ||
	        		endpointLabel.equals("SS-85") ||
	        		endpointLabel.equals("atlas_lock") ||
	        		endpointLabel.equals("atlas_unlock") ||
	        		endpointLabel.equals("53561") ||
	        		endpointLabel.equals("Base%20Atlas") ||
	        		endpointLabel.equals("Activity") ||
	        		endpointLabel.equals("resolve_sliver") ||
	        		endpointLabel.equals("remove_overlap") ||
	        		endpointLabel.equals("1633") ||
	        		endpointLabel.equals("i2iregdev") ||
	        		endpointLabel.equals("saveAtlasTimestamp") ||
	        		endpointLabel.equals("annotationLabel_view") ||
	        		endpointLabel.equals("58262") ||
	        		endpointLabel.equals("etAccountInfo?key=AIzaSyCOaPSsHtgZUIvapd4vLJ4OJcIIykakvjs") ||
	        		endpointLabel.equals("AppAtlasRegisteration/?externalkey=PixelAnnotation::IIT:V1:SS-85:232:1660:1660&annotationtype=3") ||
	        		endpointLabel.equals("SS-85:232:1660") ||
	        		endpointLabel.equals("SS-85:232:1660") ||
	        		endpointLabel.equals("getCCUserId") ||
	        		endpointLabel.equals("1600") ||
	        		endpointLabel.equals("atlas_lockGetStatus") ||
	        		endpointLabel.equals("58262") ||
	        		endpointLabel.equals("getAnnotationTypesMin") ||
	        		endpointLabel.equals("commentsLoad") ||
	        		endpointLabel.equals("103441276790283502588") ||
	        		endpointLabel.equals("getCCUserId") ||
	        		endpointLabel.equals("58262") ||
	        		endpointLabel.equals("3") ||
	        		endpointLabel.equals("3") ||
	        		endpointLabel.equals("3") ||
	        		endpointLabel.equals("85") ||
	        		endpointLabel.equals("listAnnotatedTiles") ||
	        		endpointLabel.equals("listWipTiles") ||
	        		endpointLabel.equals("listAGTiles") ||
	        		endpointLabel.equals("SS-85") ||
	        		endpointLabel.equals("AppAnnotationType") ||
	        		endpointLabel.equals("3") ||
	        		endpointLabel.equals("3");
	    }

	    private Response sendRequest(String method, String endpoint, String body) {
	        RequestSpecification request = RestAssured.given()
	                .header("Content-Type", "application/json");

	        if (body != null) {
	            request.body(body);
	        }

	        switch (method.toUpperCase()) {
	            case "POST":
	                return request.post(endpoint);
	            case "GET":
	                return request.get(endpoint);
	            default:
	                throw new IllegalArgumentException("Unsupported request method: " + method);
	        }
	    }
	}