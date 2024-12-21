package com.juniorjavaready.domain.offer;

import java.util.List;
import java.util.Optional;

public class JobOffersFacade {
    private JobOffersRepository jobOffersRepository;

    public List<JobOffers> findAllOffers() {
        return jobOffersRepository.fetchAllOffersAndSaveIfNotExists();
    }

    public Optional<JobOffers> findById(int id) throws JobNotFoundException {
        return jobOffersRepository.findJobOfferById(id);
    }

    public JobOffers saveJob(JobOffers jobOffers) {
        return JobOffers.builder()
                .id(jobOffers.id())
                .company(jobOffers.company())
                .position(jobOffers.position())
                .salary(jobOffers.salary())
                .offerUrl(jobOffers.offerUrl())
                .build();
    }
}
