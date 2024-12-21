package com.juniorjavaready.domain.offer;

import lombok.Builder;

@Builder
public record JobOffers(String id,
        String company,
        String position,
        String salary,
        String offerUrl ) {
}
