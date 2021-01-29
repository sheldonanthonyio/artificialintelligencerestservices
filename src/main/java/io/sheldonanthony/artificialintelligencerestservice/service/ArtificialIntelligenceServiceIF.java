package io.sheldonanthony.artificialintelligencerestservice.service;
import io.sheldonanthony.artificialintelligencerestservice.dtos.DetectAndTraceFacesRequest;
import io.sheldonanthony.artificialintelligencerestservice.dtos.DetectAndTraceFacesResponse;
import io.sheldonanthony.artificialintelligencerestservice.dtos.DetectFacesRequest;
import io.sheldonanthony.artificialintelligencerestservice.dtos.DetectFacesResponse;
import io.sheldonanthony.artificialintelligencerestservice.dtos.DetectIfFacesAreWearingMasksRequest;
import io.sheldonanthony.artificialintelligencerestservice.dtos.DetectIfFacesAreWearingMasksResponse;
import io.sheldonanthony.artificialintelligencerestservice.dtos.Ping;

public interface ArtificialIntelligenceServiceIF{

	Ping ping();
	
	DetectFacesResponse detectFaces(DetectFacesRequest detectFacesRequest);
	
	DetectAndTraceFacesResponse detectAndTraceFaces(DetectAndTraceFacesRequest 
			detectAndTraceFacesRequest);
	
	DetectIfFacesAreWearingMasksResponse detectIfFaceWearingMask(DetectIfFacesAreWearingMasksRequest 
			detectIfFacesAreWearingMasksRequest); 
}
