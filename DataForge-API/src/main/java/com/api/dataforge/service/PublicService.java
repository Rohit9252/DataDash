package com.api.dataforge.service;

import reactor.core.publisher.Mono;

public interface PublicService {

    public Mono<?> getPubParcels();
    public Mono<?> getParcelById(String id);
    public Mono<?> getParcelByIdAssessments(String id);
    public Mono<?> getParcelByIdTransactions(String id);
    public Mono<?> getPubAssessments();
    public Mono<?> getPubTransactions();

}
