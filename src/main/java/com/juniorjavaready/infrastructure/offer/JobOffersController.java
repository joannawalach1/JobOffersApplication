package com.juniorjavaready.infrastructure.offer;

import com.juniorjavaready.domain.offer.JobNotFoundException;
import com.juniorjavaready.domain.offer.JobOffers;
import com.juniorjavaready.domain.offer.JobOffersFacade;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/offers")
public class JobOffersController {
    private JobOffersFacade jobOffersFacade;

    @GetMapping
    public List<JobOffers> getJobOffers() {
        return jobOffersFacade.findAllOffers();
    }

    @GetMapping("/{id}")
    public JobOffers getJobOfferById(@RequestParam int id) throws JobNotFoundException {
        return jobOffersFacade.findById(id);
    }

    @PostMapping
    public JobOffers createJobOffer(@RequestBody JobOffers jobOffers) {
        return jobOffersFacade.saveJob(jobOffers);
    }
}
