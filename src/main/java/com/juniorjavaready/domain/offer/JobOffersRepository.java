package com.juniorjavaready.domain.offer;

import java.util.ArrayList;
import java.util.List;

public class JobOffersRepository {

    List<JobOffers> jobOffers = new ArrayList<>();
    JobOffers saveJobOffers(JobOffers jobOffers) {
        return JobOffers.builder()
                        .id(jobOffers.id())
                        .company(jobOffers.company())
                        .position(jobOffers.position())
                        .offerUrl(jobOffers.offerUrl())
                        .build();
    }

    List<JobOffers> findAllJobOffers() {
        return jobOffers.stream()
                .toList();
    }

    public JobOffers findJobOfferById(int id) throws JobNotFoundException {
        return jobOffers.stream()
                .filter(jobOffer -> jobOffer.id() == id)
                .findFirst()
                .orElseThrow(() -> new JobNotFoundException("Oferta pracy o id " + id + " nie istnieje."));
    }

    List<JobOffers> fetchAllOffersAndSaveIfNotExists() {
        return List.of();
    }

}
