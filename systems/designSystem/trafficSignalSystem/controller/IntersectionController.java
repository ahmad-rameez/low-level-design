package designSystem.trafficSignalSystem.controller;

import designSystem.trafficSignalSystem.model.IntersectionRequest;
import designSystem.trafficSignalSystem.model.IntersectionResponse;
import designSystem.trafficSignalSystem.service.IntersectionService;

public class IntersectionController {
    private final IntersectionService intersectionService;

    public IntersectionController(IntersectionService intersectionService) {
        this.intersectionService = intersectionService;
    }

    public IntersectionResponse createIntersection(IntersectionRequest request) {
        System.out.println("Creating Intersection");
        return intersectionService.createIntersection(request);
    }
}
