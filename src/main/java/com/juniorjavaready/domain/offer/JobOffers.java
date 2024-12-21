package com.juniorjavaready.domain.offer;

import lombok.Builder;

@Builder
public record JobOffers(int id,
        String company,
        String position,
        String salary,
        String offerUrl ) {
}
