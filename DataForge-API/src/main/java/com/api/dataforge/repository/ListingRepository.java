package com.api.dataforge.repository;

import com.api.dataforge.entity.ListingDocument;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ListingRepository extends MongoRepository<ListingDocument, String> {


}
