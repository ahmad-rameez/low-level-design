package lld.striver.trafficSignalSystem.controller;

import lld.striver.trafficSignalSystem.model.IntersectionRequest;
import lld.striver.trafficSignalSystem.model.IntersectionResponse;
import lld.striver.trafficSignalSystem.service.IntersectionService;

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
